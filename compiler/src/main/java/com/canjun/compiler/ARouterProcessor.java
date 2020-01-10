package com.canjun.compiler;

import com.canjun.annotation.ARouter;
import com.google.auto.service.AutoService;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedOptions;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;

/**
 * ARouterProcessor
 *
 * @author zfc
 * @date 2020-01-10
 */

@AutoService(Processor.class)
@SupportedAnnotationTypes({"com.canjun.annotation.ARouter"})
@SupportedSourceVersion(SourceVersion.RELEASE_7)
@SupportedOptions({"content"})
public class ARouterProcessor extends AbstractProcessor {

    private Elements elementUtils;
    private Types typeUtils;
    private Messager messager;
    private Filer filer;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        elementUtils = processingEnv.getElementUtils();
        typeUtils = processingEnv.getTypeUtils();
        messager = processingEnv.getMessager();
        filer = processingEnv.getFiler();
        Map<String, String> options = processingEnv.getOptions();
        String content = options.get("content");
        messager.printMessage(Diagnostic.Kind.NOTE, content);
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
       if(annotations==null||annotations.isEmpty()){
           return false;
       }

       //获取被ARouter注解的类
        Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith(ARouter.class);

       for (Element e : elements){
           //获取e的包名
           String pkgName = elementUtils.getPackageOf(e).getQualifiedName().toString();
           //获取类名
           String className = e.getSimpleName().toString();

           String newFileName = className+"$$ARouter";
           //通过javaPoet写新生成的文件
           //javaPoet项目地址https://github.com/square/javapoet


           /*
           package com.canjun.myapplication;
           public class MainActivity$$ARouter {

               public static Class findTargetClass(String name){
                   if(name.equalsIgnoreCase("/app/MainActivity")){
                       return MainActivity.class;
                   }
                   return null;
               }
           }*/
           try {
               String pathName = e.getAnnotation(ARouter.class).path();
               MethodSpec methodSpec = MethodSpec.methodBuilder("findTargetClass")
                       .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                       .returns(Class.class)
                       .addParameter(String.class, "name")
                       .addStatement(" if(name.equalsIgnoreCase($S)){\n" +
                               "                       return $T.class;\n" +
                               "                   }\n" +
                               "                   return null", pathName, ClassName.get((TypeElement)e))
                       .build();

               TypeSpec typeSpec = TypeSpec.classBuilder(newFileName)
                       .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                       .addMethod(methodSpec)
                       .build();

               JavaFile javaFile = JavaFile.builder(pkgName,typeSpec)
                       .build();


               javaFile.writeTo(filer);
           } catch (IOException ex) {
               ex.printStackTrace();
           }
       }

        return true;
    }

}

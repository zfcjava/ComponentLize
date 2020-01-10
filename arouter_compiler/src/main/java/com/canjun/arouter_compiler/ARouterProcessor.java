package com.canjun.arouter_compiler;

import com.google.auto.service.AutoService;

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
@SupportedAnnotationTypes({Constant.AnnotationTypes})
@SupportedSourceVersion(SourceVersion.RELEASE_7)
@SupportedOptions("content")
public class ARouterProcessor extends AbstractProcessor {

    /**
     * 操作Element的工具类
     */
    private Elements elementUtils;

    /**
     * 类信息工具类
     */
    private Types typesUtils;

    /**
     * 日志信息输出工具类
     */
    private Messager messager;

    /**
     * 文件生成器
     */
    private Filer filer;

    //初始化工作
    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        elementUtils = processingEnv.getElementUtils();
        typesUtils = processingEnv.getTypeUtils();
        messager = processingEnv.getMessager();
        filer = processingEnv.getFiler();

        //可以获取外部模块传入的参数
        //传参方式见下小结
        String content = processingEnv.getOptions().get("content");
        messager.printMessage(Diagnostic.Kind.NOTE,content);
    }


    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return false;
    }
}

package com.canjun.arouter_annotation;

import javax.lang.model.element.Element;

/**
 * RouterBean
 *
 * @author zfc
 * @date 2020-01-10
 */
public class RouterBean {

    enum Type{
        ACTIVITY
    }

    private Type type;

    private Element element;

    private Class clazz;

    private String path;

    private String group;

    private RouterBean(){}

    private RouterBean(Class clazz, String path, String group) {
        this.clazz = clazz;
        this.path = path;
        this.group = group;
    }

    public static RouterBean create(Class clazz, String path, String group) {
        return new RouterBean(clazz, path, group);
    }

    public Type getType() {
        return type;
    }

    public Element getElement() {
        return element;
    }

    public Class getClazz() {
        return clazz;
    }

    public String getPath() {
        return path;
    }

    public String getGroup() {
        return group;
    }

    public static class Builder {

        private Class clazz;

        private String path;

        private String group;


        public Builder setClazz(Class clazz) {
            this.clazz = clazz;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setGroup(String group) {
            this.group = group;
            return this;
        }


        public RouterBean build(){
            return new RouterBean(clazz,path,group);
        }
    }
}

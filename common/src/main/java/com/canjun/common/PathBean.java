package com.canjun.common;

/**
 * PathBean
 *
 * 记录Activity字节码及其路径
 * 例如
 *      path:'order/OrderMainActivity'
 *      clzz: OrderMainActivity.class
 *
 * @author zfc
 * @date 2020-01-09
 */
public class PathBean {

    private String path;

    private Class clzz;

    public PathBean(String path, Class clzz) {
        this.path = path;
        this.clzz = clzz;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Class getClzz() {
        return clzz;
    }

    public void setClzz(Class clzz) {
        this.clzz = clzz;
    }
}

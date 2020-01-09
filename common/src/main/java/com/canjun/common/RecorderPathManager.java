package com.canjun.common;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RecorderPathManager
 * 记录全局的path信息
 *
 * @author zfc
 * @date 2020-01-09
 */
public class RecorderPathManager {

    private static Map<String, List<PathBean>> paths = new HashMap<>();

    /**
     * 根据组名和路径名记录字节码信息
     * @param groupName
     * @param pathName
     * @param clazz
     */
    public static void joinGroup(String groupName,String pathName,Class clazz){
        List<PathBean> path = paths.get(groupName);
        if(path==null){
            //添加
            path = new ArrayList<>();
            paths.put(groupName,path);
        }else {
            for (PathBean p: path){
                if(p.getPath().equals(pathName)){
                    return;
                }
            }
        }
        path.add(new PathBean(pathName,clazz));
    }

    /**
     * 获取目标字节码对象
     * @param groupName 组名
     * @param pathName 路径名
     * @return
     */
    public static Class getTargetClass(String groupName,String pathName){
        List<PathBean> path = paths.get(groupName);
        if(path==null){
            return null;
        }
        for (PathBean p: path){
            if(p.getPath().equals(pathName)){
                return p.getClzz();
            }
        }

        return null;
    }
}

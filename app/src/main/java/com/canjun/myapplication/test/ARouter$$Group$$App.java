package com.canjun.myapplication.test;

import com.canjun.arouter_api.ARouterLoadGroup;
import com.canjun.arouter_api.ARouterLoadPath;

import java.util.HashMap;

/**
 * ARouter$$Group$$App
 *
 * @author zfc
 * @date 2020-01-10
 */
public class ARouter$$Group$$App implements ARouterLoadGroup {

    @Override
    public HashMap<String, Class<? extends ARouterLoadPath>> loadGroup() {
        HashMap<String, Class<? extends ARouterLoadPath>> map = new HashMap<>();
        //初始化appGroup
        map.put("app", ARouter$$Path$$App.class);
        return map;
    }
}

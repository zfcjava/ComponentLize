package com.canjun.myapplication.test;

import java.util.HashMap;

import com.canjun.arouter_api.ARouterLoadGroup;
import com.canjun.arouter_api.ARouterLoadPath;

/**
 * ARouter$$Group$$Order
 *
 * @author zfc
 * @date 2020-01-10
 */
public class ARouter$$Group$$Order implements ARouterLoadGroup {

    @Override
    public HashMap<String, Class<? extends ARouterLoadPath>> loadGroup() {
        HashMap<String, Class<? extends ARouterLoadPath>> map = new HashMap<>();
        //初始化appGroup
        map.put("order", ARouter$$Path$$Order.class);
        return map;
    }
}

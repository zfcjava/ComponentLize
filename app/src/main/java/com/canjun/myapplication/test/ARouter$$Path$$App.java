package com.canjun.myapplication.test;

import com.canjun.arouter_annotation.RouterBean;
import com.canjun.arouter_api.ARouterLoadPath;
import com.canjun.myapplication.MainActivity;

import java.util.HashMap;

/**
 * ARouter$$Path$$App
 *
 * @author zfc
 * @date 2020-01-10
 */
public class ARouter$$Path$$App implements ARouterLoadPath {

    @Override
    public HashMap<String, RouterBean> loadPath() {
        HashMap<String, RouterBean> map = new HashMap<>();

        //加入/app/MainActivity
        map.put("/app/MainActivity",
                RouterBean.create(MainActivity.class,
                        "/app/MainActivity",
                        "app"));

//        map.put("/app/ScanActivity",
//                RouterBean.create(MainActivity.class,
//                        "/app/ScanActivity",
//                        "app"));

        return map;
    }
}

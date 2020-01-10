package com.canjun.myapplication.test;

import java.util.HashMap;

import com.canjun.arouter_annotation.RouterBean;
import com.canjun.arouter_api.ARouterLoadPath;
import com.canjun.myapplication.MainActivity;
import com.canjun.personal.PersonalMainActivity;

/**
 * ARouter$$Path$$Personal
 *
 * @author zfc
 * @date 2020-01-10
 */
public class ARouter$$Path$$Personal implements ARouterLoadPath {

    @Override
    public HashMap<String, RouterBean> loadPath() {
        HashMap<String, RouterBean> map = new HashMap<>();

        //加入/app/MainActivity
        map.put("/personal/PersonalMainActivity",
                RouterBean.create(PersonalMainActivity.class,
                        "/personal/PersonalMainActivity",
                        "personal"));

//        map.put("/app/ScanActivity",
//                RouterBean.create(MainActivity.class,
//                        "/app/ScanActivity",
//                        "app"));

        return map;
    }
}

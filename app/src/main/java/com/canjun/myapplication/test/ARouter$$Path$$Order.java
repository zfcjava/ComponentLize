package com.canjun.myapplication.test;

import java.util.HashMap;

import com.canjun.arouter_annotation.RouterBean;
import com.canjun.arouter_api.ARouterLoadPath;
import com.canjun.myapplication.MainActivity;
import com.canjun.order.OrderMainActivity;

/**
 * ARouter$$Path$$Order
 *
 * @author zfc
 * @date 2020-01-10
 */
public class ARouter$$Path$$Order implements ARouterLoadPath {

    @Override
    public HashMap<String, RouterBean> loadPath() {
        HashMap<String, RouterBean> map = new HashMap<>();

        //加入/app/MainActivity
        map.put("/order/OrderMainActivity",
                RouterBean.create(OrderMainActivity.class,
                        "/order/OrderMainActivity",
                        "order"));

//        map.put("/app/ScanActivity",
//                RouterBean.create(MainActivity.class,
//                        "/app/ScanActivity",
//                        "app"));

        return map;
    }
}

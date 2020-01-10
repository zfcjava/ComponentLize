package com.canjun.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.canjun.arouter_annotation.ARouter;
import com.canjun.arouter_annotation.RouterBean;
import com.canjun.arouter_api.ARouterLoadGroup;
import com.canjun.arouter_api.ARouterLoadPath;
import com.canjun.common.RecorderPathManager;
import com.canjun.myapplication.test.ARouter$$Group$$Order;
import com.canjun.myapplication.test.ARouter$$Group$$Personal;
import com.canjun.order.OrderMainActivity;

import java.util.HashMap;


@ARouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpOrder(View v){

        ARouterLoadGroup group = new ARouter$$Group$$Order();
        HashMap<String, Class<? extends ARouterLoadPath>> groupMap = group.loadGroup();

        Class<? extends ARouterLoadPath> orderClazz = groupMap.get("order");

        try {
            ARouterLoadPath loadPath = orderClazz.newInstance();
            HashMap<String, RouterBean> pathMap = loadPath.loadPath();
            RouterBean routerBean = pathMap.get("/order/OrderMainActivity");

            if (routerBean != null) {
                startActivity(new Intent(this, routerBean.getClazz()));
            }
        } catch (IllegalAccessException e) {


        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public void jumpMy(View v){

        ARouterLoadGroup group = new ARouter$$Group$$Personal();
        HashMap<String, Class<? extends ARouterLoadPath>> groupMap = group.loadGroup();

        Class<? extends ARouterLoadPath> orderClazz = groupMap.get("personal");

        try {
            ARouterLoadPath loadPath = orderClazz.newInstance();
            HashMap<String, RouterBean> pathMap = loadPath.loadPath();
            RouterBean routerBean = pathMap.get("/personal/PersonalMainActivity");

            if (routerBean != null) {
                startActivity(new Intent(this, routerBean.getClazz()));
            }
        } catch (IllegalAccessException e) {


        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }


}

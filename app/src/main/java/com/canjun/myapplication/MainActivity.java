package com.canjun.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.canjun.apt.ARouter$$Group$$order;
import com.canjun.apt.ARouter$$Group$$personal;
import com.canjun.arouter_annotation.ARouter;
import com.canjun.arouter_annotation.model.RouterBean;
import com.canjun.arouter_api.core.ARouterLoadGroup;
import com.canjun.arouter_api.core.ARouterLoadPath;

import java.util.HashMap;
import java.util.Map;


@ARouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpOrder(View v){

        ARouterLoadGroup group = new ARouter$$Group$$order();
        Map<String, Class<? extends ARouterLoadPath>> groupMap = group.loadGroup();

        Class<? extends ARouterLoadPath> orderClazz = groupMap.get("order");

        try {
            ARouterLoadPath loadPath = orderClazz.newInstance();
            Map<String, RouterBean> pathMap = loadPath.loadPath();
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

        ARouterLoadGroup group = new ARouter$$Group$$personal();
        Map<String, Class<? extends ARouterLoadPath>> groupMap = group.loadGroup();

        Class<? extends ARouterLoadPath> orderClazz = groupMap.get("personal");

        try {
            ARouterLoadPath loadPath = orderClazz.newInstance();
            Map<String, RouterBean> pathMap = loadPath.loadPath();
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

package com.canjun.order;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.canjun.arouter_annotation.ARouter;
import com.canjun.arouter_annotation.Parameter;
import com.canjun.common.RecorderPathManager;
import com.canjun.personal.R;

/**
 * OrderMainActivity
 *
 * @author zfc
 * @date 2020-01-09
 */
@ARouter(path = "/order/OrderMainActivity")
public class OrderMainActivity extends AppCompatActivity {

    @Parameter
    String name;

    @Parameter(name = "agex")
    int age;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_main_activity);

        new OrderMainActivity$$Parameter().loadParameter(this);
    }

    public void jumpApp(View v){
//        try {
//            Class<?> clzz = Class.forName("com.canjun.myapplication.MainActivity");
//            Intent intent = new Intent(this,clzz);
//            startActivity(intent);
//        }catch (Exception e){
//
//        }


        try {
            Class<?> clzz = RecorderPathManager.getTargetClass("app","MainActivity");
            Intent intent = new Intent(this, clzz);
            startActivity(intent);
        }catch (Exception e){

        }
    }

    public void jumpMy(View v){
//        try {
//            Class<?> clzz = Class.forName("com.canjun.personal.PersonalMainActivity");
//            Intent intent = new Intent(this,clzz);
//            startActivity(intent);
//        }catch (Exception e){
//
//        }


        try {
            Class<?> clzz = RecorderPathManager.getTargetClass("personal","PersonalMainActivity");
            Intent intent = new Intent(this, clzz);
            startActivity(intent);
        }catch (Exception e){

        }
    }
}

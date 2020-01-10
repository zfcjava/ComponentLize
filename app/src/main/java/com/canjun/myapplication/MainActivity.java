package com.canjun.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.canjun.arouter_annotation.ARouter;
import com.canjun.common.RecorderPathManager;
import com.canjun.order.OrderMainActivity;


@ARouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpOrder(View v){
//        try {
////            Class<?> clzz = Class.forName("com.canjun.myapplication.MainActivity");
//            Intent intent = new Intent(this, OrderMainActivity.class);
//            startActivity(intent);
//        }catch (Exception e){
//
//        }

        try {
            Class<?> clzz = RecorderPathManager.getTargetClass("order","OrderMainActivity");
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

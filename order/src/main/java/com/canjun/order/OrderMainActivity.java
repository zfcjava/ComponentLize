package com.canjun.order;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.canjun.personal.R;

/**
 * OrderMainActivity
 *
 * @author zfc
 * @date 2020-01-09
 */
public class OrderMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_main_activity);
    }

    public void jumpApp(View v){
        try {
            Class<?> clzz = Class.forName("com.canjun.myapplication.MainActivity");
            Intent intent = new Intent(this,clzz);
            startActivity(intent);
        }catch (Exception e){

        }
    }

    public void jumpMy(View v){
        try {
            Class<?> clzz = Class.forName("com.canjun.personal.PersonalMainActivity");
            Intent intent = new Intent(this,clzz);
            startActivity(intent);
        }catch (Exception e){

        }
    }
}

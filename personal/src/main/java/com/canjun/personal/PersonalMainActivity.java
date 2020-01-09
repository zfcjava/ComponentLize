package com.canjun.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PersonalMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_activity_main);
    }

    public void jumpApp(View v){
        try {
            Class<?> clzz = Class.forName("com.canjun.myapplication.MainActivity");
            Intent intent = new Intent(this,clzz);
            startActivity(intent);
        }catch (Exception e){

        }
    }

    public void jumpOrder(View v){
        try {
            Class<?> clzz = Class.forName("com.canjun.order.OrderMainActivity");
            Intent intent = new Intent(this,clzz);
            startActivity(intent);
        }catch (Exception e){

        }
    }
}

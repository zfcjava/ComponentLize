package com.canjun.myapplication;

import com.canjun.annotation.ARouter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

@ARouter(path = "/app/PersonalActivity")
public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
    }

    public void jump(View view) {
        Class clazz = MainActivity$$ARouter.findTargetClass("/app/MainActivity");
        startActivity(new Intent(this,clazz));
    }
}

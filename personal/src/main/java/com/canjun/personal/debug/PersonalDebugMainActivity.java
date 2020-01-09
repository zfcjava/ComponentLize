package com.canjun.personal.debug;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.canjun.personal.R;

/**
 * PersonalDebugMainActivity
 *
 * @author zfc
 * @date 2020-01-09
 */
public class PersonalDebugMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_debug_activity_main);
    }
}

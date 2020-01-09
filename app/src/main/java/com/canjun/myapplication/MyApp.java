package com.canjun.myapplication;

import com.canjun.common.RecorderPathManager;
import com.canjun.common.base.BaseApplication;
import com.canjun.order.OrderMainActivity;
import com.canjun.personal.PersonalMainActivity;

/**
 * MyApp
 *
 * @author zfc
 * @date 2020-01-09
 */
public class MyApp extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //注册activity
        RecorderPathManager.joinGroup("app","MainActivity",MainActivity.class);
        RecorderPathManager.joinGroup("order","OrderMainActivity", OrderMainActivity.class);
        RecorderPathManager.joinGroup("personal","PersonalMainActivity", PersonalMainActivity.class);
    }
}

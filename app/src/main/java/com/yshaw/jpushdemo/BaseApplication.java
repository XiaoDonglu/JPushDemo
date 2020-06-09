package com.yshaw.jpushdemo;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * @author yshaw
 * @since 2020-06-09
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}

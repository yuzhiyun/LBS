package com.yuzhiyun.lbs.application;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * Created by yuzhiyun on 2016/4/4.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        SDKInitializer.initialize(getApplicationContext());
    }

}

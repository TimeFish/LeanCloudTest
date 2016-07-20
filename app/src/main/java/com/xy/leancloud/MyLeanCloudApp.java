package com.xy.leancloud;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by XY on 2016/7/20.
 */
public class MyLeanCloudApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化参数依次为 this, AppId, AppKey
        AVOSCloud.initialize(this,"uPnGOIL9z9WDown9UH6cDg8J-gzGzoHsz","DuEbdYEO7iOzKlgLlmm1Sv9p");
    }
}

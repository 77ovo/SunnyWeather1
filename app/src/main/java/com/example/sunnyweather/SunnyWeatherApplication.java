package com.example.sunnyweather;

import android.app.Application;
import android.content.Context;

public class SunnyWeatherApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    /**
     * 获取全局上下文*/
    public static Context getContext() {
        return context;
    }
    private static String Token="p9KDMqkGvbGR35ex";

}


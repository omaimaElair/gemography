package com.example.gemography;

import android.app.Application;

import com.example.gemography.dagger2.AppComponent;
import com.example.gemography.dagger2.DaggerAppComponent;
import com.example.gemography.retrofit.ApiManager;

public class App extends Application {

    public static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component= DaggerAppComponent.create();
        ApiManager.getInstance().setUpRetrofit();
    }
}

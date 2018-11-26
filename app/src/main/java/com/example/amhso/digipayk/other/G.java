package com.example.amhso.digipayk.other;



import android.app.Activity;
import android.app.Application;
import android.content.Context;


public class G extends Application {

    public static Context context;
    public static Activity activity;



    @Override
    public void onCreate() {

        context = getApplicationContext();
        super.onCreate();

    }





}
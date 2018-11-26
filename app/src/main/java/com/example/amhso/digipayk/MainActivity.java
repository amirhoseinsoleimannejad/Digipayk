package com.example.amhso.digipayk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.gauravbhola.ripplepulsebackground.RipplePulseLayout;


public class MainActivity extends Activity {
    RipplePulseLayout mRipplePulseLayout;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRipplePulseLayout = findViewById(R.id.RipplePulseLayout);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                mRipplePulseLayout.startRippleAnimation();

            }
        },2000);






        Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {
            @Override
            public void run() {

                mRipplePulseLayout.stopRippleAnimation();

                Intent i = new Intent(MainActivity.this, LoginsignupActivity.class);
                startActivity(i);
                finish();
            }
        },4000);

    }


}
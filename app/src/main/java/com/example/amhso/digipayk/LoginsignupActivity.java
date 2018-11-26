package com.example.amhso.digipayk;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.amhso.digipayk.LoginSignupFragment.LoginFragment;
import com.example.amhso.digipayk.LoginSignupFragment.SignupFragment;
import com.example.amhso.digipayk.other.G;
import com.gauravbhola.ripplepulsebackground.RipplePulseLayout;
public class LoginsignupActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsignup);

        G.activity=this;

        RelativeLayout relativeLayout=(RelativeLayout) findViewById(R.id.relativelayout);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height_px = displayMetrics.heightPixels;
        relativeLayout.getLayoutParams().height=height_px;



        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.anim.animation_activity_start,R.anim.animation_activity_end);
        ft.replace(R.id.fragment, new LoginFragment());
        ft.commit();

    }





    public void onClickSignup(View v)
    {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setCustomAnimations(R.anim.animation_activity_start,R.anim.animation_activity_end);
        ft.replace(R.id.fragment, new SignupFragment());
        ft.commit();
    }

}

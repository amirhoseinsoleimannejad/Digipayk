package com.example.amhso.digipayk;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import com.gauravbhola.ripplepulsebackground.RipplePulseLayout;
public class LoginActivity extends AppCompatActivity {

    RipplePulseLayout mRipplePulseLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        mRipplePulseLayout = findViewById(R.id.RipplePulseLayout);

        mRipplePulseLayout.startRippleAnimation();



//        Button login=(Button)findViewById(R.id.login);
//
//        final float fromRadius = 5;
//        final float toRadius = 100;
//        final GradientDrawable gd = (GradientDrawable) login.getBackground();
//
//
//        final ValueAnimator animator = ValueAnimator.ofArgb({100,100,100,100,100,100,0,0}, {100,100,100,100,100,100,0,0});
//        animator.setDuration(5000)
//                .addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//                    @Override
//                    public void onAnimationUpdate(ValueAnimator animation) {
//
//                        float []arg = {100,100,100,100,100,100,0,0};
//                        gd.setCornerRadii(arg);
//                    }
//                });
//        animator.start();



    }
}

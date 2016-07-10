package com.saranshgaur.firstapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Fitness");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.BLACK));

        final ImageView VE = (ImageView) findViewById(R.id.saruview);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation ab = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out );

        VE.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener(){
                                    @Override
                                    public void onAnimationStart(Animation animation) {


                                    }

                                    @Override
                                    public void onAnimationRepeat(Animation animation) {

                                    }

                                    @Override
                                    public void onAnimationEnd(Animation animation) {
                                        VE.startAnimation(ab);
                                        finish();
                                        Intent i = new Intent(splash.this, MainActivity.class);
                                        startActivity(i);
                                    }
                                }

        );
    }
}

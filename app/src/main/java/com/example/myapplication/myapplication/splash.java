package com.example.myapplication.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class splash extends AppCompatActivity {

    private  static int SPLASH_TIME_OUT= 5000;


    //animation
    Animation topAnimation, bottomAnimation, middleAnimation;
    View first, dua, tiga, empat, lima, enam, tujuh;
    TextView c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

         topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_ani);
         bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_ani);
         middleAnimation = AnimationUtils.loadAnimation(this, R.anim.midlle_ani);

        //hoks

        first = findViewById(R.id.first_line);
        dua = findViewById(R.id.dua);
        tiga = findViewById(R.id.tiga);
        empat = findViewById(R.id.empat);
        lima = findViewById(R.id.lima);
        enam = findViewById(R.id.enam);
        tujuh = findViewById(R.id.tujuh);

        c = findViewById(R.id.c);
        d= findViewById(R.id.d);

        first.setAnimation(topAnimation);
        dua.setAnimation(topAnimation);
        tiga.setAnimation(topAnimation);
        empat.setAnimation(topAnimation);
        lima.setAnimation(topAnimation);
        enam.setAnimation(topAnimation);
        tujuh.setAnimation(topAnimation);

        c.setAnimation(middleAnimation);
        d.setAnimation(middleAnimation);

        //splash

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }

}
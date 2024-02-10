package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView header = findViewById(R.id.programm_name);

        Animation animation = new TranslateAnimation(0, 0, 0, 50);
        animation.setDuration(5000);
        animation.setRepeatCount(Animation.INFINITE);

        animation.setInterpolator(getApplicationContext(), android.R.anim.cycle_interpolator);

        header.startAnimation(animation);

    }
}
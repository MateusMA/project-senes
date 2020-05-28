package com.senes.splash.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.senes.splash.MainActivity;
import com.senes.splash.R;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        ImageView gif = findViewById(R.id.imageView);

        Glide.with(this)
                .load(R.drawable.animation2)
                .asGif()
                .into(gif);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(Splash.this, MainActivity.class);

                startActivity(i);

                finish();

            }

        }, SPLASH_TIME_OUT);
    }
}

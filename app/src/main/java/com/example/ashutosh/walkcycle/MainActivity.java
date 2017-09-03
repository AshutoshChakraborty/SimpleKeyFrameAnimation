package com.example.ashutosh.walkcycle;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.animationshow);
        animationDrawable = (AnimationDrawable) img.getDrawable();
        img.post(new Runnable() {
            @Override
            public void run() {
                animationDrawable.start();
            }
        });
    }
}

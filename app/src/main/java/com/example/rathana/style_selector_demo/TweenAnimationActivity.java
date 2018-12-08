package com.example.rathana.style_selector_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class TweenAnimationActivity extends AppCompatActivity {

    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);

        view=findViewById(R.id.view);

    }


    public void onZoomIn(View view) {
        Animation animation=AnimationUtils.loadAnimation(
                this,R.anim.zoom_in_anim
        );
        this.view.startAnimation(animation);
    }

    public void onZoomOut(View view) {

    }
}

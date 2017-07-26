package com.example.anas.tweenanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView iv;
    Animation jabong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView)findViewById(R.id.imageView);
        jabong = AnimationUtils.loadAnimation(this,R.anim.animations);
        iv.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        iv.startAnimation(jabong);
    }
}

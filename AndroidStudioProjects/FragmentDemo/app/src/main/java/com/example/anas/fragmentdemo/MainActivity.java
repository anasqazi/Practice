package com.example.anas.fragmentdemo;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btnSimpleFragment);
        btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        Log.i("Button","Pressed");
//        Intent in =new Intent(this,BlankFragment.class);
//        startActivity(in);
    }
}

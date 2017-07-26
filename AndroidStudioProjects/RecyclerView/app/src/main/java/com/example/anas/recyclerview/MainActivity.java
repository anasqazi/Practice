package com.example.anas.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ClickEventListener
{

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView) findViewById(R.id.listView);
        String [] abc={"item","item","item","item","item","item","item","item","item","item","item","item","item"};

        CustomAdapter ad=new CustomAdapter(this,abc,this);
        lv.setAdapter(ad);

    }



    @Override
    public void scrollToPositon(int i)
    {
        lv.smoothScrollToPosition(i);
    }
}

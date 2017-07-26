package com.example.anas.realrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    static RecyclerView myview;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myview=(RecyclerView)findViewById(R.id.myrecycler);
        CustomAdapter adapter =new CustomAdapter();

        LinearLayoutManager mngr=new LinearLayoutManager(getApplicationContext());
        myview.setLayoutManager(mngr);
        myview.setItemAnimator(new DefaultItemAnimator());
        myview.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    public void ButtonPresssed(final int post)
    {
        myview.smoothScrollToPosition((int)Math.pow(post,2));
    }
}

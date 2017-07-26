package com.example.anas.realrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by anas on 24/7/17.
 */

public class MyViewHandler extends RecyclerView.ViewHolder
{
    public TextView text,index;
    Button btn;

    public MyViewHandler(View view)
    {

        super(view);

        text=view.findViewById(R.id.textView);
        index=view.findViewById(R.id.index);
        btn=view.findViewById(R.id.button);
    }


}

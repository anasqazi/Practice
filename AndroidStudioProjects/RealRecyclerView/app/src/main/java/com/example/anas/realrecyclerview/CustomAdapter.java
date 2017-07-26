package com.example.anas.realrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by anas on 24/7/17.
 */

public class CustomAdapter extends RecyclerView.Adapter<MyViewHandler>
{


    String data[]={"item","item","item","item","item","item","item","item","item","item","item","item","item","item","item","item",};

    @Override
    public MyViewHandler onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View childs= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row,parent,false);
        return new MyViewHandler(childs);
    }


    @Override
    public void onBindViewHolder(MyViewHandler holder, final int position)
    {
        holder.text.setText(data[position]);
        holder.index.setText(String.valueOf(position));
        holder.btn.setText("Press to go to"+String.valueOf(Math.pow(position,2)));
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity p=new MainActivity();
                p.ButtonPresssed(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

}

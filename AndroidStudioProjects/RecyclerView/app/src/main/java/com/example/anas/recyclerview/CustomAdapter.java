package com.example.anas.recyclerview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by anas on 21/7/17.
 */

public class CustomAdapter extends BaseAdapter implements View.OnClickListener
{

    Context con;
    String[]data;
    ListView lv;
    ClickEventListener cel;
    public CustomAdapter()
    {}

    public CustomAdapter(Context con,String[] data, ClickEventListener cel)
    {
        this.con=con;
        this.data=data;
        this.cel=cel;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return data[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater inflater=(LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.layout,viewGroup,false);
        TextView text=(TextView) view.findViewById(R.id.textView);
        TextView index=(TextView) view.findViewById(R.id.index);
        Button btn=(Button)view.findViewById(R.id.button);
        text.setText(data[i]);
        index.setText(String.valueOf(i));
        btn.setText("Press to go to"+Math.pow(i,2));
        btn.setOnClickListener(this);
        btn.setTag((int) Math.pow(i,2));
        return view;
    }

    @Override
    public void onClick(View view)
    {
        int i=(int)view.getTag();
        cel.scrollToPositon(i);
    }
}

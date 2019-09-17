package com.example.loginpages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class listadapter extends BaseAdapter {
    Context context;
    LayoutInflater Inflater;
    ArrayList<String> Arraya;
    ArrayList<String> Arrayb;
    ArrayList<String> Arrayc;
    public listadapter(Context context, ArrayList<String> textView, ArrayList<String> textView2, ArrayList<String> textView4) {

        this.context=context;
        this.Arraya=textView;
        this.Arrayb=textView2;
        this.Arrayc=textView4;
    }

    @Override
    public int getCount() {
        return Arraya.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View im=LayoutInflater.from(context).inflate(R.layout.items,viewGroup,false);


//        View view=LayoutInflater.from(context).inflate(R.layout.,null);
        TextView in= (TextView) im.findViewById(R.id.textView);
        in.setText(Arraya.get(i));
        TextView bb = (TextView) im.findViewById(R.id.textView2);
        bb.setText(Arrayb.get(i));
        TextView cc = (TextView) im.findViewById(R.id.textView4);
        cc.setText(Arrayc.get(i));
        ImageView ac=(ImageView) im.findViewById(R.id.imageView);
        ac.setImageResource(R.drawable.notification);
        return im;
    }
}

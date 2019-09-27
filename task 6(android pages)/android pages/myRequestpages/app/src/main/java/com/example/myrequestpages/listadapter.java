package com.example.myrequestpages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.myrequestpages.Requstmodel.request;

class listadapter extends BaseAdapter {
    Context context;
    ArrayList<request> arrayList;
    public listadapter(Context context, ArrayList<request> mode) {

        this.context=context;
        this.arrayList=mode;

    }

    @Override
    public int getCount() {
        return arrayList.size();
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
        View im= LayoutInflater.from(context).inflate(R.layout.items,viewGroup,false);

        final request request=this.arrayList.get(i);
        TextView in= (TextView) im.findViewById(R.id.textView);
        in.setText(String.valueOf(request.getRequestno()));
        TextView bb = (TextView) im.findViewById(R.id.textView2);
        bb.setText(String.valueOf(request.getStatus()));
        TextView cc = (TextView) im.findViewById(R.id.textView4);
        cc.setText(String.valueOf(request.getDate()));
        ImageView ac=(ImageView) im.findViewById(R.id.bellicon);
        ac.setImageResource(R.drawable.notification);

        return im;

    }
}

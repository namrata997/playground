package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.RequestModel.Request;

import java.util.ArrayList;

class listadapter extends BaseAdapter {

    Context context;
    ArrayList<Request> arrayList;

    public listadapter(Context context, ArrayList<Request> mode) {

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
        View im= LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);

        final Request request=this.arrayList.get(i);
        TextView in= (TextView) im.findViewById(R.id.textView5);
        in.setText(String.valueOf(request.getRequestno()));
        TextView bb = (TextView) im.findViewById(R.id.textView4);
        bb.setText(String.valueOf(request.getStatus()));
        TextView cc = (TextView) im.findViewById(R.id.textView8);
        cc.setText(String.valueOf(request.getDate()));
        return im;
    }
}

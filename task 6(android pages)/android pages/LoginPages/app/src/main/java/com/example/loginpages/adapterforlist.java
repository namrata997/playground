package com.example.loginpages;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class adapterforlist extends BaseAdapter {

    Context context;
    LayoutInflater Inflater;
    ArrayList<String> content;

    public adapterforlist(Context applicationContext, ArrayList<String> content) {
        this.context=context;
        this.content=content;
    }

    @Override
    public int getCount() {
        return content.size();
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
        View iv=LayoutInflater.from(context).inflate(R.layout.itemslistviews,viewGroup,false);
        TextView in= (TextView) iv.findViewById(R.id.content);
        in.setText(content.get(i));
        return iv;
    }
}

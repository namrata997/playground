package com.example.loginpages;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Requestmodel.request;

import static android.provider.Contacts.SettingsColumns.KEY;

class listadapter extends BaseAdapter {
    Context context;
//    LayoutInflater Inflater;
    ArrayList<request> arrayList;
//    ArrayList<String> setDate;
//    ArrayList<String> setStatus;
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
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View im=LayoutInflater.from(context).inflate(R.layout.items,viewGroup,false);


//        View view=LayoutInflater.from(context).inflate(R.layout.,null);


        final request request=this.arrayList.get(i);
        TextView in= (TextView) im.findViewById(R.id.textView);
        in.setText(String.valueOf(request.getRequestno()));
        TextView bb = (TextView) im.findViewById(R.id.textView2);
        bb.setText(String.valueOf(request.getStatus()));
        TextView cc = (TextView) im.findViewById(R.id.textView4);
        cc.setText(String.valueOf(request.getDate()));
        ImageView ac=(ImageView) im.findViewById(R.id.bellicon);
        ac.setImageResource(R.drawable.notification);



        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                request request=arrayList.get(i);
                Intent intent=new Intent(context,RequestReview.class);
                intent.putExtra(KEY,request);


                Bundle Requesta=new Bundle();
                Requesta.putString("requestno",request.setRequestno());
                intent.putExtra("request",Requesta);


                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);


            }
        });


//        im.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position,
//                                    long id) {
//                Intent intent = new Intent(MainActivity.this, .class);
//                String message = nameArray[position];
//                intent.putExtra("animal", message);
//                startActivity(intent);
//            }
//        });




        return im;






    }
}

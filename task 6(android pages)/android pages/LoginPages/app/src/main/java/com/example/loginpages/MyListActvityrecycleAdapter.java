package com.example.loginpages;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

class MyListActvityrecycleAdapter extends RecyclerView.Adapter {
    String titles[], dates[], verifications[];
    private Context context;


    public MyListActvityrecycleAdapter(Context context, String[] title, String[] date, String[] verification) {
        this.context = context;
        this.titles = title;
        this.dates = date;
        this.verifications = verification;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.items, viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) viewHolder;
        myViewHolder.setUpData(String.valueOf(titles[position]),String.valueOf(dates[position]),String.valueOf(verifications[position]));
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, date, verification;
        public ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView);
            date = itemView.findViewById(R.id.textView4);
            verification = itemView.findViewById(R.id.textView2);
            imageView = itemView.findViewById(R.id.bellicon);
        }

        public void setUpData(String titles, String dates, String verifications) {


            title.setText(titles);
            date.setText(dates);
            verification.setText(verifications);
            imageView.setImageResource(R.drawable.notification);
        }
    }

}
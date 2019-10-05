package com.carmel.bootcamp.namrata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
     String filenames[], capacityes[];
    private Context context;


    public RecycleAdapter(Context context, String[] filename, String[] capacity) {
        this.context = context;
        this.filenames = filename;
        this.capacityes = capacity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.items,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RecycleAdapter.MyViewHolder myViewHolder = (RecycleAdapter.MyViewHolder)holder;
        myViewHolder.setUpData(String.valueOf(filenames[position]),String.valueOf(capacityes[position]));
        RecycleAdapter.MyViewHolder myViewHolder1 = (RecycleAdapter.MyViewHolder)holder;
    }

    @Override
    public int getItemCount() {
        return  filenames.length;
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView filename, capacity;
        public ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            filename = itemView.findViewById(R.id.descripition);
            capacity= itemView.findViewById(R.id.explain);
            imageView = itemView.findViewById(R.id.bin);
        }

        public void setUpData(String filenames, String capacitye) {
            filename.setText(filenames);
            capacity.setText(capacitye);
            imageView.setImageResource(R.drawable.dust);
        }
    }
}

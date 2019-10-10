package com.carmel.bootcamp.namrata;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class SimpleRVAdapter extends RecyclerView.Adapter {
    private String[] dataSource,content,total;
    RecyclerView recyclerView;
    RecyclerView.Adapter recylerViewAdapter;

    Context context;
    public SimpleRVAdapter(Context context,String[] dataArgs,String[] details,String[] capacity) {
        this.dataSource = dataArgs;
        this.context = context;
        this.content = details;
        this.total=capacity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = new TextView(parent.getContext());
        View inflater = LayoutInflater.from(context).inflate(R.layout.items,parent,false);
        SimpleViewHolder viewHolder = new SimpleViewHolder(inflater);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//        holder.textView.setText(dataSource[position]);
            SimpleRVAdapter.SimpleViewHolder simpleViewHolder = (SimpleRVAdapter.SimpleViewHolder)holder;
            simpleViewHolder.setUpdata(String.valueOf(dataSource[position]),String.valueOf(content[position]),String.valueOf(total[position]));
    }

    @Override
    public int getItemCount() {
        return dataSource.length;
    }




    private class SimpleViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public TextView descripition,filehold;
        public ImageView imageView;
        public SimpleViewHolder(View itemView) {
            super(itemView);
//            textView = (TextView) itemView;
            textView = itemView.findViewById(R.id.textView);
            descripition=itemView.findViewById(R.id.descripition);
            filehold=itemView.findViewById(R.id.textView5);
            imageView = itemView.findViewById(R.id.bin);
        }


        public void setUpdata(String dataArgs,String details,String capacity) {
            textView.setText(dataArgs);
            descripition.setText(details);
            filehold.setText(capacity);
            imageView.setImageResource(R.drawable.dust);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    delete(getAdapterPosition());
                }
            });

        }
        public void delete(int position) { //removes the row
            descripition.endBatchEdit();
            notifyItemRemoved(position);
        }


    }

}


package com.example.loginpages;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {
    String titles[],dates[],verifications[];
    private Context context;
    JSONObject list;


    public MyRecyclerViewAdapter(Context context, String[] title, String[] date, String[] verification) {
        this.context=context;
        this.titles=title;
        this.dates=date;
        this.verifications=verification;
    }
    public MyRecyclerViewAdapter(Context applicationContext, JSONObject jsonObject) {
        this.context=context;
        this.list=new JSONObject();
        this.list=jsonObject;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.items,viewGroup,false);
         MyViewHolder myViewHolder = new MyViewHolder(view);
       return myViewHolder;
    }

    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int i) {
        MyViewHolder myViewHolder1 = viewHolder;
        try {
            JSONArray jsonArray = list.getJSONArray("data");
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            myViewHolder1.setUpData(jsonObject);
        } catch (JSONException e) {
            e.printStackTrace();

        }
    }


    @Override
    public int getItemCount() {
            try {
                return list.getJSONArray("data").length();
            } catch (JSONException e) {
                return Integer.parseInt(null);
            }
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title,date,verification;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textView);
            date = itemView.findViewById(R.id.textView4);
            verification = itemView.findViewById(R.id.textView2);
            }

            public void setUpData(JSONObject jsonObject) {
                try {
                    title.setText(jsonObject.getString("title"));
                    date.setText(jsonObject.getString("date"));
                    verification.setText(jsonObject.getString("verifiction"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

    }


package com.example.loginpages;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import static com.android.volley.Response.*;

public class Jsonclass extends AppCompatActivity {
    RecyclerView recyclerView;
    String title[],date[],verification[],text;
    Button pressbutton;
    String url= "https://mynotebook97.000webhostapp.com/aaa.json.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsonclass);
        recyclerView=findViewById(R.id.recyclerview);
        pressbutton=findViewById(R.id.pressbutton);

        pressbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringRequest request = new StringRequest(url, new Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        responseJSONData(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getApplicationContext(), "There is an error", Toast.LENGTH_LONG).show();
                    }
                });
                RequestQueue rQueue = Volley.newRequestQueue(Jsonclass.this);
                rQueue.add(request);
            }
        });

    }
    public void responseJSONData(String response) {
        Log.d("response",response);
        try {
            JSONObject jsonObject=new JSONObject(response);
            Log.d("JSON", String.valueOf(jsonObject));
            recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            MyRecyclerViewAdapter myRecyclerViewAdapter;
            myRecyclerViewAdapter = new MyRecyclerViewAdapter(getApplicationContext(),jsonObject);
            recyclerView.setAdapter(myRecyclerViewAdapter);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    }




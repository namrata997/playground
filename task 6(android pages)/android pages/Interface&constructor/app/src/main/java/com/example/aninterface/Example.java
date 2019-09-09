package com.example.aninterface;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Example extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    int length;
    int breath;
    Example()
    {
        length=3;
        breath=5;
    }
    int area(Context applicationContext){
        int rectArea=length*breath;
        Toast.makeText(applicationContext, "sometext", Toast.LENGTH_SHORT).show();
        return rectArea;
    }
    }


package com.example.arrays;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    Button add;
    Button delete;
    Button show;
    EditText textViewa;
    EditText textViewb;
    TextView textViewc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<String> Array = new ArrayList<String>();
        add = findViewById(R.id.button1);
        delete = findViewById(R.id.button2);
        show= findViewById(R.id.button4);
        textViewa= findViewById(R.id.textView1);
        textViewb = findViewById(R.id.textView2);
        textViewc= findViewById(R.id.textView3);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = textViewa.getText().toString();
                Array.add(value);


            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewc.setText(null);
                for(int i=0; i<Array.size();i++){
                    textViewc.setText(textViewc.getText()+Array.get(i)+ "\n");
                }
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = textViewb.getText().toString();
                Array.remove(value);
            }
        });



    }


}

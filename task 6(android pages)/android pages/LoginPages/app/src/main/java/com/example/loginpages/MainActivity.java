package com.example.loginpages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button login;
    ImageView imageView;
    ImageView imageView1;
    TextView textView;
    TextView textView1;
    TextView forgot;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        login = findViewById(R.id.button1);
        imageView = findViewById(R.id.imageView);
        imageView1= findViewById(R.id.imageView2);
        textView = findViewById(R.id.textView2);
        textView1 = findViewById(R.id.textView3);
        forgot = findViewById(R.id.textView6);
        email = findViewById(R.id.editText);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("")) {
                    imageView.setVisibility(View.VISIBLE);
                    imageView1.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    textView1.setVisibility(View.VISIBLE);
                } else {
                    Intent intent = new Intent(getApplicationContext(), Activityrecycle.class);
                    startActivity(intent);
                }
            }
        });

        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ForgotPassword.class);
                startActivity(intent);
            }
        });
    }
}

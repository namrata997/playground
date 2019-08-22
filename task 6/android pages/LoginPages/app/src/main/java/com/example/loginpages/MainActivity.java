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
    ImageView i1;
    ImageView i2;
    TextView i3;
    TextView i4;
    TextView forgot;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        login = findViewById(R.id.button1);
        i1=findViewById(R.id.imageView);
        i2=findViewById(R.id.imageView2);
        i3=findViewById(R.id.textView2);
        i4=findViewById(R.id.textView3);
        forgot=findViewById(R.id.textView6);
        email=findViewById(R.id.editText);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("")){
                    i1.setVisibility(View.VISIBLE);
                    i2.setVisibility(View.VISIBLE);
                    i3.setVisibility(View.VISIBLE);
                    i4.setVisibility(View.VISIBLE);
                }
                else {
                    Intent intent=new Intent(getApplicationContext(),Navigationactivity.class);
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

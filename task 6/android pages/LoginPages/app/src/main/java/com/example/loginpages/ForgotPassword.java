package com.example.loginpages;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {
    Button contiue;
    ImageView a1;
    ImageView a2;
    TextView a3;
    TextView a4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        contiue=findViewById(R.id.button2);
        a1=findViewById(R.id.imageView4);
        a2=findViewById(R.id.imageView5);
        a3=findViewById(R.id.textView8);
        a4=findViewById(R.id.textView9);

        contiue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a1.setVisibility(1);
                a2.setVisibility(1);
                a3.setVisibility(1);
                a4.setVisibility(1);

            }

        });
    }

}

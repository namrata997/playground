package com.example.loginpages;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgotPassword extends AppCompatActivity {
    Button contiue;
    ImageView a1;
    ImageView a2;
    TextView a3;
    TextView a4;
    EditText email;
    AlertDialog.Builder alertBuilding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);



        contiue=findViewById(R.id.button2);
        alertBuilding=new AlertDialog.Builder( this);
        final View alertView=getLayoutInflater().inflate(R.layout.activity_alertmessage,null);
        alertBuilding.setView(alertView);
        final AlertDialog alertDialog=alertBuilding.create();


        a1=findViewById(R.id.imageView4);
        a2=findViewById(R.id.imageView5);
        a3=findViewById(R.id.textView8);
        a4=findViewById(R.id.textView9);
        email=findViewById(R.id.editText3);


        contiue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(email.getText().toString().equals("")) {
                a1.setVisibility(View.VISIBLE);
                a2.setVisibility(View.VISIBLE);
                a3.setVisibility(View.VISIBLE);
                a4.setVisibility(View.VISIBLE);
            }
            else{
                alertBuilding.show();

            }

            }

        });
    }

}

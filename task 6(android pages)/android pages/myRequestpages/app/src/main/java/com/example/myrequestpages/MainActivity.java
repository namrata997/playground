package com.example.myrequestpages;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button login;
    TextView textView;
    EditText password;
    TextView forgot;
    EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.button1);
        textView = findViewById(R.id.textView5);
        password=findViewById(R.id.editText2);
        forgot = findViewById(R.id.textView6);
        email = findViewById(R.id.editText);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),blank.class);
                startActivity(intent);





            }
        });




    }

}

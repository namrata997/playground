package com.example.loginpages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RequestReview extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_review);
        textView=findViewById(R.id.textView13);
        Bundle Requesta=getIntent().getBundleExtra("Request");
//        String Requestnbo=Requesta.getString("requestno");
//        textView.setText(Requestnbo);



    }
}

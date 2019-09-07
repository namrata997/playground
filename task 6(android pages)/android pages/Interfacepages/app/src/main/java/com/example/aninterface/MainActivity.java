package com.example.aninterface;

import android.content.Context;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Interconnected,Interconnected2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add();
        sub();
        ball();
        Example c=new Example();
        c.Example();

    }

    @Override
    public void add() {
        int a,b=9,c=4;
        a=b+c;
        System.out.println("result" +a);
        Toast.makeText(this, "add 2 number", Toast.LENGTH_LONG).show();

    }
    public void sub(){
        Toast.makeText(this, "do it", Toast.LENGTH_LONG).show();
    }


    @Override
    public void ball() {
        Toast.makeText(this, "we will do it", Toast.LENGTH_SHORT).show();
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.myapplication.DelegatePackage.DelegateList;
import com.example.myapplication.RequestModel.Request;

public class MainActivity extends AppCompatActivity implements DelegateList {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlankFragment1 blankFragment = new BlankFragment1();
        blankFragment.SetDelegateLink(this);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fa, blankFragment);
        fragmentTransaction.commit();

    }


    @Override
    public void DelegateInteconnection(Request request) {
        int newConfig = this.getResources().getConfiguration().orientation;
        if (newConfig == Configuration.ORIENTATION_PORTRAIT) {
            BlankFragment2 blankFragment = new BlankFragment2();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fa, blankFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            blankFragment.setdatafetching(request);
        } else if (newConfig == Configuration.ORIENTATION_LANDSCAPE){
            BlankFragment2 blankFragment = new BlankFragment2();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.f2, blankFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            blankFragment.setdatafetching(request);
        }



    }
}



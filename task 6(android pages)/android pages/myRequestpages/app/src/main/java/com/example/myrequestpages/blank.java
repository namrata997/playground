package com.example.myrequestpages;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.myrequestpages.Requstmodel.request;

import Delegate.Delegatespart;

public class blank extends AppCompatActivity implements Delegatespart {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);

        Blanklist fragment = new Blanklist();
        fragment.setDelegatespart(this);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void requestItemsOnClick(request requests) {
        Fragment fragment1 = new Blankreiw();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment1);
        fragmentTransaction.commit();
    }
}

//    @Override
//    public void onclickRequestitems(request requests) {
//        int i=0;
//        Blankreiw fragment1=new Blankreiw();
////        fragment.setDelegatespart(this);
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.fragmentad,fragment1);
//        fragmentTransaction.commit();
//
    // @Override
//    public void Requestitemsonclick(request requests) {
//        int i=0;
//        Fragment fragment1=new Blankreiw();
////  fragment.setDelegatespart(this);
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.fragment,fragment1);
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
//    }
//}
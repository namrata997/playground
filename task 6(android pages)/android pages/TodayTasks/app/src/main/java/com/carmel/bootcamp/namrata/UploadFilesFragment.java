package com.carmel.bootcamp.namrata;


import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class UploadFilesFragment extends Fragment  {

    RecyclerView recyclerView;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_uploadfiles,container,false);
        recyclerView= view.findViewById(R.id.recycleview);
        String[] strings = {"1", "2"};
        String[] details ={"abcdefgh12345678..","ijklmnopqrstuvw456789.."};
        String[] capacity={"656.6kb","698.6kb"};
        RecyclerView.Adapter rv=(new SimpleRVAdapter( view.getContext(),strings,details,capacity));
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
       recyclerView.setAdapter(rv);

        return view;

//
    }


}

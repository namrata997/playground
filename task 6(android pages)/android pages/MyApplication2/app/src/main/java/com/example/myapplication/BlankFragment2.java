package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.RequestModel.Request;


public class BlankFragment2 extends Fragment {
    Request request;
    TextView number,date,statues;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        number=view.findViewById(R.id.textView10);
        date=view.findViewById(R.id.textView11);
        statues=view.findViewById(R.id.textView12);


        number.setText(request.getRequestno());
        date.setText(request.getDate());
        statues.setText(request.getStatus().toString());
        return view;
    }

    public void setdatafetching(Request request){
        this.request=request;
    }
}

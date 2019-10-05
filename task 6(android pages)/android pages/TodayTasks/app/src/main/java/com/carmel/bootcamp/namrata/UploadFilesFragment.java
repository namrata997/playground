package com.carmel.bootcamp.namrata;


import android.graphics.Paint;
import android.os.Bundle;

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


public class UploadFilesFragment extends Fragment {

    RecyclerView recyclerView;

    ImageView imageView;
    TextView textView;
    public UploadFilesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_uploadfiles, container, false);
//        imageView=view.findViewById(R.id.dustpin);

//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                AttachedFileRemove yourFragment= new AttachedFileRemove();
//                fragmentTransaction.addToBackStack(null);
//                fragmentManager.popBackStackImmediate(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
//                fragmentTransaction.add(R.id.fragmentone, yourFragment, "FRAGMENT");
//                fragmentTransaction.commit();
//
//            }
//        });
        recyclerView=view.findViewById(R.id.recycleview);
        String filename[]={"abcdefghijk5678","lmnopqrstuvwxyz1234","abcdefghijk456879"};
        String capacity[]={"990.6kb","924.5kb","985.6kb"};


        RecyclerView.Adapter recycleViewAdapter=new RecycleAdapter(view.getContext(),filename,capacity);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(recycleViewAdapter);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;
    }

}

package com.carmel.bootcamp.namrata;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class AttachFilesFragment extends Fragment   {
    private AttachmentFragmens listener;
    ImageView imageView;
//    TextView filename,filecapacity,decripition;
    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_attachment, container, false);

        imageView=view.findViewById(R.id.attachmentimage);

//        filename=view.findViewById(R.id.upload);
//        filecapacity=view.findViewById(R.id.textView3);
//        decripition=view.findViewById(R.id.textView4);

        return view;

    }

}

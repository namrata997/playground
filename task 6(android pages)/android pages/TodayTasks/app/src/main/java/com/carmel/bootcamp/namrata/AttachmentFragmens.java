package com.carmel.bootcamp.namrata;


import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AttachmentFragmens extends Fragment {
    private View view;
    TextView textview;
    public AttachmentFragmens() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_attachmentfiles, container, false);
        textview=view.findViewById(R.id.button);

        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    UploadFilesFragment yourFragment= new UploadFilesFragment();
                    fragmentTransaction.addToBackStack(null);
                    fragmentManager.popBackStackImmediate(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
                    fragmentTransaction.add(R.id.fragmentone, yourFragment, "FRAGMENT");
                    fragmentTransaction.commit();

            }
        });
        return view;

    }

}

package com.example.myapplication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.myapplication.DelegatePackage.DelegateList;
import com.example.myapplication.Global.Listitems;
import com.example.myapplication.RequestModel.Request;

import java.util.ArrayList;


public class BlankFragment1 extends Fragment {
    private BlankFragment1Listener listener;
    ListView listView;
    private View view;
    DelegateList delegateList;




    public interface BlankFragment1Listener{
        void onInputASent(CharSequence input );
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_blank_fragment1, container, false);

        listView =view.findViewById(R.id.list);
        final ArrayList<Request> mode = new ArrayList<>();

        Request request=new Request();
        request.setRequestno("pur-056-2019");
        request.setStatus(Listitems.draft);
        request.setDate("25jun2019");
        mode.add(request);

        request=new Request();
        request.setRequestno("pur-057-2019");
        request.setStatus(Listitems.awaiting);
        request.setDate("26jun2019");
        mode.add(request);

        request=new Request();
        request.setRequestno("pur-058-2019");
        request.setStatus(Listitems.reject);
        request.setDate("27jun2019");
        mode.add(request);

        request=new Request();
        request.setRequestno("pur-059-2019");
        request.setStatus(Listitems.approval);
        request.setDate("28jun2019");
        mode.add(request);



        ListAdapter LA=new listadapter(view.getContext(),mode);
        listView.setAdapter(LA);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long arg) {
                Request request=mode.get(i);
                if (delegateList !=null){
                    delegateList.DelegateInteconnection(request);
                }
            }
        });

//        listView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                BlankFragment2 blankFragment2=new BlankFragment2();
//                Bundle args=new Bundle();
//                args.putString("key","some value");
//                blankFragment2.setArguments(args);
//                getFragmentManager()
//                .beginTransaction()
//                        .replace(R.id.ad,blankFragment2)
//                .commit();
//            }
//        });

        return view;
    }
    public void SetDelegateLink(DelegateList delegatesLink){
        this.delegateList=delegatesLink;
    }


}
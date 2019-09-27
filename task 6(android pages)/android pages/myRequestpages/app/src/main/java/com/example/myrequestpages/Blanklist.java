package com.example.myrequestpages;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import Delegate.Delegatespart;

import java.util.ArrayList;

import com.example.myrequestpages.Requstmodel.request;
import globl.listitems;


public class Blanklist extends Fragment {
    ListView listView;
     Delegatespart delegatesparts;
    private View views;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        views = inflater.inflate(R.layout.fragment_blanklist, container, false);
        listView = views.findViewById(R.id.li);

        final ArrayList<request> mode = new ArrayList<>();


        request Request = new request();
        Request.setRequestno("pur-056-2019");
        Request.setDate("26jul2019");
        Request.setStatus(listitems.approval);
        mode.add(Request);

        Request = new request();
        Request.setRequestno("PUR-057-2019");
        Request.setStatus(listitems.draft);
        Request.setDate("27jul2019");
        mode.add(Request);

        Request = new request();
        Request.setRequestno("PUR-058-2019");
        Request.setStatus(listitems.reject);
        Request.setDate("28jul2019");
        mode.add(Request);

        Request = new request();
        Request.setRequestno("PUR-059-2019");
        Request.setStatus(listitems.awaiting);
        Request.setDate("29jul2019");
        mode.add(Request);

        ListAdapter LA = new listadapter(views.getContext(), mode);
        listView.setAdapter(LA);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long arg) {
                request Request=mode.get(i);
                if (delegatesparts !=null){
                    delegatesparts.requestItemsOnClick(Request);
                }
            }
        });


        return views;
    }
        public void setDelegatespart(Delegatespart delegatesparts){
        this.delegatesparts=delegatesparts;
}


}






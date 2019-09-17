package com.example.itemsinlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list1);
//
//        String textView[]={"pur-056-2019","pur-057-2019","pur-058-2019"};
//        String textView2[]={"reject","delete","approval"};
//        String textView4[]={"26jun-2019","28feb2019","26may2019"};

        final ArrayList<String> Array = new ArrayList<String>(4);

        final ArrayList<String> ArrayA= new ArrayList<String>(4);

        final ArrayList<String> ArrayB = new ArrayList<String>(4);
        Array.add("pur-056-2019");
        ArrayA.add("Approval");
        ArrayB.add("26jul2019");


        Array.add("pur-056-2019");
        ArrayA.add("Approval");
        ArrayB.add("26jul2019");


        Array.add("pur-056-2019");
        ArrayA.add("Approval");
        ArrayB.add("26jul2019");


        Array.add("pur-056-2019");
        ArrayA.add("Approval");
        ArrayB.add("26jul2019");

        listadapter LA= new listadapter(getApplicationContext(),Array,ArrayA,ArrayB);

        listView.setAdapter(LA);

    }
}

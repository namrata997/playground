package com.example.loginpages;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import Requestmodel.request;
import global.listitem;

import static android.provider.Contacts.SettingsColumns.KEY;

public class Activityrecycle extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView listView;
    Button button;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityrecycle);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        imageView=findViewById(R.id.bellicon);
        listView=findViewById(R.id.listview);
        button=findViewById(R.id.button5);

//        String title[]={"PUR-056-2019","PUR-057-2019","PUR-058-2019","PUR-059-2019","PUR-056-2019","PUR-057-2019","PUR-058-2019","PUR-059-2019"};
//        String date[]={"22-Aug","24-Aug","28-Aug","30-Aug","22-Aug","24-Aug","28-Aug","30-Aug"};
//        String verification[]={"APPROVED","REJECTED","DRAFT","AWAITING","APPROVED","REJECTED","DRAFT","AWAITING"};


//        RecyclerView.Adapter recycleViewadapter=new MyListActvityrecycleAdapter(getApplicationContext(),title,date,verification);
//        recyclerView.setAdapter(recycleViewadapter);
//           recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        final ArrayList<String> Array = new ArrayList<String>(6);

//        final ArrayList<String> ArrayA= new ArrayList<String>(6);

//        final ArrayList<String> ArrayB = new ArrayList<String>(6);



        final ArrayList<request> mode=new ArrayList<>();


        request Request=new request();
        Request.setRequestno("pur-056-2019");
        Request.setDate("26jul2019");
        Request.setStatus(listitem.approval);
        mode.add(Request);

        Request=new request();
        Request.setRequestno("PUR-057-2019");
        Request.setStatus(listitem.draft);
        Request.setDate("27jul2019");
        mode.add(Request);

        Request=new request();
        Request.setRequestno("PUR-058-2019");
        Request.setStatus(listitem.reject);
        Request.setDate("28jul2019");
        mode.add(Request);

        Request=new request();
        Request.setRequestno("PUR-059-2019");
        Request.setStatus(listitem.awaiting);
        Request.setDate("29jul2019");
        mode.add(Request);




//        listView.setAdapter(LA);
//        listView=findViewById(R.id.list);


//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26jul2019");
//
//
//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26jul2019");
//
//
//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26jul2019");
//
//
//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26jul2019");
//
//
//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26jul2019");
//
//
//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26jul2019");

        listadapter LA= new listadapter(getApplicationContext(),mode);
        listView.setAdapter(LA);

        button.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(getApplicationContext(),Formone.class);
               startActivity(intent);
            }
       });

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent=new Intent( Activityrecycle.this ,RequestReview.class);
            startActivity(intent);
        }
    });



    }



    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activityrecycle, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

       DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
   }
}

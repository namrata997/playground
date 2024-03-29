package com.example.loginpages;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.ListPopupWindow;
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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import Requestmodel.request;
import global.listitem;

public class Navigationactivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListPopupWindow listPopupWindow;
    ImageView filter;
    ListView listView;
//    TextView popUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationactivity);
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




        filter = findViewById(R.id.imageView9);
        String[] conent_list = {"Clear","Approval","Draft","Reject","Awaiting"};
//      TextView popUp=findViewById(R.id.imageView9);
        listPopupWindow = new ListPopupWindow(getApplicationContext());
        listPopupWindow.setAdapter(new ArrayAdapter<>(getApplicationContext(),R.layout.dropdown,conent_list));
        listPopupWindow.setAnchorView(filter);
        listPopupWindow.setModal(true);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listPopupWindow.show();
            }
        });
        listView=findViewById(R.id.box);
        String title[]={"PUR-056-2019","PUR-057-2019","PUR-058-2019","PUR-059-2019"};
        String date[]={"22-Aug","24-Aug","28-Aug","30-Aug"};
        String verification[]={"APPROVED","REJECTED","DRAFT","AWAITING"};

        ListAdapter listAdapter=new MyListAdapter(getApplicationContext(),title,date,verification);
        listView.setAdapter(listAdapter);

//        ArrayList<request> mode=new ArrayList<>();
//
//
//        request Request=new request();
//        Request.setRequestno("pur");
//        Request.setDate("26jul2019");
//        Request.setStatus(listitem.approval);
//        mode.add(Request);
//
//        Request=new request();
//        Request.setRequestno("PUR-057-2019");
//        Request.setStatus(listitem.draft);
//        Request.setDate("27jul2019");
//        mode.add(Request);
//
//        Request=new request();
//        Request.setRequestno("PUR-058-2019");
//        Request.setStatus(listitem.reject);
//        Request.setDate("28jul2019");
//        mode.add(Request);
//
//        Request=new request();
//        Request.setRequestno("PUR-059-2019");
//        Request.setStatus(listitem.awaiting);
//        Request.setDate("29jul2019");
//        mode.add(Request);
//
//        listadapter LA= new listadapter(getApplicationContext(),mode);
//
//
////
//        listView.setAdapter(LA);
//
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent ia=new Intent(getApplicationContext(),ForgotPassword.class);
//                startActivity(ia);
//            }
//        });





        Button loadbtn = new Button(this);
        loadbtn = findViewById(R.id.button2);
        loadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Jsonclass.class);
            }
        });
    }

    @Override
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
        getMenuInflater().inflate(R.menu.navigationactivity, menu);
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

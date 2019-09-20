package com.example.loginpages;

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
import android.widget.ListView;

import java.util.ArrayList;

public class Formtwo extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView listView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formtwo);
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

        listView=findViewById(R.id.listview);

        final ArrayList<String> content= new ArrayList<String>(4);


        content.add("IBM ThinkServer TS150 Tower Server With Max. " +
                "Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5\"" +
                "(3.3 GHz /Cache 8 MB)... / STD MEMORY 8GB X 1/ MAX. " +
                "MEMORY 64GB 4 Slots/HARD DRIVE 1 X 1TB SATA 3.5\" 7.2k" +
                " SATA / STD. HDD BAY/ 3 bay MAX. HDD BAY upto 4 x 3.5\" " +
                "+1 x 2.5\" bay/ OPTICAL Multi Burner/Integrated RAID 0,1,5," +
                "10 (RAID 121i).");
        content.add("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor" +
                " 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache 8 MB)/ " +
                "STD MEMORY 8GB X 1 MAX. MEMORY 64GB; 4 DIMM Memory Slots/ HARD" +
                " DRIVE Open Bay/ 2.5” SAS/SATA HS Bays (8 bay MAX. HDD BAY upto" +
                " 8 x 2.5” bay MAX. HDD BAY upto 16x2.5”)/OPTICAL Multi Burner/ PCIe RAID " +
                "0,1,10 (RAID 520i). Supports SAS & SATA drives/Power Supply Standard (Inbuilt)" +
                " 1 x 450W Power Supply /Max: 2");
        content.add("IBM X3300M4 Server With x3300M4/ Part NO:7382IA4/ Intel Xeon E5 1230v2 1.8 " +
                "GHz,10 MB,1066MHz/ 1x 8GB RAM/ 1x500GB SATA HDD/ 3.5Simple-Swap/ MULTI BUTRNER");

        content.add("IBM Lenovo ThinkServer RD450 Rack Server (PN:70Q90059IH) with 1 x Intel® Xeon®" +
                " E5-2620v4 (2.1GHz/8C/20MB/85W/2133Mhz)/Max: 2 Processors/ STD MEMORY 16GB X 1 MAX. " +
                "MEMORY 1 TB ;16 Slots/ HARD DRIVE : Open Bay (2.5” HOT Swap SAS/SATA STD. HDD BAY 8 bay /" +
                " MAX. HDD BAY 16 bay with optical bay/24 bay without optical bay) / OPTICAL Multi Burner/" +
                " Integrated RAID 0,1,10 (RAID 110i). Supports only SATA drive/ Power Supply Standard (Inbuilt)" +
                " 1 x 750W Power Supply Max: 2");

        content.add("daptec 128 MB Raid Controller Pair. Pci-e SAS/SATA");


        adapterforlist Lc= new adapterforlist( getApplicationContext(),content);

        listView.setAdapter(Lc);
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
        getMenuInflater().inflate(R.menu.formtwo, menu);
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

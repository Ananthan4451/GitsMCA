package com.example.gitsmca;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.gitsmca.Login;

public class Faculty extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
public void fa (View V){
    Intent intent=new Intent(Intent.ACTION_VIEW);
    intent.setData(Uri.parse("https://saintgits.org/mca-college/faculty/master-of-computer-applications/"));
    startActivity(intent);
}
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.faculty, menu);
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

            Intent i=new Intent(this, MainActivity.class);
            startActivity(i); finish();
        }else if (id==R.id.login) {
            Intent i = new Intent(this, Login.class);
            startActivity(i);
        } else if (id == R.id.faculty) {
            Intent i=new Intent(this, Faculty.class);
            startActivity(i); finish();
        } else if (id == R.id.nav_gallery) {
            Intent i=new Intent(this, Gallery.class);
            startActivity(i); finish();
        } else if (id == R.id.course) {
            Intent i=new Intent(this, Course.class);
            startActivity(i); finish();
        } else if (id == R.id.nav_map) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.google.co.in/maps/place/Saintgits+College+of+Engineering,+Kottayam/@9.509847,76.5487973,17z/data=!4m5!3m4!1s0x3b062ed484f475a7:0xea66b5d0e55062ca!8m2!3d9.509847!4d76.550986"));
            startActivity(intent);
        } else if (id == R.id.Reg) {
            Intent i=new Intent(this, Registration.class);
            startActivity(i); finish();
        } else if (id == R.id.aboutus) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://saintgits.org/mca-college/about-us/profile/"));
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

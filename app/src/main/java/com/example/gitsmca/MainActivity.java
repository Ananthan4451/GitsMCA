package com.example.gitsmca;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity


       implements NavigationView.OnNavigationItemSelectedListener {
    ViewFlipper viewflip;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        db=openOrCreateDatabase("mca",MODE_PRIVATE,null);
        String query="create table if not exists course_reg(firstname text,lastname text,dob date,gender text,address varchar(50),email_id varchar(20),phno Number,qaulfication varchar(20),cgpa float,prev_uni varchar(30))";

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        int images[]={R.drawable.wa, R.drawable.ssb, R.drawable.ssc, R.drawable.wb, R.drawable.wc, R.drawable.ssg, R.drawable.ssf, R.drawable.wd, R.drawable.we};
viewflip=findViewById(R.id.viewflip);
for(int i=0;i< images.length;i++)
{
    flipperimage(images[i]);
}
    }
    public void flipperimage(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        viewflip.addView(imageView);
        viewflip.setFlipInterval(4000); //sec
        viewflip.setAutoStart(true);
        //animation
        viewflip.setInAnimation(this,android.R.anim.slide_in_left);
        viewflip.setOutAnimation(this,android.R.anim.slide_out_right);
    }
    public void course(View V)
    {
        Intent i=new Intent(this, Course.class);
        startActivity(i);
    }
public void faculty(View V){
    Intent i=new Intent(this, Faculty.class);
    startActivity(i);
}
public void gallery(View V){
    Intent i=new Intent(this, Gallery.class);
    startActivity(i);
}
public void regi(View V){
    Intent i=new Intent(this, Registration.class);
    startActivity(i);
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
        getMenuInflater().inflate(R.menu.main, menu);
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
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
//        }else if (id==R.id.login) {
//            intent i = new intent(this.login. class);
//            startActivity(i);

        } else if (id == R.id.faculty) {
  Intent i=new Intent(this, Faculty.class);
  startActivity(i);
        } else if (id == R.id.nav_gallery) {
            Intent i=new Intent(this, Gallery.class);
            startActivity(i);
        } else if (id == R.id.course) {
            Intent i=new Intent(this, Course.class);
            startActivity(i);
        } else if (id == R.id.nav_map) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.google.co.in/maps/place/Saintgits+College+of+Engineering,+Kottayam/@9.509847,76.5487973,17z/data=!4m5!3m4!1s0x3b062ed484f475a7:0xea66b5d0e55062ca!8m2!3d9.509847!4d76.550986"));
            startActivity(intent);
        } else if (id == R.id.Reg) {
            Intent i=new Intent(this, Registration.class);
            startActivity(i);
        } else if (id == R.id.aboutus) {
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://saintgits.org/mca-college/about-us/profile/"));
            startActivity(intent);
        } else if (id == R.id.admin) {
            Intent i=new Intent(this, Administrator.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

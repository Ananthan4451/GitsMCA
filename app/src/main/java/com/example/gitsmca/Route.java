package com.example.gitsmca;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Route extends AppCompatActivity {
 Spinner spinner1;
 Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        setSupportActionBar(toolbar);
        String[] arraySpinner = new String[] {
                "KOTTAYAM SECTOR", "CHANGANACHERY SECTOR"
        };
        Spinner s = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
//        });
    public void sector(View V) {
        spinner1 = (Spinner) findViewById(R.id.spinner3);
        b=(Button)findViewById((R.id.button));
        if(spinner1.equals("KOTTAYAM SECTOR")){
            Intent i = new Intent(this,buskottayam.class);
            startActivity(i);
            finish();
        }
        else{
            Intent i = new Intent(this,buschry.class);
            startActivity(i);
            finish();
        }

    }

    }



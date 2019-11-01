package com.example.gitsmca;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Registration extends AppCompatActivity {
EditText fn,ln,dob,address,emailid,ph,ccpa,college;
Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        setSupportActionBar(toolbar);


        String[] arraySpinner = new String[] {
                "BCA", "Bsc.Computer Science", "Bsc.Physics", "Bsc.Maths", "Bsc.Chemistry","Bsc.Electronics","Comp Science",
                "Bio Science", "Commerce"
        };
        Spinner s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        String[] arraycourse = new String[] {
                "REGULAR MCA", "INTEGRATED MCA"};
        Spinner s1 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<String> course = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraycourse);
        course.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(course);

        fn=(EditText)findViewById(R.id.editText8);
        ln=(EditText)findViewById(R.id.editText9);
        dob=(EditText)findViewById(R.id.editText10);
        address=(EditText)findViewById(R.id.editText11);
        emailid=(EditText)findViewById(R.id.editText12);
        ph=(EditText)findViewById(R.id.editText13);
        ccpa=(EditText)findViewById(R.id.editText14);
        college=(EditText)findViewById(R.id.editText16);
    }
    public void reset(View V){

    }
    @Override
    public void onBackPressed() {
        finish();
    }
}



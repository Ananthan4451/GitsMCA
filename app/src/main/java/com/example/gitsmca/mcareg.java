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
import android.widget.Spinner;

public class mcareg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcareg);
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
        }

public void reset(View V){

}
    @Override
    public void onBackPressed() {
        finish();
    }
}

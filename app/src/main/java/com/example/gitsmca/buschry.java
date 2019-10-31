package com.example.gitsmca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class buschry extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buschry);
        pdfView=findViewById(R.id.pdfview);
        pdfView.fromAsset("buschry.pdf").load();
    }
}

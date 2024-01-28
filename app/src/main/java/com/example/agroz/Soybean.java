package com.example.agroz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Soybean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soybean);

        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("Soybean.pdf").load();

    }
}
package com.example.agroz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Turmeric extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turmeric);

        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("Turmeric.pdf").load();
    }
}
package com.example.agroz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Sunflower extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunflower);

        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("Sunflower.pdf").load();
    }
}
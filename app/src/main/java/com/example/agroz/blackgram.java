package com.example.agroz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class blackgram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackgram);

        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("Black Gram.pdf").load();
    }
}
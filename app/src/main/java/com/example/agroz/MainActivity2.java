package com.example.agroz;

import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText ph;
    Button btn;
    double num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ph = findViewById(R.id.ph);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = parseDouble(ph.getText().toString());

                if (num <= 6.0 && num >=1.0) {
                    Intent i = new Intent(MainActivity2.this, acidic.class);
                    startActivity(i);
                }
                if (num <= 8.0 && num >=6.0) {
                    Intent i = new Intent(MainActivity2.this, neutral.class);
                    startActivity(i);
                }
                if (num <= 14.0 && num >=8) {
                    Intent i = new Intent(MainActivity2.this, basic.class);
                    startActivity(i);
                }
            }
        });
    }
}
package com.example.agroz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class cropdiseases extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cropdiseases);
        listView = (ListView) findViewById(R.id.list_view);
        List<String> list= new ArrayList<>();
        list.add("Wheat");
        list.add("Sorghum");
        list.add("Soybean");
        list.add("Maize");
        list.add("Sugarcane");
        list.add("Groundnut");
        list.add("Cotton");
        list.add("Rice");
        list.add("Sunflower");
        list.add("Sesame");
        list.add("Turmeric");
        list.add("Tobacco");
        list.add("Bengal Gram");
        list.add("Pearl millet");
        list.add("Black Gram");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    startActivity(new Intent(cropdiseases.this,Wheat.class));
                }
                else if (i==1){
                    startActivity(new Intent(cropdiseases.this,Sorghum.class));
                }
                else if (i==2){
                    startActivity(new Intent(cropdiseases.this,Soybean.class));
                }
                else if (i==3){
                    startActivity(new Intent(cropdiseases.this,Miaze.class));
                }
                else if (i==4){
                    startActivity(new Intent(cropdiseases.this,Sugarcane.class));
                }
                else if (i==5){
                    startActivity(new Intent(cropdiseases.this,Groundnut.class));
                }
                else if (i==6){
                    startActivity(new Intent(cropdiseases.this,Cotton.class));
                }
                else if (i==7){
                    startActivity(new Intent(cropdiseases.this,Rice.class));
                }
                else if (i==8){
                    startActivity(new Intent(cropdiseases.this,Sunflower.class));
                }
                else if (i==9){
                    startActivity(new Intent(cropdiseases.this,Sesame.class));
                }
                else if (i==10){
                    startActivity(new Intent(cropdiseases.this,Turmeric.class));
                }
                else if (i==11){
                    startActivity(new Intent(cropdiseases.this,Tobacco.class));
                }
                else if (i==12){
                    startActivity(new Intent(cropdiseases.this,bengalgram.class));
                }
                else if (i==13){
                    startActivity(new Intent(cropdiseases.this,pearlmillet.class));
                }
                else if (i==14){
                    startActivity(new Intent(cropdiseases.this,blackgram.class));
                }


            }
        });



    }
}
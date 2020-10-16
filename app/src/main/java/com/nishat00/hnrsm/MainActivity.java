package com.nishat00.hnrsm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Halima Sadia Tabassum","Mahadia Tarannum","Nishat Tafannum","Rezwana Karim Misty"," SN Richi","Tanha Tabassum","Tasnim Sharmi","Wasika Nuha"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myListView adapter=new myListView(this, maintitle);
        list=(ListView)findViewById(R.id.listView);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    Intent halima = new Intent(getApplicationContext(),HalimaActivity.class);
                    startActivity(halima);
                    Toast.makeText(getApplicationContext(),"Halima Sadia Tabassum",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1) {
                    Intent mahadia = new Intent(getApplicationContext(),MahadiaActivity.class);
                    startActivity(mahadia);
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.LENGTH_SHORT).show();
                }

                else if(position == 2) {

                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {

                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {

                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

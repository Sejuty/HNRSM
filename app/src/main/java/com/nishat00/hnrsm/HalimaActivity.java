package com.nishat00.hnrsm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HalimaActivity extends AppCompatActivity {

    public void clickHalima(View v){
        Intent bHalima = new Intent(getApplicationContext(),bHalimaActivity.class);
        startActivity(bHalima);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halima);
    }
}
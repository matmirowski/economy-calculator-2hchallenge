package com.example.kalkulator_wskaznikow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickPlynnosc(View view) {
        Intent intent = new Intent(this, PlynnoscActivity.class);
        startActivity(intent);
    }

    public void onClickRentownosc(View view) {
        Intent intent = new Intent(this, RentownoscActivity.class);
        startActivity(intent);
    }

    public void onClickZadluzenie(View view) {
        Intent intent = new Intent(this, ZadluzenieActivity.class);
        startActivity(intent);
    }
}
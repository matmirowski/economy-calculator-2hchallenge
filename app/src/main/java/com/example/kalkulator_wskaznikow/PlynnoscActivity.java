package com.example.kalkulator_wskaznikow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PlynnoscActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plynnosc);
    }

    public void onClickObliczPlynnosc(View view) {
        EditText aktywaText = findViewById(R.id.plynnosc_aktywa);
        EditText zobowiazaniaText = findViewById(R.id.plynnosc_zobowiazania);
        EditText zapasyText = findViewById(R.id.plynnosc_zapasy);
        EditText srodkiText = findViewById(R.id.plynnosc_srodki);
        int aktywa = Integer.parseInt(aktywaText.getText().toString());
        int zobowiazania = Integer.parseInt(zobowiazaniaText.getText().toString());
        int zapasy = Integer.parseInt(zapasyText.getText().toString());
        int srodki = Integer.parseInt(srodkiText.getText().toString());

        float plynnoscBiezaca = (float)aktywa / (float)zobowiazania;
        float plynnoscPodwyzszona = (float) (aktywa - zapasy) / (float)zobowiazania;
        float plynnoscGotowkowa = (float)srodki / (float)zobowiazania;

        TextView result1 = findViewById(R.id.plynnosc_biezaca_text);
        TextView result2 = findViewById(R.id.plynnosc_podwyzszona_text);
        TextView result3 = findViewById(R.id.plynnosc_gotowkowa_text);

        result1.setVisibility(View.VISIBLE);
        result2.setVisibility(View.VISIBLE);
        result3.setVisibility(View.VISIBLE);

        result1.setText("Plynność bieżąca: " + String.valueOf(plynnoscBiezaca));
        result2.setText("Plynność podwyższona: " + String.valueOf(plynnoscPodwyzszona));
        result3.setText("Plynność gotówkowa: " + String.valueOf(plynnoscGotowkowa));
    }
}
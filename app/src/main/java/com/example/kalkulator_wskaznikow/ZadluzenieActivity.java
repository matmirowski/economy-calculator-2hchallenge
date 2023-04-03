package com.example.kalkulator_wskaznikow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ZadluzenieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zadluzenie);
    }

    public void onClickObliczZadluzenie(View view) {
        EditText zobowiazaniaText = findViewById(R.id.zadluzenie_zobowiazania_text);
        EditText aktywaText = findViewById(R.id.zadluzenie_aktywa_text);
        EditText kapitalText = findViewById(R.id.zadluzenie_kapital_text);

        int zobowiazania = Integer.parseInt(zobowiazaniaText.getText().toString());
        int aktywa = Integer.parseInt(aktywaText.getText().toString());
        int kapital = Integer.parseInt(kapitalText.getText().toString());

        float zadluzenieOgolem = (float)zobowiazania / (float)aktywa;
        float finansowanieWlasne = (float)kapital / (float)aktywa;

        TextView result1 = findViewById(R.id.zadluzenie_zadluzenie_text);
        TextView result2 = findViewById(R.id.zadluzenie_finansowanie_text);

        result1.setVisibility(View.VISIBLE);
        result2.setVisibility(View.VISIBLE);

        result1.setText("Zadłużenie ogółem: " + String.valueOf(zadluzenieOgolem));
        result2.setText("Finansowanie własne: " + String.valueOf(finansowanieWlasne));

    }
}
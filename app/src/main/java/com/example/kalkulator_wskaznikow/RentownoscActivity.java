package com.example.kalkulator_wskaznikow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RentownoscActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rentownosc);
    }

    public void onClickObliczRentownosc(View view) {
        EditText zyskText = findViewById(R.id.zysk_netto_text);
        EditText przychodText = findViewById(R.id.przychody_sprzedaz_text);
        EditText aktywaText = findViewById(R.id.aktywa_ogolem_text);
        EditText kapitalText = findViewById(R.id.kapital_wlasny_text);
        int zysk = Integer.parseInt(zyskText.getText().toString());
        int przychod = Integer.parseInt(przychodText.getText().toString());
        int aktywa = Integer.parseInt(aktywaText.getText().toString());
        int kapital = Integer.parseInt(kapitalText.getText().toString());

        float ros = (float)zysk / (float)przychod;
        float roa = (float)zysk / (float)aktywa;
        float roe = (float)zysk / (float)kapital;

        TextView result1 = findViewById(R.id.ros_text);
        TextView result2 = findViewById(R.id.roa_text);
        TextView result3 = findViewById(R.id.roe_text);

        result1.setVisibility(View.VISIBLE);
        result2.setVisibility(View.VISIBLE);
        result3.setVisibility(View.VISIBLE);

        result1.setText("ROS: " + String.valueOf(ros));
        result2.setText("ROA: " + String.valueOf(roa));
        result3.setText("ROE: " + String.valueOf(roe));

    }
}
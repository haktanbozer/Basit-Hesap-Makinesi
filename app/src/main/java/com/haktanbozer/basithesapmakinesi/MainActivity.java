package com.haktanbozer.basithesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText etSayi1, etSayi2;
    Button btnTopla, btnCikar, btnCarp, btnBol;
    TextView twSonuc;

    double sayi1, sayi2, sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSayi1 = findViewById(R.id.etSayi1);
        etSayi2 = findViewById(R.id.etSayi2);
        btnTopla = findViewById(R.id.btnTopla);
        btnCikar = findViewById(R.id.btnCikar);
        btnCarp = findViewById(R.id.btnCarp);
        btnBol = findViewById(R.id.btnBol);
        twSonuc = findViewById(R.id.twSonuc);

    }

    public void btnToplaClick(View view) {
        sayi1 = Double.parseDouble(etSayi1.getText().toString());
        sayi2 = Double.parseDouble(etSayi2.getText().toString());

        sonuc = sayi1+sayi2;

        twSonuc.setText("SONUC = "+sonuc);
    }

    public void btnCikarClick(View view) {
        sayi1 = Double.parseDouble(etSayi1.getText().toString());
        sayi2 = Double.parseDouble(etSayi2.getText().toString());

        sonuc = sayi1-sayi2;

        twSonuc.setText("SONUC = "+sonuc);
    }

    public void btnCarpClick(View view) {
        sayi1 = Double.parseDouble(etSayi1.getText().toString());
        sayi2 = Double.parseDouble(etSayi2.getText().toString());

        sonuc = sayi1*sayi2;

        twSonuc.setText("SONUC = "+sonuc);
    }

    public void btnBolClick(View view) {
        sayi1 = Double.parseDouble(etSayi1.getText().toString());
        sayi2 = Double.parseDouble(etSayi2.getText().toString());

        sonuc = sayi1/sayi2;

        twSonuc.setText("SONUC = "+sonuc);
    }
}
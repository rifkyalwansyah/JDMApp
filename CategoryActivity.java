package com.as.jdmapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

// Tombol untuk Mazda (sekarang menggunakan ImageButton)
        ImageButton buttonMazda = findViewById(R.id.button_mazda);
        buttonMazda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk MazdaActivity
                Intent intent = new Intent(CategoryActivity.this, MazdaActivity.class);
                startActivity(intent);
            }
        });


        // Tombol untuk Honda
        ImageButton buttonHonda = findViewById(R.id.button_honda);
        buttonHonda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk HondaActivity
                Intent intent = new Intent(CategoryActivity.this, HondaActivity.class);
                startActivity(intent);
            }
        });

        // Tombol untuk Nissan
        ImageButton buttonNissan = findViewById(R.id.button_nissan);
        buttonNissan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk NissanActivity
                Intent intent = new Intent(CategoryActivity.this, NissanActivity.class);
                startActivity(intent);
            }
        });

        // Tombol untuk Toyota
        ImageButton buttonToyota = findViewById(R.id.button_toyota);
        buttonToyota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk ToyotaActivity
                Intent intent = new Intent(CategoryActivity.this, ToyotaActivity.class);
                startActivity(intent);
            }
        });

        // Tombol untuk Subaru
        ImageButton buttonSubaru = findViewById(R.id.button_subaru);
        buttonSubaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk SubaruActivity
                Intent intent = new Intent(CategoryActivity.this, SubaruActivity.class);
                startActivity(intent);
            }
        });

        // Tombol untuk Mitsubishi
        ImageButton buttonMitsubishi = findViewById(R.id.button_mitsubishi);
        buttonMitsubishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk MitsubishiActivity
                Intent intent = new Intent(CategoryActivity.this, MitsubishiActivity.class);
                startActivity(intent);
            }
        });
    }
}

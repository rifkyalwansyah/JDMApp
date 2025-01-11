package com.as.jdmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubaruActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subaru);
        // Temukan tombol Category
        Button button = findViewById(R.id.buttonwrx);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk pindah ke CategoryActivity
                Intent intent = new Intent(SubaruActivity.this, activity_subaru_wrx.class);
                startActivity(intent);
            }
        });
    }
}

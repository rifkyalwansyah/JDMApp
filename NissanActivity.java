package com.as.jdmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NissanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nissan);
        // Temukan tombol Category
        Button button = findViewById(R.id.button_skyline);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk pindah ke CategoryActivity
                Intent intent = new Intent(NissanActivity.this, activity_nissan_skyline.class);
                startActivity(intent);
            }
        });
    }
}

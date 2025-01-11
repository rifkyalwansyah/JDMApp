package com.as.jdmapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MazdaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazda);

        // Temukan tombol Category
        Button button = findViewById(R.id.button_mazda);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk pindah ke CategoryActivity
                Intent intent = new Intent(MazdaActivity.this, activity_mazda_rx7.class);
                startActivity(intent);
            }
        });
    }
}

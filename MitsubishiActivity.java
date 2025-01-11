package com.as.jdmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MitsubishiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitsubishi);
        // Temukan tombol Category
        Button button = findViewById(R.id.buttonevo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk pindah ke CategoryActivity
                Intent intent = new Intent(MitsubishiActivity.this, activity_mitshubishi_lancer_evo.class);
                startActivity(intent);
            }
        });
    }
}

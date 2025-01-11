package com.as.jdmapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HondaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honda);

        // Temukan tombol Category
        Button button = findViewById(R.id.button_nsx);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk pindah ke CategoryActivity
                Intent intent = new Intent(HondaActivity.this, activity_honda_nsx.class);
                startActivity(intent);
            }
        });
    }
}

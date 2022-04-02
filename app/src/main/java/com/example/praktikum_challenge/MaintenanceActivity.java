package com.example.praktikum_challenge;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MaintenanceActivity extends AppCompatActivity {
    Button GoBackHomepageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);

        GoBackHomepageBtn = findViewById(R.id.homepage_btn);

        GoBackHomepageBtn.setOnClickListener(view -> {
            Intent intent = new Intent(MaintenanceActivity.this, HomepageActivity.class);
            startActivity(intent);
            finish();
        });
    }
}

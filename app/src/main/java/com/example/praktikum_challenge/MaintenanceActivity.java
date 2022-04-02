package com.example.praktikum_challenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MaintenanceActivity extends AppCompatActivity {
    Button GoBackHomepageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintenance);

        GoBackHomepageBtn = findViewById(R.id.homepage_btn);

        GoBackHomepageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MaintenanceActivity.this, HomepageActivity.class);
                startActivity(intent);
            }
        });

//        GoBackHomepageBtn.setOnClickListener(view -> {
//            Intent intent = new Intent(MaintenanceActivity.this, HomepageActivity.class);
//            startActivity(intent);
//        });
    }
}

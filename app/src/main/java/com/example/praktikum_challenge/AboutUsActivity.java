package com.example.praktikum_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.praktikum_challenge.databinding.ActivityAboutUsBinding;
import com.example.praktikum_challenge.databinding.ActivityDetailBukuBinding;

public class AboutUsActivity extends AppCompatActivity {
    ActivityAboutUsBinding binding;

    private ImageButton p1, p2, p3, p4, p5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAboutUsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonNavigationView.setOnItemReselectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    Intent intent = new Intent(AboutUsActivity.this, HomepageActivity.class);
                    startActivity(intent);
                    break;
                case R.id.aboutUs:
                    Intent intent1 = new Intent(AboutUsActivity.this, AboutUsActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.search:
                    Intent intent2 = new Intent(AboutUsActivity.this, MaintenanceActivity.class);
                    startActivity(intent2);
                    break;
            }
        });

        p1 = findViewById(R.id.photo_1);
        p2 = findViewById(R.id.photo_2);
        p3 = findViewById(R.id.photo_3);
        p4 = findViewById(R.id.photo_4);
        p5 = findViewById(R.id.photo_5);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ig1 = new Intent(Intent.ACTION_VIEW);
                ig1.setData(Uri.parse("https://www.instagram.com/alirafli_/"));
                startActivity(ig1);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ig2 = new Intent(Intent.ACTION_VIEW);
                ig2.setData(Uri.parse("https://www.instagram.com/rheza.frmdha/"));
                startActivity(ig2);
            }
        });

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ig3 = new Intent(Intent.ACTION_VIEW);
                ig3.setData(Uri.parse("https://www.instagram.com/daffayanuardhana/"));
                startActivity(ig3);
            }
        });

        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ig4 = new Intent(Intent.ACTION_VIEW);
                ig4.setData(Uri.parse("https://www.instagram.com/danielsasongko/"));
                startActivity(ig4);
            }
        });

        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ig5 = new Intent(Intent.ACTION_VIEW);
                ig5.setData(Uri.parse("https://www.instagram.com/alfrenanday/"));
                startActivity(ig5);
            }
        });
    }
}
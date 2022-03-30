package com.example.praktikum_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AboutUsActivity extends AppCompatActivity {

    private ImageButton p1, p2, p3, p4, p5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
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
                ig2.setData(Uri.parse("https://www.instagram.com/alirafli_/"));
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
                ig4.setData(Uri.parse("https://www.instagram.com/alirafli_/"));
                startActivity(ig4);
            }
        });

        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ig5 = new Intent(Intent.ACTION_VIEW);
                ig5.setData(Uri.parse("https://www.instagram.com/alirafli_/"));
                startActivity(ig5);
            }
        });
    }
}
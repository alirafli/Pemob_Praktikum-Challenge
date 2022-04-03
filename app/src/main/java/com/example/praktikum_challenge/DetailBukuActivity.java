package com.example.praktikum_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.praktikum_challenge.databinding.ActivityDetailBukuBinding;

public class DetailBukuActivity extends AppCompatActivity {
    HomepageActivity homepageActivity;
    ActivityDetailBukuBinding binding;
    TextView judul1, penulis1, rating1, publication1, page1, publisher1, sinopsis1;
    ImageView image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBukuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonNavigationView.setOnItemReselectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    Intent intent = new Intent(DetailBukuActivity.this, HomepageActivity.class);
                    intent.putExtra("EMAIL", homepageActivity.title.getText());
                    startActivity(intent);
                    break;
                case R.id.aboutUs:
                    Intent intent1 = new Intent(DetailBukuActivity.this, AboutUsActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.search:
                    Intent intent2 = new Intent(DetailBukuActivity.this, MaintenanceActivity.class);
                    startActivity(intent2);
                    break;
            }
        });

        judul1 = findViewById(R.id.judul);
        penulis1 = findViewById(R.id.penulis);
        rating1 = findViewById(R.id.rating);
        publication1 = findViewById(R.id.publication);
        page1 = findViewById(R.id.page);
        publisher1 = findViewById(R.id.publisher);
        sinopsis1 = findViewById(R.id.sinopsis);
        image1 = findViewById(R.id.image);

        Buku buku = getIntent().getParcelableExtra("BUKU");
        image1.setImageResource(buku.getImage());
        judul1.setText(buku.getJudul());
        penulis1.setText(buku.getPenulis());
        rating1.setText("Rating: " + String.valueOf(buku.getRating()));
        publisher1.setText("Publisher: " + buku.getPublisher());
        publication1.setText("Publication: " + buku.getPublication_year());
        page1.setText("Page: " + String.valueOf(buku.getPage()));
        sinopsis1.setText(buku.getSinopsis());
    }
}
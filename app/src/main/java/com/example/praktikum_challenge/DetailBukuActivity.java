package com.example.praktikum_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailBukuActivity extends AppCompatActivity {
    TextView judul1, penulis1, rating1, publication1, page1, publisher1, sinopsis1;
    ImageView image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buku);
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
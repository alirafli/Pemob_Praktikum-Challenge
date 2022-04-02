package com.example.praktikum_challenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.praktikum_challenge.databinding.ActivityAboutUsBinding;
import com.example.praktikum_challenge.databinding.ActivityHomepageBinding;

import java.util.ArrayList;

public class HomepageActivity extends AppCompatActivity {
    ActivityHomepageBinding binding;
    TextView title;
    ArrayList<Buku> bukuArrayList = new ArrayList<>();
    RecyclerView recyclerView;
    AdapaterRecycleView adapaterRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomepageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        title = findViewById(R.id.title);
        Intent getData = getIntent();
        title.setText("Hi, " + getData.getStringExtra("EMAIL"));

        binding.buttonNavigationView.setOnItemReselectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    Intent intent = new Intent(HomepageActivity.this, HomepageActivity.class);
                    startActivity(intent);
                    break;
                case R.id.aboutUs:
                    Intent intent1 = new Intent(HomepageActivity.this, AboutUsActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.search:
                    Intent intent2 = new Intent(HomepageActivity.this, MaintenanceActivity.class);
                    startActivity(intent2);
                    break;
            }
        });

        recyclerView = findViewById(R.id.recycleview);

        adapaterRecycleView = new AdapaterRecycleView(bukuArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapaterRecycleView);
        tambahData();
    }

    public void tambahData() {
        Buku buku1 = new Buku("The Alchemist", "Paulo Caelho", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "Gramedia", "2001", 8.7, 129, R.drawable.buku1);
        Buku buku2 = new Buku("Bumi", "Tere Liye", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "Gramedia", "2001", 8.7, 129, R.drawable.buku2);
        Buku buku3 = new Buku("Bulan", "Tere Liye", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "Gramedia", "2001", 8.7, 129, R.drawable.buku3);
        Buku buku4 = new Buku("Hujan", "Tere Liye", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "Gramedia", "2001", 8.7, 129, R.drawable.buku4);
        Buku buku5 = new Buku("Bintang", "Tere Liye", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "Gramedia", "2001", 8.7, 129, R.drawable.buku5);
        Buku buku6 = new Buku("Sunset & Rosie", "Tere Liye", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "Gramedia", "2001", 8.7, 129, R.drawable.buku6);
        Buku buku7 = new Buku("Lupus", "Hilman Hariwijaya", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "Gramedia", "2001", 8.7, 129, R.drawable.buku7);
        Buku buku8 = new Buku("Orang-orang Biasa", "Andrea Hirata", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "Gramedia", "2001", 8.7, 129, R.drawable.buku8);
        Buku buku9 = new Buku("Kisah Tanah Jawa", "Mada Zidan", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "Gramedia", "2001", 8.7, 129, R.drawable.buku9);
        Buku buku10 = new Buku("Five Feet Apart", "Rachael Lippincott", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "Gramedia", "2001", 8.7, 129, R.drawable.buku10);
        bukuArrayList.add(buku1);
        bukuArrayList.add(buku2);
        bukuArrayList.add(buku3);
        bukuArrayList.add(buku4);
        bukuArrayList.add(buku5);
        bukuArrayList.add(buku6);
        bukuArrayList.add(buku7);
        bukuArrayList.add(buku8);
        bukuArrayList.add(buku9);
        bukuArrayList.add(buku10);

    }
}
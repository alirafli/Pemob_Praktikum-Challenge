package com.example.praktikum_challenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomepageActivity extends AppCompatActivity {
    ArrayList<Buku> bukuArrayList = new ArrayList<>();
    RecyclerView recyclerView;
    AdapaterRecycleView adapaterRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        recyclerView = findViewById(R.id.recycleview);

        adapaterRecycleView = new AdapaterRecycleView(bukuArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapaterRecycleView);
        tambahData();
    }
    public void tambahData(){
        Buku buku =new Buku("The Alchemist", "Paulo Caelho", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "daniel", "2001",8.7, 129, R.drawable.buku1);
        bukuArrayList.add(buku);
        Buku buku1 =new Buku("The Alchemist", "Paulo Caelho", "The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, learns the true importance of who he is and how to improve himself and focus on what really matters in life", "daniel", "2001",8.7, 129, R.drawable.buku1);
        bukuArrayList.add(buku1);
    }
}
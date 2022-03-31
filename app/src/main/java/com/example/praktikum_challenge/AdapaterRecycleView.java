package com.example.praktikum_challenge;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapaterRecycleView extends RecyclerView.Adapter<AdapaterRecycleView.AdapterViewHolder> {
    ArrayList<Buku> bukuArrayList ;

    public AdapaterRecycleView(ArrayList<Buku> bukuArrayList) {
        this.bukuArrayList = bukuArrayList;
    }

    @NonNull
    @Override
    public AdapaterRecycleView.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapaterRecycleView.AdapterViewHolder holder, int position) {
        final Buku buku = bukuArrayList.get(position);
        holder.Image.setImageResource(buku.getImage());
        holder.Judul.setText(buku.getJudul());
        holder.Penulis.setText(buku.getPenulis());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailBukuActivity.class);
                intent.putExtra("BUKU", buku);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return bukuArrayList.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {
        ImageView Image;
        TextView Judul, Penulis;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            Image = itemView.findViewById(R.id.image);
            Judul = itemView.findViewById(R.id.judul);
            Penulis = itemView.findViewById(R.id.penulis);
        }
    }
}

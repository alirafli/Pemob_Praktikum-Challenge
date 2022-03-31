package com.example.praktikum_challenge;

import android.os.Parcel;
import android.os.Parcelable;

public class Buku implements Parcelable {
    private String judul, penulis, sinopsis, publisher, publication_year;
    private double rating;
    private int page, image;

    public Buku(String judul, String penulis, String sinopsis, String publisher, String publication_year, double rating, int page, int image) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
        this.publisher = publisher;
        this.publication_year = publication_year;
        this.rating = rating;
        this.page = page;
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublication_year() {
        return publication_year;
    }

    public void setPublication_year(String publication_year) {
        this.publication_year = publication_year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeString(this.penulis);
        dest.writeString(this.sinopsis);
        dest.writeString(this.publisher);
        dest.writeString(this.publication_year);
        dest.writeDouble(this.rating);
        dest.writeInt(this.page);
        dest.writeInt(this.image);
    }

    public void readFromParcel(Parcel source) {
        this.judul = source.readString();
        this.penulis = source.readString();
        this.sinopsis = source.readString();
        this.publisher = source.readString();
        this.publication_year = source.readString();
        this.rating = source.readDouble();
        this.page = source.readInt();
        this.image = source.readInt();
    }

    protected Buku(Parcel in) {
        this.judul = in.readString();
        this.penulis = in.readString();
        this.sinopsis = in.readString();
        this.publisher = in.readString();
        this.publication_year = in.readString();
        this.rating = in.readDouble();
        this.page = in.readInt();
        this.image = in.readInt();
    }

    public static final Creator<Buku> CREATOR = new Creator<Buku>() {
        @Override
        public Buku createFromParcel(Parcel source) {
            return new Buku(source);
        }

        @Override
        public Buku[] newArray(int size) {
            return new Buku[size];
        }
    };
}

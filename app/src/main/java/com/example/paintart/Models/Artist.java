package com.example.paintart.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Artist implements Parcelable {

    private String name;
    private int image;
    private String Description;

    private String url;


    public Artist(String name, int image, String description,String url) {
        this.name = name;
        this.image = image;
        this.Description = description;
        this.url = url;
    }

    public Artist(Artist product) {
        this.name = product.name;
        this.image = product.image;
        this.Description = product.Description;
        this.url = product.url;
    }

    protected Artist(Parcel in) {
        name = in.readString();
        image = in.readInt();
        Description = in.readString();
        url = in.readString();
    }


    public static final Creator<Artist> CREATOR = new Creator<Artist>() {
        @Override
        public Artist createFromParcel(Parcel in) {
            return new Artist(in);
        }

        @Override
        public Artist[] newArray(int size) {
            return new Artist[size];
        }
    };

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return Description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(image);
        parcel.writeString(Description);
        parcel.writeString(url);

    }
}

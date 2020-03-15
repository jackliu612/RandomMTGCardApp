package com.example.helloworld;

import androidx.annotation.NonNull;
import com.google.gson.annotations.SerializedName;

public class Card {

    private String name;
    @SerializedName("cmc")
    private int cost;
    @SerializedName("oracle_text")
    private String text;
    @SerializedName("image_uris")
    private ImageURIs imageLinks;

    public Card(String name, int cost, String text, ImageURIs imageLinks) {
        this.name = name;
        this.cost = cost;
        this.text = text;
        this.imageLinks = imageLinks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ImageURIs getImageLinks() {
        return imageLinks;
    }

    public void setImageLinks(ImageURIs imageLinks) {
        this.imageLinks = imageLinks;
    }

    @Override
    @NonNull
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", text='" + text + '\'' +
                ", imageLinks=" + imageLinks +
                '}';
    }
}
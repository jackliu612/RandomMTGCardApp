package com.example.helloworld;

import androidx.annotation.NonNull;

public class ImageURIs {

    private String small;
    private String normal;
    private String large;
    private String png;
    private String artCrop;
    private String borderCrop;

    public ImageURIs(String small, String normal, String large, String png, String artCrop, String borderCrop) {
        this.small = small;
        this.normal = normal;
        this.large = large;
        this.png = png;
        this.artCrop = artCrop;
        this.borderCrop = borderCrop;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getNormal() {
        return normal;
    }

    public void setNormal(String normal) {
        this.normal = normal;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }

    public String getArtCrop() {
        return artCrop;
    }

    public void setArtCrop(String artCrop) {
        this.artCrop = artCrop;
    }

    public String getBorderCrop() {
        return borderCrop;
    }

    public void setBorderCrop(String borderCrop) {
        this.borderCrop = borderCrop;
    }

    @Override
    @NonNull
    public String toString() {
        return "ImageURIs{" +
                "small='" + small + '\'' +
                ", normal='" + normal + '\'' +
                ", large='" + large + '\'' +
                ", png='" + png + '\'' +
                ", artCrop='" + artCrop + '\'' +
                ", borderCrop='" + borderCrop + '\'' +
                '}';
    }
}

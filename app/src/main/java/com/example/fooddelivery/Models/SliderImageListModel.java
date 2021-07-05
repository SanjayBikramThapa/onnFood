package com.example.fooddelivery.Models;

public class SliderImageListModel {
    private String description;
    private String imageUrl;

    SliderImageListModel(){

    }
    public SliderImageListModel(String description, String img){
        this.description = description;
        this.imageUrl = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

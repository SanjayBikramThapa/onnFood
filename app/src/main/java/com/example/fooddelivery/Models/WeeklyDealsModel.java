package com.example.fooddelivery.Models;

import de.hdodenhof.circleimageview.CircleImageView;

public class WeeklyDealsModel {
    private String image;
    private String foodName;
    private String Price;

    WeeklyDealsModel(){

    }
    public WeeklyDealsModel(String image, String foodName, String price){
        this.image =image;
        this.foodName= foodName;
        this.Price=price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }
}

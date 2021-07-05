package com.example.fooddelivery.Models;

public class OurPartnerModel {
    private String image;
    private String foodName;

    public OurPartnerModel(){
        // need one null model function.
    }
    public OurPartnerModel(String image, String foodName){
        this.image =image;
        this.foodName= foodName;
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
}

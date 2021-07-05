package com.example.fooddelivery.Models;

public class FoodBeverageModel{
    private String image;
    private String foodName;
    private String foodInfo;
    private String price;

    FoodBeverageModel(){

    }
    public FoodBeverageModel(String image,String foodName, String foodInfo,String price){
        this.image=image;
        this.foodName=foodName;
        this.foodInfo=foodInfo;
        this.price=price;
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

    public String getFoodInfo() {
        return foodInfo;
    }

    public void setFoodInfo(String foodInfo) {
        this.foodInfo = foodInfo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

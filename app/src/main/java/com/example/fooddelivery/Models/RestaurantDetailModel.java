package com.example.fooddelivery.Models;

public class RestaurantDetailModel {
    private String image;
    private String name;
    private String inform;
    private String price;

    RestaurantDetailModel(){


    }
    public RestaurantDetailModel( String image,String name, String inform, String price){
        this.image =image;
        this.name=name;
        this.inform=inform;
        this.price= price;

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInform() {
        return inform;
    }

    public void setInform(String inform) {
        this.inform = inform;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

package com.example.fooddelivery.Models;

public class CategoryModel {
     private String image;
     private String name;
     private String Description;

     CategoryModel(){

     }

     public CategoryModel(String image,String name,String Description){
         this.image = image;
         this.name= name;
         this.Description=Description;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

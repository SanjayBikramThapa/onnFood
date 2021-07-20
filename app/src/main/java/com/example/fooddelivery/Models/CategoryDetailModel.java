package com.example.fooddelivery.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryDetailModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("image")
    @Expose
    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}



//import com.google.gson.annotations.Expose;
//import com.google.gson.annotations.SerializedName;
//
//
//    public class CategoryDetailModel {
//
//        @SerializedName("id")
//        @Expose
//        private Integer id;
//        @SerializedName("category")
//        @Expose
//        private String category;
//        @SerializedName("status")
//        @Expose
//        private Integer status;
//
//        public Integer getId() {
//            return id;
//        }
//
//        public void setId(Integer id) {
//            this.id = id;
//        }
//
//        public String getCategory() {
//            return category;
//        }
//
//        public void setCategory(String category) {
//            this.category = category;
//        }
//
//        public Integer getStatus() {
//            return status;
//        }
//
//        public void setStatus(Integer status) {
//            this.status = status;
//        }
//
//    }
//

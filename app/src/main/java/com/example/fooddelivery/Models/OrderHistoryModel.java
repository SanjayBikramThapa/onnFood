package com.example.fooddelivery.Models;

import com.example.fooddelivery.OrderHistory;

import java.util.Date;

public class OrderHistoryModel {
    private String name;
    private String desc;
    private String image;
    private String date;
    private String status;


    OrderHistoryModel(){

    }

    public OrderHistoryModel(String name, String desc, String image, String date, String status){
        this.name=name;
        this.desc= desc;
        this.image=image;
        this.date=date;
        this.status=status;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}

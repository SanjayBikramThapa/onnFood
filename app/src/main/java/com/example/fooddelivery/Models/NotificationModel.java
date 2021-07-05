package com.example.fooddelivery.Models;

public class NotificationModel {
    private String OfferName;
    private String offerDate;
    private String offerDesc;

    NotificationModel(){
        // null
    }
    public NotificationModel(String OfferName, String offerDate,String offerDesc){
        this.OfferName= OfferName;
        this.offerDate = offerDate;
        this.offerDesc = offerDesc;
    }

    public String getOfferName() {
        return OfferName;
    }

    public void setOfferName(String offerName) {
        OfferName = offerName;
    }

    public String getOfferDate() {
        return offerDate;
    }

    public void setOfferDate(String offerDate) {
        this.offerDate = offerDate;
    }

    public String getOfferDesc() {
        return offerDesc;
    }

    public void setOfferDesc(String offerDesc) {
        this.offerDesc = offerDesc;
    }
}

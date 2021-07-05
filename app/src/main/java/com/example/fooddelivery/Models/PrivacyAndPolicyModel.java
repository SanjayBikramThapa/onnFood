package com.example.fooddelivery.Models;

public class PrivacyAndPolicyModel {
    private String  privacy;

    PrivacyAndPolicyModel(){

    }

    public PrivacyAndPolicyModel(String privacy){
        this.privacy= privacy;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }
}

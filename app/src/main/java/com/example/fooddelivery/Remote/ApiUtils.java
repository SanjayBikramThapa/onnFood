package com.example.fooddelivery.Remote;

public class ApiUtils {
    private static String baseUrl="http://onnfood.oxfordcollege.edu.np/api/";

            public static ApiService ApiService(){
                return RetrofitClient.getClient(baseUrl).create(ApiService.class);

            }
}

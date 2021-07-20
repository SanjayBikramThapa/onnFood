package com.example.fooddelivery.Remote;

import com.example.fooddelivery.Models.CategoryDetailModel;
import com.example.fooddelivery.Models.ProductModel;
import com.example.fooddelivery.Models.ProductOfferModel;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @POST("login")
    Call<ResponseBody> userLogin(
            @Query("email")String email, @Query("password") String password);

    @POST("register")
    Call<ResponseBody> userRegister(
            @Query("fname")String fname,
            @Query("lname") String lname,
            @Query("phone") String phone,
            @Query("email") String email,
            @Query("password") String password
    );

    @POST("verifyotp")
    Call<ResponseBody> userRegistrationVerify(
            @Query("email")String email,
            @Query("otp_code") String otp_code
    );

    @GET("user")
    Call<ResponseBody> userDetails(
            @Query("id")String id

    );
    @GET("product/all")
    Call<List<ProductModel>> productAll(
    );

    @GET("category/details")
    Call<List<CategoryDetailModel>> categoryDetails(
            );

    @GET("offer/view")
    Call<List<ProductOfferModel>> offerDetails(
    );




}

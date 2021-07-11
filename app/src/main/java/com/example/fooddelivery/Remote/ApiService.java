package com.example.fooddelivery.Remote;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @POST("login")
    Call<ResponseBody> userLogin(
            @Query("email")String email, @Query("password") String password);

}

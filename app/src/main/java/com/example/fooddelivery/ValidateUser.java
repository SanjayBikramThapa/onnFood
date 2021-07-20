package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fooddelivery.Remote.ApiService;
import com.example.fooddelivery.Remote.ApiUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ValidateUser extends AppCompatActivity {
    EditText otpcode;
    Button submit;
    String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_user);

        //getting data of email address which is passed through intent from Register
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            email = bundle.getString("Email");
        }
       // Log.v("abc",email);
        otpcode = findViewById(R.id.etOtpCode);
        submit = findViewById(R.id.btnSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            userRegisterValidate();


            }
        });

    }

    private void userRegisterValidate() {
         Log.v("abc",email);

        ApiService apiService = ApiUtils.ApiService();
        apiService.userRegistrationVerify(email,otpcode.getText().toString().trim()).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
            Toast.makeText(ValidateUser.this, "" + response.code(), Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ValidateUser.this, LogIn.class));

//                String val= null;
                try {
                    assert response.body() != null;
                    String   val = response.body().string();
                    Log.v("abc",val);
                    Log.v("abc1", String.valueOf(response.code()));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Log.v("abc","vhdfhdhfdhfdh");
//                Log.v("abc1",response.code().toString());

//                if (response.code()==200)
//                {
//
//                    try {
//                        assert response.body() != null;
//                        String val= response.body().string();
//                        JSONObject obj= new JSONObject(val);
//                        String message = obj.getString("message");
//
//                        Toast.makeText(ValidateUser.this, "" + message, Toast.LENGTH_SHORT).show();
//
//
//
//                    } catch (IOException | JSONException e) {
//                        e.printStackTrace();
//                    }
//
//                    //Toast.makeText(PasswordResetEmailVerificationActivity.this, "Email is valid ", Toast.LENGTH_SHORT).show();
//
//                    startActivity(new Intent(ValidateUser.this, LogIn.class));
//                }
//                else{
//                    Toast.makeText(ValidateUser.this, "failed to verify user for registration ", Toast.LENGTH_SHORT).show();
//                }
            }


            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(ValidateUser.this, "Error" +t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
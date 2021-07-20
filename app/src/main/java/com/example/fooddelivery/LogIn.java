package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fooddelivery.Remote.ApiService;
import com.example.fooddelivery.Remote.ApiUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.regex.Pattern;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LogIn extends AppCompatActivity {
    TextView tvRegister, tvLoginReset;
    Button btLogin;
    EditText email, password;
    SharedPreferences sharedPreferences;

    // creating shared preference name and key name
//    private static final String SHARED_PREF_NAME = "myPref";
//    private static final String KEY_EMAIL = "email";
//    private static final String KEY_PASS = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);


        tvRegister = findViewById(R.id.tvRegister);
        tvRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogIn.this, Registration.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        tvLoginReset = findViewById(R.id.tvLoginReset);
        tvLoginReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(LogIn.this, ResetActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);

            }
        });

        email = findViewById(R.id.etLoginEmail);
        password = findViewById(R.id.etLoginPassword);

        btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (!validatePassword() | !validateEmail()) {
                    return;
                } else {
                    UserLogin();
                }


            }
        });
    }

    private void UserLogin() {
        ApiService api = ApiUtils.ApiService();
        api.userLogin(email.getText().toString(), password.getText().toString()).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                Log.v("abc1","sanjay login");

                if (response.isSuccessful()) {
                    try {
                        assert response.body() != null;
                        String a = response.body().string();
                        JSONObject b = new JSONObject(a);
                        String c = b.getString("user");
                        JSONObject d = new JSONObject(c);
                        String id = d.getString("id");
                        String fname = d.getString("fname");
                        String lname = d.getString("lname");
                        String phone = d.getString("phone");
                        String email_verified_at = d.getString("email_verified_at");
                      //  Log.v("fdf",typeof(email_verified_at));
                        if (!email_verified_at.equals("null")) {

                            Toast.makeText(LogIn.this, "success", Toast.LENGTH_SHORT).show();

                            SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);
                            SharedPreferences.Editor loginPreferences = sharedPreferences.edit();
                            loginPreferences.putString("email", email.getText().toString());
                            loginPreferences.putString("userid", id);
                            loginPreferences.putString("firstname", fname);
                            loginPreferences.putString("lastname", lname);
                            loginPreferences.putString("phone", phone);
                       //    Log.v("abc",lname);
                            loginPreferences.putBoolean("isLoggedIn", true);
                            loginPreferences.apply();

                            Intent i = new Intent(LogIn.this, Home.class);
                            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(i);
                        } else {
                            Toast.makeText(LogIn.this, "User Not Verified", Toast.LENGTH_LONG).show();
                        }

                    } catch (IOException | JSONException e) {
                        e.printStackTrace();
                    }


                } else {
                    Toast.makeText(LogIn.this, "login failed", Toast.LENGTH_LONG).show();
                }

//                        Toast.makeText(LogIn.this, ""+response.code(), Toast.LENGTH_SHORT).show();


            }


            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(LogIn.this, "Error" + t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private Boolean validateEmail() {
        String val = email.getText().toString();
//        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        String emailPattern = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";

        if (val.isEmpty()) {
            email.setError("Email field cannot be empty");
            return false;
        } else if (!val.matches(emailPattern)) {
            email.setError("Invalid email address");
            return false;
        } else {
            email.setError(null);
            return true;
        }
    }

    private Boolean validatePassword() {
        String val = password.getText().toString();
        String passwordVal = "^" +
                //"(?=.*[0-9])" +         //at least 1 digit
                //"(?=.*[a-z])" +         //at least 1 lower case letter
                //"(?=.*[A-Z])" +         //at least 1 upper case letter
                "(?=.*[a-zA-Z])" +      //any letter
                "(?=.*[@#$%^&+=])" +    //at least 1 special character
                "(?=\\S+$)" +           //no white spaces
                ".{4,}" +               //at least 4 characters
                "$";

        if (val.isEmpty()) {
            password.setError("Password field cannot be empty");
            return false;
        } else {
            password.setError(null);
            return true;
        }
    }


}

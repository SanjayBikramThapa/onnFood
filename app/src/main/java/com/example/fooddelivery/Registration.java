package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fooddelivery.Remote.ApiService;
import com.example.fooddelivery.Remote.ApiUtils;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Registration extends AppCompatActivity {

    EditText fname, lname, phone, email, password, cpassword;
    Button Register;
    TextView Login;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Login = findViewById(R.id.tvLogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registration.this, LogIn.class);
                startActivity(intent);
            }
        });


        Register = findViewById(R.id.btRegister);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!validatePassword() | !validateEmail() | !validatePasswordCheck()) {
                    return;
                } else {
                    UserRegistration();
                }

            }
        });

        fname = findViewById(R.id.etRegFirstName);
        lname = findViewById(R.id.etRegLastName);
        phone = findViewById(R.id.etRegPhoneNumber);
        email = findViewById(R.id.etRegEmail);
        cpassword = findViewById(R.id.etRegConfirmPassword);
        password = findViewById(R.id.etPassword);

    }

    private void UserRegistration() {
        ApiService apiService = ApiUtils.ApiService();
        apiService.userRegister(fname.getText().toString(), lname.getText().toString(), phone.getText().toString(), email.getText().toString(), cpassword.getText().toString()).enqueue(new Callback<ResponseBody>() {


            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(Registration.this, "User Created Successfully", Toast.LENGTH_SHORT).show();
                    //passing email address for user registration verification

                    Intent intent = new Intent(Registration.this, ValidateUser.class);
                    intent.putExtra("Email", email.getText().toString().trim());
                    //  Log.v("abc",email.getText().toString());

                    startActivity(intent);
                    finish();
                    //startActivity(new Intent(Registration.this, ValidateUser.class));

                } else {
                    Toast.makeText(Registration.this, "register failed", Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(Registration.this, "Error" + t.getMessage(), Toast.LENGTH_SHORT).show();
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
            //Email.setErrorEnabled(false);
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
            // Password.setErrorEnabled(false);
            return true;
        }
    }

    private Boolean validatePasswordCheck() {
        String val = password.getText().toString();
        String val1 = cpassword.getText().toString();

        if (!val.equals(val1)) {
            cpassword.setError("password didnot matched!!please re-type password");
            return false;
        } else {
            cpassword.setError(null);
            return true;
        }
    }
}





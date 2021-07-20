package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class UserProfile extends AppCompatActivity {
    TextView uFirstName,uEmail,uLastName,uPhone;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String s1 = sh.getString("userid","");
        String s2 = sh.getString("email","");
        String s3 = sh.getString("firstname","");
        String s4 = sh.getString("lastname","");
        String s5 = sh.getString("phone","");


        setContentView(R.layout.activity_user_profile);
        uEmail=findViewById(R.id.etUserEmail);
        uFirstName=findViewById(R.id.etUserProfileName);
        uLastName=findViewById(R.id.etUserLastName);
        uPhone = findViewById(R.id.etUserPhoneNo);

        uEmail.setText(s2);
        uFirstName.setText(s3);
        uLastName.setText(s4);
        uPhone.setText(s5);
    }
}
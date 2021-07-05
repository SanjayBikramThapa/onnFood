package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DeliveryAddress extends AppCompatActivity {

    Button btaddAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_address);

        btaddAddress = findViewById(R.id.btaddAddress);
        btaddAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  intent = new Intent(DeliveryAddress.this,ConfirmCart.class);
                startActivity(intent);
                Toast.makeText(DeliveryAddress.this, "Your Location added successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
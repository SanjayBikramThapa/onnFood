package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmCart extends AppCompatActivity {

    Button btConfirm;
    TextView tvDeliveryAddressName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_cart);

        btConfirm = findViewById(R.id.btConfirm);
        btConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConfirmCart.this, " order placed Successfully", Toast.LENGTH_SHORT).show();
            }
        });

        tvDeliveryAddressName = findViewById(R.id.tvDeliveryAddressName);
        tvDeliveryAddressName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmCart.this,DeliveryAddress.class);
                startActivity(intent);
            }
        });

    }
}
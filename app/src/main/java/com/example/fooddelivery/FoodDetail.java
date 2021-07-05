package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FoodDetail extends AppCompatActivity {

    Button btAddCart,btOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        btAddCart=findViewById(R.id.btAddCart);
        btAddCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FoodDetail.this,MyCartActivity.class);
                startActivity(intent);

            }
        });

        btOrder=findViewById(R.id.btOrder);
        btOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(FoodDetail.this,Cart.class);
                startActivity(in);
            }
        });

    }
}
package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fooddelivery.Adapters.MycartAdapter;
import com.example.fooddelivery.Adapters.NotificationAdapter;
import com.example.fooddelivery.Adapters.WeeklyDealsAdapter;
import com.example.fooddelivery.Models.MyCartModel;
import com.example.fooddelivery.Models.NotificationModel;
import com.example.fooddelivery.Models.WeeklyDealsModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartActivity extends AppCompatActivity {

    RecyclerView rcvMyCart;
    MycartAdapter adapter;
    List<MyCartModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_cart);

        rcvMyCart = findViewById(R.id.rvMyCart);
        list = new ArrayList<>();
        list.add(new MyCartModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger","Hygienic Chicken momo available only Rs 100","NPR 180"));
        list.add(new MyCartModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger","Hygienic Chicken momo available only Rs 100","NPR 180"));
        list.add(new MyCartModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger","Hygienic Chicken momo available only Rs 100","NPR 180"));
        list.add(new MyCartModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger","Hygienic Chicken momo available only Rs 100","NPR 180"));
        list.add(new MyCartModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger","Hygienic Chicken momo available only Rs 100","NPR 180"));
        list.add(new MyCartModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger","Hygienic Chicken momo available only Rs 100","NPR 180"));
        list.add(new MyCartModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Burger","Hygienic Chicken momo available only Rs 100","NPR 180"));


        rcvMyCart.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MycartAdapter(list, this);
        rcvMyCart.setAdapter(adapter);
    }
}




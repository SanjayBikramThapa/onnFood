package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import com.example.fooddelivery.Adapters.RestaurantAdapter;
import com.example.fooddelivery.Models.RestaurantModel;
import java.util.ArrayList;
import java.util.List;

public class RestaurantActivity extends AppCompatActivity {


    RecyclerView rvRestaurant;
    RestaurantAdapter adapter;
    List<RestaurantModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        rvRestaurant = findViewById(R.id.rvRestaurant);
        list = new ArrayList<>();

        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        list.add(new RestaurantModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Atali Restaurant","This is the complete veg restaurant where we provide best hygnic food."));

        rvRestaurant.setLayoutManager( new LinearLayoutManager(this));
        adapter = new RestaurantAdapter(list, this);
        rvRestaurant.setAdapter( adapter);
    }
}
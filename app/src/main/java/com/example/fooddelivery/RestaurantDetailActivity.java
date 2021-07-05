package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.fooddelivery.Adapters.OrderHistoryAdapter;
import com.example.fooddelivery.Adapters.RestaurantDetailAdapter;
import com.example.fooddelivery.Models.OrderHistoryModel;
import com.example.fooddelivery.Models.RestaurantDetailModel;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDetailActivity extends AppCompatActivity {

    RecyclerView recycle;
    RestaurantDetailAdapter adapter;
    List<RestaurantDetailModel> data;
    RatingBar ratingbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturant_detail);

        recycle= findViewById(R.id.rvRestaurant);


        data = new ArrayList<>();
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));
        data.add(new RestaurantDetailModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Pizza","This is best hygienic food now available on both chicken and veg.","Rs 180"));




        recycle.setLayoutManager( new GridLayoutManager(this,2));
        adapter = new RestaurantDetailAdapter(data, this);
        recycle.setAdapter( adapter);
    }
// rating
        public void addListenerOnButtonClick () {
            ratingbar = (RatingBar) findViewById(R.id.rtSimpleRatingBar);

            ratingbar.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    //Getting the rating and displaying it on the toast
                    String rating = String.valueOf(ratingbar.getRating());
                    Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
                }

            });
        }
    }

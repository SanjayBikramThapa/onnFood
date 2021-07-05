package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fooddelivery.Adapters.OrderHistoryAdapter;
import com.example.fooddelivery.Models.OrderHistoryModel;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory extends AppCompatActivity {
 RecyclerView rcv;
 OrderHistoryAdapter adapter;
 List<OrderHistoryModel> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);

        rcv= findViewById(R.id.rvOrderCategory);


        data = new ArrayList<>();
        data.add(new OrderHistoryModel("Pizza","buy 2 large pizza and get 1 midium pizza free","https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80",  "7 April","Cancled"));
        data.add(new OrderHistoryModel("Pizza","buy 2 large pizza and get 1 midium pizza free","https://images.unsplash.com/photo-1518843875459-f738682238a6?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=1026&q=80",  "7 April","Cancled"));
        data.add(new OrderHistoryModel("Pizza","buy 2 large pizza and get 1 midium pizza free","https://images.unsplash.com/photo-1512621776951-a57141f2eefd?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80",  "7 April","Cancled"));
        data.add(new OrderHistoryModel("Pizza","buy 2 large pizza and get 1 midium pizza free","https://images.unsplash.com/photo-1566222496324-7d04b48d2585?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80",  "7 April","Cancled"));
        data.add(new OrderHistoryModel("Pizza","buy 2 large pizza and get 1 midium pizza free","https://images.unsplash.com/photo-1589906493606-a6ca2a06078b?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80",  "7 April","Cancled"));
        data.add(new OrderHistoryModel("Pizza","buy 2 large pizza and get 1 midium pizza free","https://images.unsplash.com/photo-1542834369-f10ebf06d3e0?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80",  "7 April","Cancled"));


        rcv.setLayoutManager( new LinearLayoutManager(this));
        adapter = new OrderHistoryAdapter(data, this);
        rcv.setAdapter( adapter);

    }
}
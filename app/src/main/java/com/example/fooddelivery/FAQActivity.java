package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.fooddelivery.Adapters.FaqAdapter;
import com.example.fooddelivery.Adapters.NotificationAdapter;
import com.example.fooddelivery.Models.FaqModel;
import com.example.fooddelivery.Models.NotificationModel;

import java.util.ArrayList;
import java.util.List;

public class FAQActivity extends AppCompatActivity {

    RecyclerView rcvFaq;
    FaqAdapter adapter;
    List<FaqModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faqactivity);

        rcvFaq = findViewById(R.id.rvFaq);
        list = new ArrayList<>();

        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));
        list.add(new FaqModel("What is Onn Food ?","OnnFood is the online food delivery application for foodies. Here you can search for your favourite restaurant reviews."));

        rcvFaq.setLayoutManager( new LinearLayoutManager(this));
        adapter = new FaqAdapter(list, this);
        rcvFaq.setAdapter( adapter);

    }
}
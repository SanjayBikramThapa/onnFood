package com.example.fooddelivery;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fooddelivery.Adapters.CategoryAdapter;
import com.example.fooddelivery.Adapters.WeeklyDealsAdapter;
import com.example.fooddelivery.Models.CategoryModel;
import com.example.fooddelivery.Models.WeeklyDealsModel;

import java.util.ArrayList;
import java.util.List;

public class categoryFragment extends Fragment {

    RecyclerView recycle;
    CategoryAdapter adapter;
    List<CategoryModel> data;
    Context mContext;

    public categoryFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        TopCategory(view);
        return view;
    }

    void TopCategory(View view) {
        //Function definitions of top weekly deals
        recycle = view.findViewById(R.id.rvCategory); //getting reference of recycle from homeFragment.xml file

        //initializing data for displaying it in to weekly deals section in home fragments
        data = new ArrayList<>();
        data.add(new CategoryModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Veg Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        data.add(new CategoryModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Non-Veg Restaurant","This is the complete veg restaurant where we provide best hygnic food."));
        data.add(new CategoryModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Restaurant and Bar","This is the complete veg restaurant where we provide best hygnic food."));
        data.add(new CategoryModel("https://images.unsplash.com/photo-1513104890138-7c749659a591?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1050&q=80","Bar","This is the complete veg restaurant where we provide best hygnic food."));


        LinearLayoutManager linearLayoutManager;
        linearLayoutManager = new LinearLayoutManager(mContext);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recycle.setLayoutManager(linearLayoutManager);
        adapter = new CategoryAdapter(data, mContext);
        recycle.setAdapter(adapter);

    }
}
package com.example.fooddelivery.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fooddelivery.Models.CategoryModel;
import com.example.fooddelivery.Models.RestaurantModel;
import com.example.fooddelivery.R;
import com.example.fooddelivery.RestaurantDetailActivity;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RestaurantAdapter  extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {

    private List<RestaurantModel> OrderList;
    private Context context;


    public RestaurantAdapter(List<RestaurantModel> data, Context context) {

        this.OrderList = data;
        this.context = context;
    }
    @NonNull
    @NotNull
    @Override
    public RestaurantAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurant, parent, false);
        return new RestaurantAdapter.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull @NotNull RestaurantAdapter.ViewHolder holder, int position) {

        String ivFood = OrderList.get(position).getImage();
        //glide
        Glide.with(context).asBitmap().load(ivFood).into(holder.ivCircle);

        String Name = OrderList.get(position).getName();
        holder.tvName.setText(Name);
    }
    @Override
    public int getItemCount() {
        return OrderList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivCircle;
        TextView tvName,tvDesc;
        public ViewHolder(@NonNull View viewItem) {
            super(viewItem);
            ivCircle =viewItem.findViewById(R.id.ivCircle);
            tvName =viewItem.findViewById(R.id.tvName);
            tvDesc= viewItem.findViewById(R.id.tvDescription);
        }
    }

}

package com.example.fooddelivery.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fooddelivery.Models.OrderHistoryModel;
import com.example.fooddelivery.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class OrderHistoryAdapter extends RecyclerView.Adapter<OrderHistoryAdapter.MyViewHolder> {
    private List<OrderHistoryModel> OrderList;
    private Context context ;

    public OrderHistoryAdapter(List<OrderHistoryModel> list, Context context) {
        this.OrderList = list;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public OrderHistoryAdapter.MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_order_history,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull OrderHistoryAdapter.MyViewHolder holder, int position) {
        String foodName = OrderList.get(position).getName();
        holder.tvFoodName.setText(foodName);
        String ivFoodImage = OrderList.get(position).getImage();
        //glide
        Glide.with(context).asBitmap().load(ivFoodImage).into(holder.ivFood);
        String foodInfo = OrderList.get(position).getDesc();
        holder.tvFoodInfo.setText(foodInfo);
        String date  = OrderList.get(position).getDate();
        holder.tvDate.setText((CharSequence) date);
        String foodStatus = OrderList.get(position).getStatus();
        holder.tvStatus.setText(foodStatus);

    }

    @Override
    public int getItemCount() {
        return OrderList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView ivFood;
        TextView tvFoodName,tvFoodInfo,tvDate,tvStatus;

        public  MyViewHolder(@NonNull View viewItem) {
            super(viewItem);
            ivFood = viewItem.findViewById(R.id.ivFood);
            tvFoodName = viewItem.findViewById(R.id.tvFoodName);
            tvFoodInfo = viewItem.findViewById(R.id.tvInfo);
            tvDate = viewItem.findViewById(R.id.tvDate);
            tvStatus = viewItem.findViewById(R.id.tvStatus);
        }
    }
}



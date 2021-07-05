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
import com.example.fooddelivery.FoodDetail;
import com.example.fooddelivery.Models.OrderHistoryModel;
import com.example.fooddelivery.Models.RestaurantDetailModel;
import com.example.fooddelivery.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RestaurantDetailAdapter extends RecyclerView.Adapter<RestaurantDetailAdapter.MyViewHolder> {
    private List<RestaurantDetailModel> OrderList;
    private Context context;

    public RestaurantDetailAdapter(List<RestaurantDetailModel> list, Context context) {
        this.OrderList = list;
        this.context = context;
    }
    @NonNull
    @NotNull
    @Override
    public RestaurantDetailAdapter.MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurant_detail,parent,false);
        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull @NotNull RestaurantDetailAdapter.MyViewHolder holder, int position) {

        String foodName = OrderList.get(position).getName();
        holder.tvFoodName.setText(foodName);

        String ivFoodImage = OrderList.get(position).getImage();
        //glide
        Glide.with(context).asBitmap().load(ivFoodImage).into(holder.imgFood);

        String information = OrderList.get(position).getInform();
        holder.tvFoodInfo.setText(information);

        String price = OrderList.get(position).getPrice();
        holder.tvPrice.setText(price);


    }

    @Override
    public int getItemCount() {
        return OrderList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgFood;
        TextView tvFoodName,tvFoodInfo, tvPrice;

        public MyViewHolder(@NonNull View viewItem) {
            super(viewItem);
            imgFood = viewItem.findViewById(R.id.imgFood);
            tvFoodName = viewItem.findViewById(R.id.tvFoodName);
            tvFoodInfo = viewItem.findViewById(R.id.tvFoodDetail);
            tvPrice = viewItem.findViewById(R.id.tvPrice);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, FoodDetail.class);
                    //    intent.putExtra("Course", (Serializable) topCourseList.get(getAdapterPosition()));
                    context.startActivity(intent);
                }
            });


        }
    }

}



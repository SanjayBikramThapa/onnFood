package com.example.fooddelivery.Adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fooddelivery.FoodDetail;
import com.example.fooddelivery.Models.ProductModel;
import com.example.fooddelivery.Models.RestaurantDetailModel;
import com.example.fooddelivery.Models.WeeklyDealsModel;
import com.example.fooddelivery.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class WeeklyDealsAdapter extends  RecyclerView.Adapter<WeeklyDealsAdapter.ViewHolder> {

//    private List<ProductModel> OrderList;
    private List<WeeklyDealsModel> OrderList;
    private Context context;


//    public WeeklyDealsAdapter(List<ProductModel> data, Context context) {
public WeeklyDealsAdapter(List<WeeklyDealsModel> data, Context context) {

        this.OrderList = data;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public WeeklyDealsAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_weekly_deals, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull WeeklyDealsAdapter.ViewHolder holder, int position) {

//        String ivImage = OrderList.get(position).get();
        String ivImage = OrderList.get(position).getImage();
      //  glide
        Glide.with(context).asBitmap().load(ivImage).into(holder.imgRestaurantImage);

//        String FoodName = OrderList.get(position).getProductName();
        String FoodName = OrderList.get(position).getFoodName();
        holder.tvFoodName.setText(FoodName);

//        Integer price = OrderList.get(position).getPrice();
        String price = OrderList.get(position).getPrice();
      holder.tvPrice.setText(price.toString());

    }

    @Override
    public int getItemCount() {
        return OrderList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgRestaurantImage;
        TextView tvFoodName, tvPrice;
        public ViewHolder(@NonNull View viewItem) {
                super(viewItem);
            imgRestaurantImage =viewItem.findViewById(R.id.imgRestaurantImage);
            tvFoodName =viewItem.findViewById(R.id.tvFoodName);
            tvPrice =viewItem.findViewById(R.id.tvPriceForWeeklyDeals);

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















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
import com.example.fooddelivery.Cart;
import com.example.fooddelivery.FoodDetail;
import com.example.fooddelivery.Models.FoodBeverageModel;
import com.example.fooddelivery.Models.MyCartModel;
import com.example.fooddelivery.MyCartActivity;
import com.example.fooddelivery.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MycartAdapter extends RecyclerView.Adapter<MycartAdapter.ViewHolder> {

    private List<MyCartModel> OrderList;
    private Context context;

    public MycartAdapter(List<MyCartModel> data, Context context) {

        this.OrderList = data;
        this.context = context;
    }


    @NonNull
    @NotNull
    @Override
    public MycartAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mycart, parent, false);
        return new MycartAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MycartAdapter.ViewHolder holder, int position) {


        String ivImage = OrderList.get(position).getImage();
        //glide
        Glide.with(context).asBitmap().load(ivImage).into(holder.ivFood);

        String FoodName = OrderList.get(position).getFoodName();
        holder.tvFoodName.setText(FoodName);

        String Info = OrderList.get(position).getFoodInfo();
        holder.tvInfo.setText(Info);

        String price = OrderList.get(position).getPrice();
        holder.tvPrice.setText(price);

    }

    @Override
    public int getItemCount() {
        return OrderList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivFood;
        TextView tvFoodName, tvInfo, tvPrice;

        public ViewHolder(@NonNull View viewItem) {
            super(viewItem);
            ivFood = viewItem.findViewById(R.id.ivMyCartFood);
            tvFoodName = viewItem.findViewById(R.id.tvMyFoodName);
            tvInfo = viewItem.findViewById(R.id.tvMyInfo);
            tvPrice = viewItem.findViewById(R.id.tvMyPrice);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, Cart.class);
                    //    intent.putExtra("Course", (Serializable) topCourseList.get(getAdapterPosition()));
                    context.startActivity(intent);
                }
            });
        }
    }
}

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
import com.example.fooddelivery.Models.FoodBeverageModel;
import com.example.fooddelivery.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FoodBeverageAdapter extends RecyclerView.Adapter<FoodBeverageAdapter.ViewHolder> {

private List<FoodBeverageModel> OrderList2;
private Context context;


public FoodBeverageAdapter(List<FoodBeverageModel> data2, Context context) {

        this.OrderList2 = data2;
        this.context = context;
        }
        @NonNull
        @NotNull
        @Override
        public FoodBeverageAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_foodand_beverage, parent, false);
                return new FoodBeverageAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull @NotNull FoodBeverageAdapter.ViewHolder holder, int position) {

                String ivImage = OrderList2.get(position).getImage();
                //glide
                Glide.with(context).asBitmap().load(ivImage).into(holder.ivFood);

                String FoodName = OrderList2.get(position).getFoodName();
                holder.tvFoodName.setText(FoodName);

                String Info = OrderList2.get(position).getFoodInfo();
                holder.tvInfo.setText(Info);

                String price = OrderList2.get(position).getPrice();
                holder.tvPrice.setText(price);

        }

        @Override
        public int getItemCount() {
                return OrderList2.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

                ImageView ivFood;
                TextView tvFoodName, tvInfo ,tvPrice;
                public ViewHolder(@NonNull View viewItem) {
                        super(viewItem);
                        ivFood =viewItem.findViewById(R.id.ivFood);
                        tvFoodName =viewItem.findViewById(R.id.tvFoodName);
                        tvInfo= viewItem.findViewById(R.id.tvInfo);
                        tvPrice =viewItem.findViewById(R.id.tvPrice);

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

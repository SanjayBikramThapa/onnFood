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
import com.example.fooddelivery.Models.CategoryModel;
import com.example.fooddelivery.Models.FoodBeverageModel;
import com.example.fooddelivery.R;
import com.example.fooddelivery.RestaurantActivity;
import com.example.fooddelivery.RestaurantDetailActivity;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private List<CategoryModel> OrderList;
    private Context context;


    public CategoryAdapter(List<CategoryModel> data, Context context) {

        this.OrderList = data;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemcategory, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull CategoryAdapter.ViewHolder holder, int position) {

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

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, RestaurantActivity.class);
                    //    intent.putExtra("Course", (Serializable) topCourseList.get(getAdapterPosition()));
                    context.startActivity(intent);
                }
            });
        }
    }

}

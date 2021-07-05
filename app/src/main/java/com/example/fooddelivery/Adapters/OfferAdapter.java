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
import com.example.fooddelivery.Cart;
import com.example.fooddelivery.FoodDetail;
import com.example.fooddelivery.Models.FaqModel;
import com.example.fooddelivery.Models.OfferModel;
import com.example.fooddelivery.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.ViewHolder> {

    private List<OfferModel> OrderList;
    private Context context;


    public OfferAdapter(List<OfferModel> data, Context context) {

        this.OrderList = data;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public OfferAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_offer, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull OfferAdapter.ViewHolder holder, int position) {

        String ivImage = OrderList.get(position).getImage();
        //glide
        Glide.with(context).asBitmap().load(ivImage).into(holder.ivOffer);

        String OfferName = OrderList.get(position).getName();
        holder.tvOfferName.setText(OfferName);

        String Price = OrderList.get(position).getPrice();
        holder.tvPrice.setText(Price);
    }
    @Override
    public int getItemCount() {
        return OrderList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivOffer;
        TextView tvOfferName,tvPrice;

        public ViewHolder(@NonNull View viewItem) {
            super(viewItem);
            ivOffer =viewItem.findViewById(R.id.ivOffer);
            tvOfferName =viewItem.findViewById(R.id.tvOfferName);
            tvPrice =viewItem.findViewById(R.id.tvOfferPrice);
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

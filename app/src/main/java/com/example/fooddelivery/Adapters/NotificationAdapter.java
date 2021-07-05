package com.example.fooddelivery.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fooddelivery.Models.NotificationModel;
import com.example.fooddelivery.Models.OrderHistoryModel;
import com.example.fooddelivery.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {

    private List<NotificationModel> OrderList;
    private Context context ;

    public NotificationAdapter(List<NotificationModel> list, Context context) {
        this.OrderList = list;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public NotificationAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notification,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull NotificationAdapter.ViewHolder holder, int position) {

        String OfferName = OrderList.get(position).getOfferName();
        holder.tvOfferName.setText(OfferName);

        String offerDate = OrderList.get(position).getOfferDate();
        holder.tvDate.setText((CharSequence) offerDate);

        String description  = OrderList.get(position).getOfferDesc();
        holder.tvDesc.setText(description);

    }

    @Override
    public int getItemCount() {
        return OrderList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView tvOfferName,tvDate,tvDesc;

        public  ViewHolder(@NonNull View viewItem){
            super(viewItem);
            tvOfferName = viewItem.findViewById(R.id.tvOfferText);
            tvDate = viewItem.findViewById(R.id.tvOfferDate);
            tvDesc = viewItem.findViewById(R.id.tvOfferDescription);
        }
    }

}

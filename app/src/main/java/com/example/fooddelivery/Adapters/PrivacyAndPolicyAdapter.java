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
import com.example.fooddelivery.Models.FoodBeverageModel;
import com.example.fooddelivery.Models.PrivacyAndPolicyModel;
import com.example.fooddelivery.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PrivacyAndPolicyAdapter extends  RecyclerView.Adapter<PrivacyAndPolicyAdapter.ViewHolder> {

    private List<PrivacyAndPolicyModel> OrderList;
    private Context context;


    public PrivacyAndPolicyAdapter(List<PrivacyAndPolicyModel> data, Context context) {

        this.OrderList = data;
        this.context = context;
    }
    @NonNull
    @NotNull
    @Override
    public PrivacyAndPolicyAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_privacypolicy, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull @NotNull PrivacyAndPolicyAdapter.ViewHolder holder, int position) {

        String PrivacyAndPolicy  = OrderList.get(position).getPrivacy();
        holder.tvPrivacy.setText(PrivacyAndPolicy);
    }
    @Override
    public int getItemCount() {
        return OrderList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvPrivacy;
        public ViewHolder(@NonNull View viewItem) {
            super(viewItem);
            tvPrivacy =viewItem.findViewById(R.id.tvPrivacyPolicy);
        }
    }
}

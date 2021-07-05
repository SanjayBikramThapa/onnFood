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
import com.example.fooddelivery.Models.OurPartnerModel;
import com.example.fooddelivery.Models.WeeklyDealsModel;
import com.example.fooddelivery.R;
import com.example.fooddelivery.RestaurantDetailActivity;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class OurPartnerAdapter extends RecyclerView.Adapter<OurPartnerAdapter.ViewHolder> {

    private List<OurPartnerModel> OrderList1;
    private Context context;

    public OurPartnerAdapter(List<OurPartnerModel> data1, Context context) {

        this.OrderList1 = data1;
        this.context = context;
    }
    @NonNull
    @NotNull
    @Override
    public OurPartnerAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_our_partners, parent, false);
        return new OurPartnerAdapter.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull @NotNull OurPartnerAdapter.ViewHolder holder, int position) {

        String ivImage = OrderList1.get(position).getImage();
        //glide
        Glide.with(context).asBitmap().load(ivImage).into(holder.imgRtImage);

        String FoodName = OrderList1.get(position).getFoodName();
        holder.tvFoodName.setText(FoodName);
    }

    @Override
    public int getItemCount() {
        return OrderList1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgRtImage;
        TextView tvFoodName;
        public ViewHolder(@NonNull View viewItem) {
            super(viewItem);
            imgRtImage =viewItem.findViewById(R.id.imgRtImage);
            tvFoodName =viewItem.findViewById(R.id.tvFoodName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,RestaurantDetailActivity.class);
                    //    intent.putExtra("Course", (Serializable) topCourseList.get(getAdapterPosition()));
                    context.startActivity(intent);
                }
            });
        }
    }
}

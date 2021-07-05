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
import com.example.fooddelivery.Models.FaqModel;
import com.example.fooddelivery.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class FaqAdapter extends RecyclerView.Adapter<FaqAdapter.ViewHolder> {

    private List<FaqModel> OrderList;
    private Context context;


    public FaqAdapter(List<FaqModel> data, Context context) {

        this.OrderList = data;
        this.context = context;
    }
    @NonNull
    @NotNull
    @Override
    public FaqAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_faq, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FaqAdapter.ViewHolder holder, int position) {

        String Question = OrderList.get(position).getQuestion();
        holder.tvQuestion.setText(Question);

        String Answer = OrderList.get(position).getAnswer();
        holder.tvAnswer.setText(Answer);
    }


    @Override
    public int getItemCount() {
        return OrderList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvQuestion, tvAnswer;

        public ViewHolder(@NonNull View viewItem) {
            super(viewItem);

            tvQuestion =viewItem.findViewById(R.id.tvQuestion);
            tvAnswer =viewItem.findViewById(R.id.tvAnswer);
        }
    }
}

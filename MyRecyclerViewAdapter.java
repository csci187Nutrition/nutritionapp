package com.example.deepfriedkittuns.mealtrackertemp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private MyRecyclerViewAdapter adapter;
    private List<String>  meals;
    private List<String> dates;
    private LayoutInflater inflater;
    private ItemClickListener rvClickListener;

    MyRecyclerViewAdapter(Context context, List<String> meals, List<String> dates) {
        this.inflater = LayoutInflater.from(context);
        this.meals = meals;
        this.dates = dates;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    // binds the data to the view and textview in each row
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String meal = meals.get(position);
        String date = dates.get(position);
        holder.itemName.setText(meal);
        holder.itemDate.setText(date);
    }

    // total number of rows
    @Override
    public int getItemCount() {
        return meals.size();
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imView;
        TextView itemDate;
        TextView itemName;

        ViewHolder(View itemView) {
            super(itemView);
            imView = itemView.findViewById(R.id.listItemPic);
            itemDate = itemView.findViewById(R.id.listItemDate);
            itemName = itemView.findViewById(R.id.listItemName);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (rvClickListener != null) rvClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // convenience method for getting data at click position
    public String getItem(int id) {
        return meals.get(id);
    }

    // allows clicks events to be caught
    public void setClickListener(ItemClickListener itemClickListener) {
        this.rvClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}

package com.example.navdrawercae.minuman;

import android.content.Context;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.navdrawercae.Model;
import com.example.navdrawercae.R;
import com.example.navdrawercae.makanan.Adaptermakanan;

import java.util.ArrayList;

public class AdapterMinuman extends RecyclerView.Adapter<AdapterMinuman.MyViewHolder> {

    Context context;

    ArrayList<Model> modelminuman;

    public AdapterMinuman(Context context, ArrayList<Model> modelminuman) {
        this.context = context;
        this.modelminuman = modelminuman;
    }

    @NonNull
    @Override
    public AdapterMinuman.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_lay_minuman, parent, false);
        return new AdapterMinuman.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMinuman.MyViewHolder holder, int position) {
        holder.tvminuman.setText(modelminuman.get(position).getNama());
        holder.tvDeskripsiminuman.setText(modelminuman.get(position).getDesc());
        Glide.with(context).load(modelminuman.get(position).getImg()).into(holder.imgminuman);
    }

    @Override
    public int getItemCount() {
        return modelminuman.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgminuman;

        TextView tvminuman;
        TextView tvDeskripsiminuman;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgminuman= itemView.findViewById(R.id.imgminuman);
            tvminuman= itemView.findViewById(R.id.tvminuman);
            tvDeskripsiminuman= itemView.findViewById(R.id.tvDeskripsiminuman);

        }
    }
}

package com.example.navdrawercae.makanan;

import android.content.Context;
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

import java.util.ArrayList;

public class Adaptermakanan  extends RecyclerView.Adapter<Adaptermakanan.MyViewHolder>{

    Context context;
    ArrayList<Model> modelmakanan;

    public Adaptermakanan(Context context, ArrayList<Model> modelmakanan) {
        this.context = context;
        this.modelmakanan = modelmakanan;
    }

    @NonNull
    @Override
    public Adaptermakanan.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_lay_makanan, parent, false);
        return new Adaptermakanan.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptermakanan.MyViewHolder holder, int position) {
        holder.tvnamemakanan.setText(modelmakanan.get(position).getNama());
        holder.tvDeskripsimakanan.setText(modelmakanan.get(position).getDesc());


        Glide.with(context).load(modelmakanan.get(position).getImg()).into(holder.imgmakanan);
    }

    @Override
    public int getItemCount() {
        return modelmakanan.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgmakanan;

        TextView tvnamemakanan;

        TextView tvDeskripsimakanan;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
           imgmakanan= itemView.findViewById(R.id.imgmakanan);
           tvnamemakanan= itemView.findViewById(R.id.tvnamemakanan);
           tvDeskripsimakanan= itemView.findViewById(R.id.tvDeskripsimakanan);



        }
    }
}

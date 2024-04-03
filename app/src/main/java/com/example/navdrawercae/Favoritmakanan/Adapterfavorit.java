package com.example.navdrawercae.Favoritmakanan;

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
import com.example.navdrawercae.makanan.Adaptermakanan;
import com.example.navdrawercae.minuman.AdapterMinuman;

import java.util.ArrayList;

public class Adapterfavorit extends RecyclerView.Adapter<Adapterfavorit.MyViewHolder>{

    Context context;

    ArrayList<Model> modelfavorit;

    public Adapterfavorit(Context context, ArrayList<Model> modelfavorit) {
        this.context = context;
        this.modelfavorit = modelfavorit;
    }

    @NonNull
    @Override
    public Adapterfavorit.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_lay_favorite, parent, false);
        return new Adapterfavorit.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapterfavorit.MyViewHolder holder, int position) {
        holder.tvnamemakananvaforit.setText(modelfavorit.get(position).getNama());
        holder.tvdescmakananfavorit.setText(modelfavorit.get(position).getDesc());
        Glide.with(context).load(modelfavorit.get(position).getImg()).into(holder.imgmakananfav);
    }

    @Override
    public int getItemCount() {
        return modelfavorit.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgmakananfav;

        TextView tvnamemakananvaforit;
        TextView tvdescmakananfavorit;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgmakananfav = itemView.findViewById(R.id.imgmakananfav);
            tvnamemakananvaforit = itemView.findViewById(R.id.tvnamemakananvaforit);
            tvdescmakananfavorit= itemView.findViewById(R.id.tvdescmakananfavorit);


        }
    }
}

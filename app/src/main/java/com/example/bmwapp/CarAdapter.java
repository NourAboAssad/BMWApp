package com.example.bmwapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.MyViewHolder>{
    Context context;
    ArrayList<Car> carList;
    private FirebaseServices fbs;

    public CarAdapter(Context context, ArrayList<Car> restList) {
        this.context = context;
        this.carList = restList;
        this.fbs = FirebaseServices.getInstance();
    }
    @NonNull
    @Override
    public CarAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.car_item,parent,false);
        return  new CarAdapter.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CarAdapter.MyViewHolder holder, int position) {
        Car rest = carList.get(position);
        holder.tvModel.setText(rest.getModel());
        holder.tvYear.setText(rest.getYear());
        holder.tvPrice.setText(rest.getPrice());
        if (car.getPhoto() == null || car.getPhoto().isEmpty())
        {
            Picasso.get().load(R.drawable.ic_fav).into(holder.ivCar);
        }
        else {
            Picasso.get().load(car.getPhoto()).into(holder.ivCar);
        }
        holder.ivFavourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setFavourite(holder, car);
            }
        });

    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvModel,tvPrice,tvYear;
        ImageView ivCar;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            tvModel=itemView.findViewById(R.id.tvModelRestItem);
            tvPrice=itemView.findViewById(R.id.tvPriceRestItem);
            tvYear=itemView.findViewById(R.id.tvYearRestItem);
            ivCar = itemView.findViewById(R.id.ivCarPhotoItem);
        }

    }
}

package com.classwork.country;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.classwork.mon3dz4_1.OnClick;
import com.classwork.mon3dz4_1.R;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<CountryModel> countryList;

    public CountryAdapter(ArrayList<CountryModel> countryList) {
        this.countryList = countryList;
    }


    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_country, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}

class CountryViewHolder extends RecyclerView.ViewHolder {
    private ImageView imgCountry;
    private TextView tvCountry;

    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        imgCountry = itemView.findViewById(R.id.img_country);
        tvCountry = itemView.findViewById(R.id.tv_country);
    }

    public void bind(CountryModel countryModel) {
        tvCountry.setText(countryModel.getName());
        Glide.with(imgCountry).load(countryModel.getFlag()).into(imgCountry);
    }
}

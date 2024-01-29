package com.classwork.continent;

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

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {
    private ArrayList<ContinentModel> continentList;
    private OnClick onClick;

    public ContinentAdapter(ArrayList<ContinentModel> continentList,OnClick onClick) {
        this.continentList = continentList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continents, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentList.get(position));
        holder.itemView.setOnClickListener(v -> {
            onClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }

}

class ContinentViewHolder extends RecyclerView.ViewHolder {
    private ImageView imgContinent;
    private TextView tvContinent;

    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
        imgContinent = itemView.findViewById(R.id.img_flag);
        tvContinent = itemView.findViewById(R.id.tv_name);
    }

    public void bind(ContinentModel continentModel) {
        tvContinent.setText(continentModel.getTextView());
        Glide.with(imgContinent).load(continentModel.getImageView()).into(imgContinent);
    }
}


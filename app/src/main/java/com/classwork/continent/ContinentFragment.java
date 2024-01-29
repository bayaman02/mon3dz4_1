package com.classwork.continent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.classwork.country.CountryFragment;
import com.classwork.mon3dz4_1.OnClick;
import com.classwork.mon3dz4_1.R;
import com.classwork.mon3dz4_1.databinding.FragmentContinentBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnClick {
    private FragmentContinentBinding binding;
    private ArrayList<ContinentModel> continentList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        // Inflate the layout for this fragment
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        ContinentAdapter continentAdapter = new ContinentAdapter(continentList, this);
        binding.rvContinents.setAdapter(continentAdapter);
    }

    private void loadData() {
        continentList.add(new ContinentModel("Eurasia", "https://www.sporcle.com/blog/wp-content/uploads/2019/05/3-3.jpg"));
        continentList.add(new ContinentModel("North USA", "https://cdn.pixabay.com/photo/2014/03/24/17/08/map-295118_1280.png"));
        continentList.add(new ContinentModel("South USA", "https://toppng.com/uploads/preview/vaping-laws-in-south-america-map-of-peru-in-south-america-11569055337vp0pzzpeow.png"));
        continentList.add(new ContinentModel("Africa", "https://www.iapb.org/wp-content/uploads/2020/09/IAPB-regions-Africa.png"));
        continentList.add(new ContinentModel("Australia", "https://freepngimg.com/thumb/map/24277-8-australia-map-transparent-background.png"));
    }

    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("keyForPosition", position);
        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, countryFragment).addToBackStack(null).commit();


    }

}
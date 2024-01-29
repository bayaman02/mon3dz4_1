package com.classwork.country;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.classwork.mon3dz4_1.databinding.FragmentContinentBinding;

import java.util.ArrayList;


public class CountryFragment extends Fragment {
private FragmentContinentBinding binding;
private Integer position;
private ArrayList<CountryModel> countryList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("keyForPosition");
        checkPosition(position);
        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        binding.rvContinents.setAdapter(countryAdapter);
    }

    private void checkPosition(Integer position) {
    switch (position){
        case 0:
            loadEurasia();
            break;
        case 1:
            loadNorthUSA();
            break;
        case 2:
            loadSouthUSA();
            break;
        case 3:
            loadAfrica();
            break;
            case 4:
            loadAustralia();
            break;
    }
    }

    private void loadAustralia() {
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/fj-1-580x290.png.webp", "Fiji"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/to-1-580x290.png.webp", "Tonga"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/sb-1-580x290.png.webp", "Solomon Islands"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ws-1-580x290.png.webp", "Samoa"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/nz-1-580x290.png.webp", "New Zealand"));

    }

    private void loadAfrica() {
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ss-1-580x290.png.webp", "South Sudan"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/et-1-580x290.png.webp", "Ethiopia "));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/td-1-580x387.png.webp", "Tchad"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/gq-1-580x387.png.webp", "Guiné Equatorial"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ug-1-580x387.png.webp", "Uganda"));
    }

    private void loadSouthUSA() {
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/cl-1-580x387.png.webp", "Chile"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ec-1-580x290.png.webp", "Ecuador"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/uy-1-580x387.png.webp", "Uruguay"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/pe-1-580x387.png.webp", "Peru"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/py-1-580x348.png.webp", "Paraguay"));
    }
    private void  loadNorthUSA() {
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/jm-1-580x290.png.webp", "Jamaica"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/tt-1-580x348.png.webp", "Trinidad and Tobago"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/us-1-580x305.png.webp", "USA"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/lc-1-580x290.png.webp", "Saint Lucia"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/vc-1-580x387.png.webp", "Saint Vincent and Grenadines "));
    }

    private void loadEurasia() {
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/kg-1-580x348.png.webp", "Kyrgyzstan "));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/jp-1-580x387.png.webp", "Japan"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/south-ossetia-1-580x290.png.webp", "South Ossetia"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/kr-1-580x387.png.webp", "South Korea"));
        countryList.add(new CountryModel("https://flagi-1.ru/wp-content/webp-express/webp-images/uploads/2016/10/ee-1-580x369.png.webp", "Estonia"));
    }
}
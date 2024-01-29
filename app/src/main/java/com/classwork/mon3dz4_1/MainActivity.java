package com.classwork.mon3dz4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.classwork.continent.ContinentFragment;
import com.classwork.mon3dz4_1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragment()).commit();
        }
    }
}
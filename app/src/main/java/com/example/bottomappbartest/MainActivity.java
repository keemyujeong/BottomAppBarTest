package com.example.bottomappbartest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.bottomappbartest.databinding.ActivityMainBinding;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.MaterialShapeDrawable;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    BottomAppBar bottomAppbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        MaterialShapeDrawable bottomBarBackground = (MaterialShapeDrawable) binding.bab.getBackground();
        bottomBarBackground.setShapeAppearanceModel(
                bottomBarBackground.getShapeAppearanceModel()
                        .toBuilder()
                        .setTopRightCorner(CornerFamily.ROUNDED, 0.6f)
                        .setTopLeftCorner(CornerFamily.ROUNDED,0.6f)
                        .build());



    }
}
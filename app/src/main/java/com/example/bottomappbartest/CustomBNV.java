package com.example.bottomappbartest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CustomBNV extends BottomNavigationView {


    public CustomBNV(@NonNull Context context) {
        super(context);
    }

    public CustomBNV(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        ViewGroup menuView = (ViewGroup)getChildAt(0);
        menuView.getChildAt(2).setClickable(false);
    }


}

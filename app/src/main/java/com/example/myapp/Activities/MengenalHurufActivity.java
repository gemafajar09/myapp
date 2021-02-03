package com.example.myapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.example.myapp.Fragments.MengenalHurufFragment1;
import com.example.myapp.Fragments.MengenalHurufFragment2;
import com.example.myapp.Fragments.MengenalHurufFragment3;
import com.example.myapp.Fragments.MengenalHurufFragment4;
import com.example.myapp.Fragments.MengenalHurufFragment5;
import com.example.myapp.R;
import com.example.myapp.Adapters.ViewPagerFragmentAdapter;

import java.util.ArrayList;

public class MengenalHurufActivity extends AppCompatActivity {
    ImageButton ibKembali;
    ViewPager2 myViewPager2Huruf;
    ViewPagerFragmentAdapter myAdapterHuruf;
    ArrayList<Fragment> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //end remove title
        setContentView(R.layout.activity_mengenal_huruf);

        myViewPager2Huruf   = findViewById(R.id.pager);
        ibKembali           = findViewById(R.id.ib_kembali);

        //Menambahkan fragment pada viewpager2
        arrayList.add(new MengenalHurufFragment1());
        arrayList.add(new MengenalHurufFragment2());
        arrayList.add(new MengenalHurufFragment3());
        arrayList.add(new MengenalHurufFragment4());
        arrayList.add(new MengenalHurufFragment5());

        myAdapterHuruf = new ViewPagerFragmentAdapter(getSupportFragmentManager(), getLifecycle());

        myViewPager2Huruf.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        myViewPager2Huruf.setAdapter(myAdapterHuruf);

        ibKembali.setOnClickListener(v -> onBackPressed());
    }
}

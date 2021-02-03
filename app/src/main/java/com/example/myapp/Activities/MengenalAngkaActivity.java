package com.example.myapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.example.myapp.Fragments.MengenalAngkaFragment1;
import com.example.myapp.Fragments.MengenalAngkaFragment2;
import com.example.myapp.R;
import com.example.myapp.Adapters.ViewPagerFragmentAdapter2;

import java.util.ArrayList;

public class MengenalAngkaActivity extends AppCompatActivity {
    ImageButton ibKembali;
    ViewPager2 myViewPager2Angka;
    ViewPagerFragmentAdapter2 myAdapterAngka;
    ArrayList<Fragment> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //end remove title
        setContentView(R.layout.activity_mengenal_angka);

        myViewPager2Angka   = findViewById(R.id.pager2);
        ibKembali           = findViewById(R.id.ib_kembali);

        //Menambahkan fragment pada viewpager2
        arrayList.add(new MengenalAngkaFragment1());
        arrayList.add(new MengenalAngkaFragment2());

        myAdapterAngka = new ViewPagerFragmentAdapter2(getSupportFragmentManager(), getLifecycle());

        myViewPager2Angka.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        myViewPager2Angka.setAdapter(myAdapterAngka);

        ibKembali.setOnClickListener(v -> onBackPressed());
    }


}
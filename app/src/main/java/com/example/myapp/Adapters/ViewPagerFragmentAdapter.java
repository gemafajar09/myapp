package com.example.myapp.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapp.Fragments.MengenalHurufFragment1;
import com.example.myapp.Fragments.MengenalHurufFragment2;
import com.example.myapp.Fragments.MengenalHurufFragment3;
import com.example.myapp.Fragments.MengenalHurufFragment4;
import com.example.myapp.Fragments.MengenalHurufFragment5;

import java.util.ArrayList;

public class ViewPagerFragmentAdapter extends FragmentStateAdapter {

    private ArrayList<Fragment> arrayList= new ArrayList<>();

    public ViewPagerFragmentAdapter(FragmentManager fragmentManager, Lifecycle lifecycle){
        super(fragmentManager, lifecycle);
    }

    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new MengenalHurufFragment1();
            case 1:
                return new MengenalHurufFragment2();
            case 2:
                return new MengenalHurufFragment3();
            case 3:
                return new MengenalHurufFragment4();
            case 4:
                return new MengenalHurufFragment5();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

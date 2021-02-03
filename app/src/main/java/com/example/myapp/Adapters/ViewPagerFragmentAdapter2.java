package com.example.myapp.Adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapp.Fragments.MengenalAngkaFragment1;
import com.example.myapp.Fragments.MengenalAngkaFragment2;

import java.util.ArrayList;

public class ViewPagerFragmentAdapter2 extends FragmentStateAdapter {

    private ArrayList<Fragment> arrayList= new ArrayList<>();

    public ViewPagerFragmentAdapter2(FragmentManager fragmentManager, Lifecycle lifecycle){
        super(fragmentManager, lifecycle);
    }

    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new MengenalAngkaFragment1();
            case 1:
                return new MengenalAngkaFragment2();
        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}

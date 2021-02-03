package com.example.myapp.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.myapp.Activities.MengenalAngkaActivity;
import com.example.myapp.Activities.MengenalHurufActivity;
import com.example.myapp.Activities.MenuPermainanActivity;
import com.example.myapp.Activities.PermainanActivity;
import com.example.myapp.R;

public class MenuFragment extends Fragment {

    public MenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Get id
        View MenuFragmentView =inflater.inflate(R.layout.fragment_menu, container, false);
        ImageButton ibKembali = (ImageButton) MenuFragmentView.findViewById(R.id.ib_kembali);
        ImageButton ibMengenalHuruf = (ImageButton) MenuFragmentView.findViewById(R.id.ib_mengenal_huruf);
        ImageButton ibMengenalAngka = (ImageButton) MenuFragmentView.findViewById(R.id.ib_mengenal_angka);
        ImageButton ibPermainan = (ImageButton) MenuFragmentView.findViewById(R.id.ib_permainan);

        //Perintah ketika tombol diklik
        ibKembali.setOnClickListener(v -> getActivity().onBackPressed());

        ibMengenalHuruf.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), MengenalHurufActivity.class);
            startActivity(intent);
        });

        ibMengenalAngka.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), MengenalAngkaActivity.class);
            startActivity(intent);
        });

        ibPermainan.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), MenuPermainanActivity.class);
            startActivity(intent);
        });

        return MenuFragmentView;
    }
}
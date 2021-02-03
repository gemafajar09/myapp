package com.example.myapp.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapp.R;

public class MengenalHurufFragment5 extends Fragment implements View.OnClickListener {

    MediaPlayer player;
    public MengenalHurufFragment5() {
        // Required empty public constructor
        player = new MediaPlayer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mengenal_huruf5, container, false);

        Button btny = v.findViewById(R.id.btn_y);
        Button btnz = v.findViewById(R.id.btn_z);

        btny.setOnClickListener(this);
        btnz.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        int id  = view.getId();
        if(id == R.id.btn_y) {
            if(player.isPlaying()) player.stop();
            player = MediaPlayer.create(getContext(), R.raw.y);
            player.start();
        }else if(id == R.id.btn_z) {
            if(player.isPlaying()) player.stop();
            player = MediaPlayer.create(getContext(), R.raw.z);
            player.start();
        }
    }
}
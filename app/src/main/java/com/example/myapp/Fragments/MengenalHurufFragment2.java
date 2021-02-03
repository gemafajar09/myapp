package com.example.myapp.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapp.R;

public class MengenalHurufFragment2 extends Fragment implements View.OnClickListener {

    MediaPlayer player;
    public MengenalHurufFragment2() {
        // Required empty public constructor
        player = new MediaPlayer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mengenal_huruf2, container, false);

        Button btng = v.findViewById(R.id.btn_g);
        Button btnh = v.findViewById(R.id.btn_h);
        Button btni = v.findViewById(R.id.btn_i);
        Button btnj = v.findViewById(R.id.btn_j);
        Button btnk = v.findViewById(R.id.btn_k);
        Button btnl = v.findViewById(R.id.btn_l);

        btng.setOnClickListener(this);
        btnh.setOnClickListener(this);
        btni.setOnClickListener(this);
        btnj.setOnClickListener(this);
        btnk.setOnClickListener(this);
        btnl.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        int id  = view.getId();
        if(player.isPlaying()) player.stop();
        if(id == R.id.btn_g) {
            player = MediaPlayer.create(getContext(), R.raw.g);
            player.start();
        }else if(id == R.id.btn_h) {
            player = MediaPlayer.create(getContext(), R.raw.h);
            player.start();
        }else if(id == R.id.btn_i) {
            player = MediaPlayer.create(getContext(), R.raw.i);
            player.start();
        }else if(id == R.id.btn_j) {
            player = MediaPlayer.create(getContext(), R.raw.j);
            player.start();
        }else if(id == R.id.btn_k) {
            player = MediaPlayer.create(getContext(), R.raw.k);
            player.start();
        }else if(id == R.id.btn_l) {
            player = MediaPlayer.create(getContext(), R.raw.l);
            player.start();
        }
    }
}
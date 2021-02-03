package com.example.myapp.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapp.R;

public class MengenalHurufFragment3 extends Fragment implements View.OnClickListener {

    MediaPlayer player;
    public MengenalHurufFragment3() {
        // Required empty public constructor
        player = new MediaPlayer();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mengenal_huruf3, container, false);

        Button btnm = v.findViewById(R.id.btn_m);
        Button btnn = v.findViewById(R.id.btn_n);
        Button btno = v.findViewById(R.id.btn_o);
        Button btnp = v.findViewById(R.id.btn_p);
        Button btnq = v.findViewById(R.id.btn_q);
        Button btnr = v.findViewById(R.id.btn_r);

        btnm.setOnClickListener(this);
        btnn.setOnClickListener(this);
        btno.setOnClickListener(this);
        btnp.setOnClickListener(this);
        btnq.setOnClickListener(this);
        btnr.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        int id  = view.getId();
        if(player.isPlaying()) player.stop();
        if(id == R.id.btn_m) {
            player = MediaPlayer.create(getContext(), R.raw.m);
            player.start();
        }else if(id == R.id.btn_n) {
            player = MediaPlayer.create(getContext(), R.raw.n);
            player.start();
        }else if(id == R.id.btn_o) {
            player = MediaPlayer.create(getContext(), R.raw.o);
            player.start();
        }else if(id == R.id.btn_p) {
            player = MediaPlayer.create(getContext(), R.raw.p);
            player.start();
        }else if(id == R.id.btn_q) {
            player = MediaPlayer.create(getContext(), R.raw.q);
            player.start();
        }else if(id == R.id.btn_r) {
            player = MediaPlayer.create(getContext(), R.raw.r);
            player.start();
        }
    }
}
package com.example.myapp.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapp.R;

public class MengenalHurufFragment1 extends Fragment implements View.OnClickListener {

    MediaPlayer player;
    public MengenalHurufFragment1() {
        // Required empty public constructor
        player = new MediaPlayer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mengenal_huruf1, container, false);

        Button btna = v.findViewById(R.id.btn_a);
        Button btnb = v.findViewById(R.id.btn_b);
        Button btnc = v.findViewById(R.id.btn_c);
        Button btnd = v.findViewById(R.id.btn_d);
        Button btne = v.findViewById(R.id.btn_e);
        Button btnf = v.findViewById(R.id.btn_f);

        btna.setOnClickListener(this);
        btnb.setOnClickListener(this);
        btnc.setOnClickListener(this);
        btnd.setOnClickListener(this);
        btne.setOnClickListener(this);
        btnf.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        int id  = view.getId();
        if(player.isPlaying()) player.stop();
        if(id == R.id.btn_a) {
            player = MediaPlayer.create(getContext(), R.raw.a);
            player.start();
        }else if(id == R.id.btn_b) {
            player = MediaPlayer.create(getContext(), R.raw.b);
            player.start();
        }else if(id == R.id.btn_c) {
            player = MediaPlayer.create(getContext(), R.raw.c);
            player.start();
        }else if(id == R.id.btn_d) {
            player = MediaPlayer.create(getContext(), R.raw.d);
            player.start();
        }else if(id == R.id.btn_e) {
            player = MediaPlayer.create(getContext(), R.raw.e);
            player.start();
        }else if(id == R.id.btn_f) {
            player = MediaPlayer.create(getContext(), R.raw.f);
            player.start();
        }
    }
}
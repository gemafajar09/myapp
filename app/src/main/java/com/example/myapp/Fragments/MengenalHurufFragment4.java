package com.example.myapp.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapp.R;

public class MengenalHurufFragment4 extends Fragment implements View.OnClickListener {

    MediaPlayer player;
    public MengenalHurufFragment4() {
        // Required empty public constructor
        player = new MediaPlayer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mengenal_huruf4, container, false);

        Button btns = v.findViewById(R.id.btn_s);
        Button btnt = v.findViewById(R.id.btn_t);
        Button btnu = v.findViewById(R.id.btn_u);
        Button btnv = v.findViewById(R.id.btn_v);
        Button btnw = v.findViewById(R.id.btn_w);
        Button btnx = v.findViewById(R.id.btn_x);

        btns.setOnClickListener(this);
        btnt.setOnClickListener(this);
        btnu.setOnClickListener(this);
        btnv.setOnClickListener(this);
        btnw.setOnClickListener(this);
        btnx.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        int id  = view.getId();
        if(player.isPlaying()) player.stop();
        if(id == R.id.btn_s) {
            player = MediaPlayer.create(getContext(), R.raw.s);
            player.start();
        }else if(id == R.id.btn_t) {
            player = MediaPlayer.create(getContext(), R.raw.t);
            player.start();
        }else if(id == R.id.btn_u) {
            player = MediaPlayer.create(getContext(), R.raw.u);
            player.start();
        }else if(id == R.id.btn_v) {
            player = MediaPlayer.create(getContext(), R.raw.v);
            player.start();
        }else if(id == R.id.btn_w) {
            player = MediaPlayer.create(getContext(), R.raw.w);
            player.start();
        }else if(id == R.id.btn_x) {
            player = MediaPlayer.create(getContext(), R.raw.x);
            player.start();
        }
    }
}
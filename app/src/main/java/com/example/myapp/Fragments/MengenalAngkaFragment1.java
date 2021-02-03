package com.example.myapp.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapp.R;

public class MengenalAngkaFragment1 extends Fragment implements View.OnClickListener {

    MediaPlayer player;
    public MengenalAngkaFragment1() {
        // Required empty public constructor
        player = new MediaPlayer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mengenal_angka1, container, false);
        Button btn1 = v.findViewById(R.id.btn_1);
        Button btn2 = v.findViewById(R.id.btn_2);
        Button btn3 = v.findViewById(R.id.btn_3);
        Button btn4 = v.findViewById(R.id.btn_4);
        Button btn5 = v.findViewById(R.id.btn_5);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        int id  = view.getId();
        if(player.isPlaying()) player.stop();
        if(id == R.id.btn_1) {
            player = MediaPlayer.create(getContext(), R.raw._1);
            player.start();
        }else if(id == R.id.btn_2) {
            player = MediaPlayer.create(getContext(), R.raw._2);
            player.start();
        }else if(id == R.id.btn_3) {
            player = MediaPlayer.create(getContext(), R.raw._3);
            player.start();
        }else if(id == R.id.btn_4) {
            player = MediaPlayer.create(getContext(), R.raw._4);
            player.start();
        }else if(id == R.id.btn_5) {
            player = MediaPlayer.create(getContext(), R.raw._5);
            player.start();
        }
    }
}
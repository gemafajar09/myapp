package com.example.myapp.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.myapp.R;

public class MengenalAngkaFragment2 extends Fragment implements View.OnClickListener {

    MediaPlayer player;
    public MengenalAngkaFragment2() {
        // Required empty public constructor
        player = new MediaPlayer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_mengenal_angka2, container, false);
        Button btn6 = v.findViewById(R.id.btn_6);
        Button btn7 = v.findViewById(R.id.btn_7);
        Button btn8 = v.findViewById(R.id.btn_8);
        Button btn9 = v.findViewById(R.id.btn_9);
        Button btn10 = v.findViewById(R.id.btn_10);

        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View view) {
        int id  = view.getId();
        if(player.isPlaying()) player.stop();
        if(id == R.id.btn_6) {
            player = MediaPlayer.create(getContext(), R.raw._6);
            player.start();
        }else if(id == R.id.btn_7) {
            player = MediaPlayer.create(getContext(), R.raw._7);
            player.start();
        }else if(id == R.id.btn_8) {
            player = MediaPlayer.create(getContext(), R.raw._8);
            player.start();
        }else if(id == R.id.btn_9) {
            player = MediaPlayer.create(getContext(), R.raw._9);
            player.start();
        }else if(id == R.id.btn_10) {
            player = MediaPlayer.create(getContext(), R.raw._10);
            player.start();
        }
    }
}
package com.example.myapp.Fragments;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.myapp.Activities.SelamatActivity;
import com.example.myapp.R;

import java.util.ArrayList;

public class PermainanAngkaFragment extends Fragment {

    int indeksSoal = 0;
    ImageButton ibPlaySound;
    ImageView ivSoal, ivPilihan1, ivPilihan2;

    ArrayList<Integer> kunci = new ArrayList<>();
    ArrayList<Integer> pilihan1 = new ArrayList<>();
    ArrayList<Integer> pilihan2 = new ArrayList<>();
    ArrayList<Integer> sound_soal = new ArrayList<>();
    ArrayList<Integer> soal = new ArrayList<>();

    MediaPlayer player;

    public PermainanAngkaFragment() {
        // Required empty public constructor

        pilihan1.add(R.drawable.jawaban_angka_1_1);
        pilihan1.add(R.drawable.jawaban_angka_2_1);
        pilihan1.add(R.drawable.jawaban_angka_3_1);

        pilihan2.add(R.drawable.jawaban_angka_1_2);
        pilihan2.add(R.drawable.jawaban_angka_2_2);
        pilihan2.add(R.drawable.jawaban_angka_3_2);

        kunci.add(1);
        kunci.add(1);
        kunci.add(1);

        sound_soal.add(R.raw.soal_angka_1);
        sound_soal.add(R.raw.soal_angka_2);
        sound_soal.add(R.raw.soal_angka_3);

        soal.add(R.drawable.soal_angka_1);
        soal.add(R.drawable.soal_angka_2);
        soal.add(R.drawable.soal_angka_3);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_permainan_angka, container, false);

        ibPlaySound     = v.findViewById(R.id.ib_play_sound);
        ivSoal          = v.findViewById(R.id.iv_soal);
        ivPilihan1      = v.findViewById(R.id.iv_12345);
        ivPilihan2      = v.findViewById(R.id.iv_pilihan_b);

        ibPlaySound.setOnClickListener(view -> {
            if(player.isPlaying() && player != null) player.stop();
            player = MediaPlayer.create(getContext(), sound_soal.get(indeksSoal));
            player.start();
        });

        player = MediaPlayer.create(getContext(), sound_soal.get(indeksSoal));
        player.start();

        ivPilihan1.setImageDrawable(getResources().getDrawable(pilihan1.get(indeksSoal)));
        ivPilihan2.setImageDrawable(getResources().getDrawable(pilihan2.get(indeksSoal)));
        ivSoal.setImageDrawable(getResources().getDrawable(soal.get(indeksSoal)));

        ivPilihan1.setOnClickListener(view -> {
            cekKunci(1);
        });

        ivPilihan2.setOnClickListener(view -> {
            cekKunci(2);
        });
        return v;
    }

    void cekKunci(int jawaban){
        if(kunci.get(indeksSoal) == jawaban){
            if(player.isPlaying() && player != null) player.stop();
            player = MediaPlayer.create(getContext(), R.raw.sound_benar);
            player.start();

            Dialog dialog = new Dialog(getContext());
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            View v = getActivity().getLayoutInflater().inflate(R.layout.dialog_info, null);
            ImageView imageView = v.findViewById(R.id.ivIcon);
            Glide.with(getContext()).load(R.drawable.jawaban_benar).into(imageView);
            dialog.setContentView(v);
            dialog.show();


            Handler handler = new Handler();
            handler.postDelayed(() -> {
                dialog.dismiss();
                indeksSoal++;
                if(indeksSoal == kunci.size()){
                    Intent i = new Intent(getContext(), SelamatActivity.class);
                    startActivity(i);
                    getActivity().finish();
                }else{
                    ivPilihan1.setImageDrawable(getResources().getDrawable(pilihan1.get(indeksSoal)));
                    ivPilihan2.setImageDrawable(getResources().getDrawable(pilihan2.get(indeksSoal)));
                    ivSoal.setImageDrawable(getResources().getDrawable(soal.get(indeksSoal)));

                    if(player.isPlaying() && player != null) player.stop();
                    player = MediaPlayer.create(getContext(), sound_soal.get(indeksSoal));
                    player.start();
                }
            }, 3000);
        }else{
            if(player.isPlaying() && player != null) player.stop();
            player = MediaPlayer.create(getContext(), R.raw.sound_salah);
            player.start();

            Dialog dialog = new Dialog(getContext());
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            View v = getActivity().getLayoutInflater().inflate(R.layout.dialog_info, null);
            ImageView imageView = v.findViewById(R.id.ivIcon);
            Glide.with(getContext()).load(R.drawable.jawaban_salah).into(imageView);
            dialog.setContentView(v);
            dialog.show();

            Handler handler = new Handler();
            handler.postDelayed(() -> {
                    dialog.dismiss();
                    if(player.isPlaying() && player != null) player.stop();
                    player = MediaPlayer.create(getContext(), sound_soal.get(indeksSoal));
                    player.start();
            }, 3000);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        player.stop();
    }
}
package com.example.myapp.Fragments;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;

import com.example.myapp.R;

public class MainScreenFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Get id
        View view = inflater.inflate(R.layout.fragment_main_screen, container, false);
        ImageButton ibMenuTentang = view.findViewById(R.id.ib_menu_tentang);
        ImageButton ibMenuButton = view.findViewById(R.id.ib_menu_button);
        ImageButton ibClose = view.findViewById(R.id.ib_close);
        ImageButton ibTentang = view.findViewById(R.id.ib_menu_tentang);

        //Menuju MenuFragment
        ibMenuButton.setOnClickListener(v -> {
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container_view, new MenuFragment())
                    .addToBackStack("MenuFragment")
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit();
        });

        ibMenuTentang.setOnClickListener(v -> {
        });

        //Menutup Aplikasi
        ibClose.setOnClickListener(v -> getActivity().finish());

        ibTentang.setOnClickListener(view1 -> {
            Dialog dialog = new Dialog(getContext());
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.dialog_tentang);
            dialog.show();
            dialog.setCancelable(true);
        });
        return view;
    }
}

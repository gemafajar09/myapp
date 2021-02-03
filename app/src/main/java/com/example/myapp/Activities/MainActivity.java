package com.example.myapp.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.myapp.Fragments.MainScreenFragment;
import com.example.myapp.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //end remove title

        setContentView(R.layout.activity_main);

        FragmentManager MainActivityfragmentManager = getSupportFragmentManager();
        MainActivityfragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, new MainScreenFragment())
                .setReorderingAllowed(true)
                .commit();
    }
}

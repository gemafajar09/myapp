package com.example.myapp.Activities;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.myapp.Fragments.PermainanAngkaFragment;
import com.example.myapp.Fragments.PermainanHurufFragment;
import com.example.myapp.R;

public class PermainanActivity extends AppCompatActivity {

    ImageButton ibKembali;
    String mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //end remove title
        setContentView(R.layout.activity_permainan);

        if(getIntent().hasExtra("mode")){
            mode = getIntent().getStringExtra("mode");
        }

        ibKembali = findViewById(R.id.ib_kembali);

        ibKembali.setOnClickListener(view -> {
            finish();
        });

        FragmentManager fragmentManager = getSupportFragmentManager();

        if(mode.equals("angka")) {
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container_view, new PermainanAngkaFragment())
                    .commit();
        }else if(mode.equals("huruf")){
            fragmentManager.beginTransaction()
                    .replace(R.id.fragment_container_view, new PermainanHurufFragment())
                    .commit();
        }
    }
}

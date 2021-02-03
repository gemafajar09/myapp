package com.example.myapp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapp.R;

public class MenuPermainanActivity extends AppCompatActivity {

    ImageButton ibKembali, ibPermainanAngka, ibPermainanHuruf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //end remove title
        setContentView(R.layout.activity_menu_permainan);

        ibKembali           = findViewById(R.id.ib_kembali);
        ibPermainanAngka    = findViewById(R.id.ib_permainan_angka);
        ibPermainanHuruf    = findViewById(R.id.ib_permainan_huruf);

        ibKembali.setOnClickListener(view -> {
            finish();
        });

        ibPermainanAngka.setOnClickListener(view -> {
            Intent i = new Intent(MenuPermainanActivity.this, PermainanActivity.class);
            i.putExtra("mode", "angka");
            startActivity(i);
        });

        ibPermainanHuruf.setOnClickListener(view -> {
            Intent i = new Intent(MenuPermainanActivity.this, PermainanActivity.class);
            i.putExtra("mode", "huruf");
            startActivity(i);
        });
    }
}

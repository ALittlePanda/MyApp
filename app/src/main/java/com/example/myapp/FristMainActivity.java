package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

import com.example.myapp.R;

public class FristMainActivity extends AppCompatActivity {
    private LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist_main);
        /*
        linearLayout = (LinearLayout)findViewById(R.id.app_bar_image);
        linearLayout.setSystemUiVisibility(View.INVISIBLE);

         */
        Integer time = 2000;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(FristMainActivity.this,MainActivity.class));
                FristMainActivity.this.finish();
            }
        },time);
    }
}
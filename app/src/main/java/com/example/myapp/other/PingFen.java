package com.example.myapp.other;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapp.R;

public class PingFen extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ping_fen);
        button = findViewById(R.id.PingFenButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PingFen.this, "谢谢", Toast.LENGTH_SHORT).show();
                PingFen.this.finish();
            }
        });
    }
}
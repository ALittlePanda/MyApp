package com.example.myapp.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapp.R;
import com.example.myapp.other.AboutUs;
import com.example.myapp.other.AddUs;
import com.example.myapp.other.PingFen;
import com.example.myapp.other.User;

public class AboutActivity extends AppCompatActivity {
    private Button button, button2, button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        button = (Button)findViewById(R.id.About_button1);//评分
        button2 = (Button)findViewById(R.id.About_button2);//加入我们
        button3 = (Button)findViewById(R.id.About_button3);//关于我们
        button4 = (Button)findViewById(R.id.About_button4);//用户隐私协议
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //评分
                Intent intent = new Intent(AboutActivity.this, PingFen.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //加入我们
                Intent intent = new Intent(AboutActivity.this, AddUs.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关于我们
                Intent intent = new Intent(AboutActivity.this, AboutUs.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //用户隐私协议
                Intent intent = new Intent(AboutActivity.this, User.class);
                startActivity(intent);
               // AboutActivity.this.finish();
            }
        });
    }
}
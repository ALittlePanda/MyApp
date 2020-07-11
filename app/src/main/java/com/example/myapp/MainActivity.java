package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapp.layout.AboutActivity;
import com.example.myapp.layout.CaiDan;
import com.example.myapp.layout.Home_Activity;
import com.example.myapp.layout.findedlayout;

public class MainActivity extends AppCompatActivity {
    private Button button, button2,button3;
    private Button mainbutton;
    private TextView edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainbutton = (Button)findViewById(R.id.main_button);
        edittext = (TextView)findViewById(R.id.edit_text);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);

        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edittext.getText().toString();
                //将数据传递
                Intent intent= new Intent(MainActivity.this, findedlayout.class);
                Bundle bundle =new Bundle();
                bundle.putString("name",name);
                intent.putExtras(bundle);
                startActivityForResult(intent,1);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Home_Activity.class);
                startActivity(intent);
            }
        });

        //创建“菜单”的监听器
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CaiDan.class);
                startActivity(intent);
            }
        });


        //创建“设置”按钮的监听器
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });


    }




}
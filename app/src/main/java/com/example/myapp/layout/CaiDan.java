package com.example.myapp.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapp.R;
import com.example.myapp.secondMain.FindMe;
import com.example.myapp.secondMain.What;
import com.example.myapp.secondMain.Activity_MeAndYou;

public class CaiDan extends AppCompatActivity {
    private Button button, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dan);
        button = (Button)findViewById(R.id.caidan_button1);//判断星座
        button2 = (Button)findViewById(R.id.caidan_button2);//判断性格
        button3 = (Button)findViewById(R.id.caidan_button3);//匹配
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断星座
                Intent intent = new Intent(CaiDan.this, FindMe.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断性格
                Intent intent = new Intent(CaiDan.this, What.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //匹配
              Intent intent = new Intent(CaiDan.this, Activity_MeAndYou.class);
                startActivity(intent);
            }
        });
    }
}
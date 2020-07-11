package com.example.myapp.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.myapp.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class findedlayout extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private FloatingActionButton floatingActionButton;
    String name;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findedlayout);
        imageView = (ImageView)findViewById(R.id.app_bar_image01);
        textView = (TextView)findViewById(R.id.Ftext);
        floatingActionButton = (FloatingActionButton)findViewById(R.id.Floating);

        Intent mintent = getIntent();
        Bundle mbundle = mintent.getExtras();
        String name = mbundle.getString("name");//得到星座的名字
        Log.i("星座名称",name);
        if(name.equals("白羊座")){
           imageView.setImageResource(R.drawable.baiyang1);
            textView.setText(R.string.baiyang);
        }
        else if(name.equals("金牛座")){
            imageView.setImageResource(R.drawable.jinniu1);
            textView.setText(R.string.jinniu);
        }
        else if(name.equals("双子座")){
            imageView.setImageResource(R.drawable.shuangzi1);
            textView.setText(R.string.shaungzi);
        }
        else if(name.equals("巨蟹座")){
            imageView.setImageResource(R.drawable.juxie1);
            textView.setText(R.string.juxie);
        }
        else if(name.equals("狮子座")){
            imageView.setImageResource(R.drawable.shizi1);
            textView.setText(R.string.shizi);
        }
        else if(name.equals("处女座")){
            imageView.setImageResource(R.drawable.chunv1);
            textView.setText(R.string.chunv);
        }
        else if(name.equals("天秤座")){
            imageView.setImageResource(R.drawable.tiancheng1);
            textView.setText(R.string.tiancheng);
        }
        else if(name.equals("天蝎座")){
            imageView.setImageResource(R.drawable.tianxie1);
            textView.setText(R.string.tianxie);
        }
        else if(name.equals("射手座")){
            imageView.setImageResource(R.drawable.sheshou1);
            textView.setText(R.string.sheshou);
        }
        else if(name.equals("摩羯座")){
            imageView.setImageResource(R.drawable.mojie1);
            textView.setText(R.string.mojie);
        }
        else if(name.equals("水瓶座")){
            imageView.setImageResource(R.drawable.shuiping1);
            textView.setText(R.string.shuiping);
        }
        else if(name.equals("双鱼座")){
            imageView.setImageResource(R.drawable.shuangyu1);
            textView.setText(R.string.shuangyu);
        }else{
            imageView.setImageResource(R.drawable.user);
            textView.setText("请正确输入星座");
        }






        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findedlayout.this.finish();
            }
        });

    }
}
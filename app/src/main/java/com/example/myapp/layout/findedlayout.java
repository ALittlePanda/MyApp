package com.example.myapp.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.myapp.R;
import com.example.myapp.data.FindIt;

public class findedlayout extends AppCompatActivity {
    private FindIt findIt;
    private TextView textView;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findedlayout);
        textView = (TextView)findViewById(R.id.findedlayout_text);
        imageView = (ImageView)findViewById(R.id.app_bar_image);

        Intent mintent = getIntent();
        Bundle mbundle = mintent.getExtras();
        String name = mbundle.getString("name");//得到星座的名字
        Log.i("星座名称：",name);

        /*
        String image = findIt.FindIt(name);
       // textView.setText(image);

         */


    }
}
package com.example.myapp.secondMain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapp.R;

public class Activity_MeAndYou extends AppCompatActivity {
    private static final String[] name={"水瓶座","双鱼座","白羊座","金牛座","双子座","巨蟹座","狮子座","处女座","天秤座","天蝎座","射手座","摩羯座"};
    private TextView textView;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;
    private int number;
    private Button button,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        textView = (TextView)findViewById(R.id.endtext3);
        spinner = (Spinner)findViewById(R.id.endspinner);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,name);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new SpinnerSelectedListener());
        spinner.setVisibility(View.VISIBLE);
        button = (Button)findViewById(R.id.endbutton1);
        button2 = (Button)findViewById(R.id.endbutton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinner.setOnItemSelectedListener(new SpinnerSelectedListener());
                if(name[number].equals("白羊座")){
                    textView.setText(R.string.pbaiyang);
                }
                else if(name[number].equals("金牛座")){
                    textView.setText(R.string.pjinniu);
                }
                else if(name[number].equals("双子座")){
                    textView.setText(R.string.pshuangzi);
                }
                else if(name[number].equals("巨蟹座")){
                    textView.setText(R.string.pjuxie);
                }
                else if(name[number].equals("狮子座")){
                    textView.setText(R.string.pshizi);
                }
                else if(name[number].equals("处女座")){
                    textView.setText(R.string.pchunu);
                }
                else if(name[number].equals("天秤座")){
                    textView.setText(R.string.ptiancheng);
                }
                else if(name[number].equals("天蝎座")){
                    textView.setText(R.string.ptianxie);
                }
                else if(name[number].equals("射手座")){
                    textView.setText(R.string.psheshou);
                }
                else if(name[number].equals("摩羯座")){
                    textView.setText(R.string.pmojie);
                }
                else if(name[number].equals("水瓶座")){
                    textView.setText(R.string.pshuiping);
                }
                else if(name[number].equals("双鱼座")){
                    textView.setText(R.string.pshuangyu);
                }
            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity_MeAndYou.this.finish();
            }
        });
    }
    class SpinnerSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                   long arg3) {
            Log.i("星座",name[arg2]);
            number = arg2;
        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
}
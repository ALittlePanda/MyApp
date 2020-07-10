package com.example.myapp.secondMain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapp.MainActivity;
import com.example.myapp.R;

public class FindMe extends AppCompatActivity {
    private static final String[] year={"1997","1998","1999","2000","2001","2002","2003","其他"};
    private static final String[] month={"1","2","3","4","5","6","7","8","9","10","11","12"};
    private static final String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private TextView view ,find_month,find_day;
    private Spinner spinner1,spinner2,spinner3;
    private ArrayAdapter<String> adapter,adapter2,adapter3;
    private Button button;

    int monthed,dayed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_me);
        find_month = (TextView)findViewById(R.id.find_month);
        find_day = (TextView)findViewById(R.id.find_day);
        view = (TextView) findViewById(R.id.find_year);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner)findViewById(R.id.spinner2);
        spinner3 = (Spinner)findViewById(R.id.spinner3);
        button = (Button)findViewById(R.id.find_button);
        //将可选内容与ArrayAdapter连接起来
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,year);
        adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,month);
        adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,day);
        //设置下拉列表的风格
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //将adapter 添加到spinner中
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);
        //添加事件Spinner事件监听
        spinner1.setOnItemSelectedListener(new SpinnerSelectedListener());
        spinner2.setOnItemSelectedListener(new SpinnerSelectedListener2());
        spinner3.setOnItemSelectedListener(new SpinnerSelectedListener3());
        //设置默认值
        spinner1.setVisibility(View.VISIBLE);
        spinner2.setVisibility(View.VISIBLE);
        spinner3.setVisibility(View.VISIBLE);



        /************************************/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(monthed>=1&&monthed<=2){
                    if(monthed<2){
                        if(dayed>=20&&dayed<=31){
                            //输出水瓶座
                            Toast.makeText(FindMe.this, "您是水瓶座", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        if(dayed<=18){
                            //输出水瓶座
                            Toast.makeText(FindMe.this, "您是水瓶座", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                if(monthed>=2&&monthed<=3){
                    if(monthed<3){
                        if(dayed>=19){
                            //输出双鱼座
                            Toast.makeText(FindMe.this, "您是双鱼座", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        if(dayed<=30){
                            //输出双鱼座
                            Toast.makeText(FindMe.this, "您是双鱼座", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                if(monthed>=3&&monthed<=4){
                    if(monthed<4){
                        if(dayed>=21){
                            //输出白羊座
                            Toast.makeText(FindMe.this, "您是白羊座", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        if(dayed<=19){
                            //输出白羊座
                            Toast.makeText(FindMe.this, "您是白羊座", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                if(monthed>=4&&monthed<=5){
                    if(monthed<5){
                        if(dayed>=20){
                            //输出金牛座
                            Toast.makeText(FindMe.this, "您是金牛座", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        if(dayed<=20){
                            //输出金牛座
                            Toast.makeText(FindMe.this, "您是金牛座", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                if(monthed>=5&&monthed<=6){
                    if(monthed<6){
                        if(dayed>=21){
                            //输出双子
                            Toast.makeText(FindMe.this, "您是双子座", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        if(dayed<=21){
                            //输出双子
                            Toast.makeText(FindMe.this, "您是双子座", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                if(monthed>=6&&monthed<=7){
                    if(monthed<7){
                        if(dayed>=22){
                            //输出巨蟹
                            Toast.makeText(FindMe.this, "您是巨蟹座", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        if(dayed<=22){
                            //输出巨蟹
                            Toast.makeText(FindMe.this, "您是巨蟹座", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                if(monthed>=7&&monthed<=8){
                    if(monthed<8){
                        if(dayed>=23){
                            //输出狮子
                            Toast.makeText(FindMe.this, "您是狮子座", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        if(dayed<=22){
                            //输出狮子
                            Toast.makeText(FindMe.this, "您是狮子座", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                if(monthed>=8&&monthed<=9){
                    if(monthed<9){
                        if(dayed>=23){
                            //输出处女
                            Toast.makeText(FindMe.this, "您是处女座", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        if(dayed<=22){
                            //输出处女
                            Toast.makeText(FindMe.this, "您是处女座", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                if(monthed>=9&&monthed<=10){
                    if(monthed<10){
                        if(dayed>=23){
                            //输出天秤
                            Toast.makeText(FindMe.this, "您是天秤座", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        if(dayed<=23){
                            //输出天秤
                            Toast.makeText(FindMe.this, "您是天秤座", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                if(monthed>=10&&monthed<=11){
                    if(monthed<11){
                        if(dayed>=24){
                            //输出天蝎
                            Toast.makeText(FindMe.this, "您是天蝎座", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        if(dayed<=22){
                            //输出天蝎
                            Toast.makeText(FindMe.this, "您是天蝎座", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                if(monthed>=11&&monthed<=12){
                    if(monthed<12){
                        if(dayed>=23){
                            //输出射手
                            Toast.makeText(FindMe.this, "您是射手座", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        if(dayed<=21){
                            //输出射手
                            Toast.makeText(FindMe.this, "您是射手座", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                else{
                    //输出摩羯
                    Toast.makeText(FindMe.this, "您是摩羯座", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    class SpinnerSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                                   long arg3) {

            view.setText("生日是："+year[arg2]+"年");

        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
    class SpinnerSelectedListener2 implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg4,
                                   long arg3) {

            find_month.setText(month[arg4]+"月");
            monthed = arg4+1;
        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }
    class SpinnerSelectedListener3 implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg5,
                                   long arg3) {

            find_day.setText(day[arg5]+"日");
            dayed = arg5+1;
        }

        public void onNothingSelected(AdapterView<?> arg0) {
        }
    }

}
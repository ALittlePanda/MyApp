package com.example.myapp.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.util.Log;

import com.example.myapp.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 自定义数据库管理类
 * 用来导入外部数据库garbage.db，以及打开、关闭该数据库操作
 */

public class DBManager {

    private final int BUFFER_SIZE=400000;
    public static final String DB_NAME="test.db";
    public static final String PACKAGE_NAME= "com.example.myapp";
    public static final String DB_PATH="/data"+ Environment.getDataDirectory().getAbsolutePath()+"/"+PACKAGE_NAME;
    private SQLiteDatabase database;
    private Context context;

    public DBManager(Context context){
        this.context=context;
    }

    public SQLiteDatabase getDatabase(){
        return database;
    }

    public void setDatabase(SQLiteDatabase database){
        this.database=database;
    }

    public void openDatabase(){
        System.out.println(DB_PATH+"/"+DB_NAME);
        this.database=this.openDatabase(DB_PATH+"/"+DB_NAME);
    }

    private SQLiteDatabase openDatabase(String dbfile){
        try{
            if(!(new File(dbfile).exists())){
                InputStream is=this.context.getResources().openRawResource(R.raw.test);
                FileOutputStream fos=new FileOutputStream(dbfile);
                byte[]buffer=new byte[BUFFER_SIZE];
                int count=0;
                while ((count=is.read(buffer))>0){
                    fos.write(buffer,0,count);
                }
                fos.close();
                is.close();

            }

            SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase(dbfile,null);
            return db;
        }catch (FileNotFoundException e){
            Log.e("Dongruinan","File not found");
            e.printStackTrace();
        }catch (IOException e){
            Log.e("Dongruinan","IOexception");
            e.printStackTrace();
        }
        return null;
    }

    public  void closeDatabase(){
        this.database.close();
    }
}

package com.example.myapp.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class FindIt {
    private SQLiteDatabase db=null;
    private String image;
    public FindIt(Context mContext){
        db=SQLiteDatabase.openOrCreateDatabase(DBManager.DB_PATH+"/"+DBManager.DB_NAME,null);
    }

    public String FindIt(String str){

        try{
            //模糊搜索
            Cursor cursor=db.rawQuery("select * from table where name like '%" + str + "%'",null);
            if(null!=cursor){
                while (cursor.moveToNext()){
                    String id=cursor.getString(cursor.getColumnIndex("ID"));
                    String type=cursor.getString(cursor.getColumnIndex("日期"));
                    image = cursor.getString(cursor.getColumnIndex("整体性格"));

                }
            }
            cursor.close();
        }catch (Exception e){
            e.printStackTrace();
            Log.i("Dongruinan","失败失败，查找失败");
        }finally {
            if(null!=db){
                db.close();
            }
        }
         return image;
    }



}

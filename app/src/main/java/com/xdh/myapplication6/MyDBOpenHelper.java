package com.xdh.myapplication6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBOpenHelper extends SQLiteOpenHelper {

    public MyDBOpenHelper(Context context,String name,SQLiteDatabase.CursorFactory factory,int version){
        super(context, "DB.db", null, 1);
    }

    //数据库创建时初始化
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE user(user_id INTEGER PRIMARY KEY AUTOINCREMENT,name VARCHAR(20))");

    }

    
    //数据库升级回调
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

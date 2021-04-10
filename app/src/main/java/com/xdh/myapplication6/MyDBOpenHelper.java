package com.xdh.myapplication6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBOpenHelper extends SQLiteOpenHelper {

    public MyDBOpenHelper(Context context,String name,SQLiteDatabase.CursorFactory factory,int version){
        super(context, "DB.db", null, 1);
    }

    //数据库创建时初始化,注意要修改初始数据时要卸载后重装才能调用生效
    @Override
    public void onCreate(SQLiteDatabase db) {
//        AUTOINCREMENT
//        PRIMARY KEY
        db.execSQL("CREATE TABLE user(user_id INTEGER,name VARCHAR(20),password VRACHAR(20))");
        db.execSQL("INSERT INTO user(user_id,name,password) VALUES(001,'admin','123456')");
        db.execSQL("INSERT INTO user(user_id,name,password) VALUES(002,'user1','123456')");
        db.execSQL("INSERT INTO user(user_id,name,password) VALUES(003,'user2','654321')");

    }

    
    //数据库升级回调
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

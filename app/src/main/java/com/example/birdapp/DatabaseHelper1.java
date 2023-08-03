package com.example.birdapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper1 extends SQLiteOpenHelper {

    private static final String DB_NAME = "birds.db";
    private static final int DB_VERSION = 1;

    public DatabaseHelper1(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE bird_table (_id INTEGER PRIMARY KEY , bird_name TEXT, time TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS bird_table");
        onCreate(db);
    }
}

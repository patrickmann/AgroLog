package com.pmann.agrolog;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AgroLogDbHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "AgroLog.db";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + AgroLogDBContract.AgroLogEntry.TABLE_NAME + " (" +
                    AgroLogDBContract.AgroLogEntry._ID + " INTEGER PRIMARY KEY," +
                    AgroLogDBContract.AgroLogEntry.COLUMN_NAME_LOC_ID + " INTEGER," +
                    AgroLogDBContract.AgroLogEntry.COLUMN_NAME_PLANT_ID + "INTEGER," +
                    AgroLogDBContract.AgroLogEntry.COLUMN_NAME_ACTION_ID + "INTEGER," +
                    AgroLogDBContract.AgroLogEntry.COLUMN_NAME_COMMENT + "TEXT" +
                    " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + AgroLogDBContract.AgroLogEntry.TABLE_NAME;

    public AgroLogDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //TODO
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //TODO
    }
}
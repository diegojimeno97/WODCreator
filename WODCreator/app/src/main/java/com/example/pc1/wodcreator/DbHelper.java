package com.example.pc1.wodcreator;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PC1 on 12/12/2017.
 */

public class DbHelper extends SQLiteOpenHelper {
    private static final String TAG = DbHelper.class.getSimpleName();

    //constructor
    public DbHelper(Context context){
        super(context, StatusContract.DB_NAME, null, StatusContract.DB_VERSION);
    }

    //crear las tablas e insertar ejercicios (PENDIENTE todavia)
    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = String.format("create table %s(%s int primary key, %s text, %s text, %s text)",
                StatusContract.TABLE1,
                StatusContract.ColumnEjercicio.ID,
                StatusContract.ColumnEjercicio.NOMBRE,
                StatusContract.ColumnEjercicio.DESCRIPCION);

        Log.d(TAG, "onCreate con SQL: " + sql);
        db.execSQL(sql);

        String sql2 = String.format("create table %s(%s int primary key, %s text, %s text, %s text, %s text)",
                StatusContract.TABLE2,
                StatusContract.ColumnWod.ID,
                StatusContract.ColumnWod.INTENSIDAD,
                StatusContract.ColumnWod.NOMBRE,
                StatusContract.ColumnWod.RONDAS,
                StatusContract.ColumnWod.TIPO
                );

        Log.d(TAG, "onCreate con SQL: " + sql2);
        db.execSQL(sql2);

        String sql3 = String.format("create table %s(%s int primary key, %s text, %s text, %s int)",
                StatusContract.TABLE3,
                StatusContract.ColumnEjerWod.ID,
                StatusContract.ColumnEjerWod.IDEjer,
                StatusContract.ColumnEjerWod.IDWod,
                StatusContract.ColumnEjerWod.REPETICION
        );

        Log.d(TAG, "onCreate con SQL: " + sql3);
        db.execSQL(sql3);
    }

    //llamado siempre que tengamos nueva version
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        // Aqui irían las sentencias del tipo ALTER TABLE, de momento lo hacemos mas sencillo:
        db.execSQL("drop table if exits "+ StatusContract.TABLE1);
        db.execSQL("drop table if exits "+ StatusContract.TABLE2);
        db.execSQL("drop table if exits "+ StatusContract.TABLE3);// borra la vieja base de datos
        onCreate(db);// crea una base de datos nueva
        Log.d(TAG,"onUgrade");
    } {
}

package com.example.proyectofinalpm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.proyectofinalpm.utilidades.utilidades;

public class ConexionSQLiteHelper extends SQLiteOpenHelper {

    public ConexionSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(utilidades.CREAR_TABLA_EXPOSICIONES);
        db.execSQL(utilidades.CREAR_TABLA_ARTISTAS);
        db.execSQL(utilidades.CREAR_TABLA_EXPONEN);
        db.execSQL(utilidades.CREAR_TABLA_TRABAJOS);
        db.execSQL(utilidades.CREAR_TABLA_COMENTARIOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+utilidades.TABLA_EXPOSICIONES);
        db.execSQL("DROP TABLE IF EXISTS "+utilidades.TABLA_ARTISTAS);
        db.execSQL("DROP TABLE IF EXISTS "+utilidades.TABLA_EXPONEN);
        db.execSQL("DROP TABLE IF EXISTS "+utilidades.TABLA_TRABAJOS);
        db.execSQL("DROP TABLE IF EXISTS "+utilidades.TABLA_COMENTARIOS);

        onCreate(db);
    }

}

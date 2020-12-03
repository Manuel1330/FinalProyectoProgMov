package com.example.proyectofinalpm;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinalpm.utilidades.utilidades;

public class RegistroExponenActivity extends AppCompatActivity {

    EditText campoIdExposicion, campoDniPasaporte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_exponen);

        campoIdExposicion= (EditText) findViewById(R.id.campoIdExposicion);
        campoDniPasaporte= (EditText) findViewById(R.id.campoDniPasaporte);
    }

    public void onClick(View view){
        registrarExpone();
    }

    private void registrarExpone() {
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this, "bd_practica", null, 1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(utilidades.CAMPO_ID_EXPOSICION,campoIdExposicion.getText().toString());
        values.put(utilidades.CAMPO_DNI_PASAPORTE,campoDniPasaporte.getText().toString());

        Long idExponeResultante=db.insert(utilidades.TABLA_EXPONEN,utilidades.CAMPO_ID_EXPOSICION,values);

        Toast.makeText(getApplicationContext(),"Que Se Expone Registro: "+idExponeResultante,Toast.LENGTH_SHORT).show();
    }

}

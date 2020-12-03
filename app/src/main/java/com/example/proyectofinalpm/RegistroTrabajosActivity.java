package com.example.proyectofinalpm;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinalpm.utilidades.utilidades;

public class RegistroTrabajosActivity extends AppCompatActivity {

    EditText campoNombreTrab, campoDescripcionTrabajo, campoTamaño, campoPeso, campoDniPasaporte, campoFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_trabajos);

        campoNombreTrab= (EditText) findViewById(R.id.campoNombreTrab);
        campoDescripcionTrabajo= (EditText) findViewById(R.id.campoDescripcionTrabajo);
        campoTamaño= (EditText) findViewById(R.id.campoTamaño);
        campoPeso= (EditText) findViewById(R.id.campoPeso);
        campoDniPasaporte= (EditText) findViewById(R.id.campoDniPasaporte);
        campoFoto= (EditText) findViewById(R.id.campoFoto);
    }

    public void onClick(View view){
        registrarTrabajos();
    }

    private void registrarTrabajos() {
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this, "bd_practica", null, 1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(utilidades.CAMPO_NOMBRE_TRAB,campoNombreTrab.getText().toString());
        values.put(utilidades.CAMPO_DESCRIPCION_TRABAJO,campoDescripcionTrabajo.getText().toString());
        values.put(utilidades.CAMPO_TAMANIO,campoTamaño.getText().toString());
        values.put(utilidades.CAMPO_PESO,campoPeso.getText().toString());
        values.put(utilidades.CAMPO_DNI_PASAPORTE,campoDniPasaporte.getText().toString());
        values.put(utilidades.CAMPO_FOTO,campoFoto.getText().toString());

        Long NombreTrabResultante=db.insert(utilidades.TABLA_TRABAJOS,utilidades.CAMPO_NOMBRE_TRAB,values);

        Toast.makeText(getApplicationContext(),"NombreTrab Registro: "+NombreTrabResultante,Toast.LENGTH_SHORT).show();
    }

}

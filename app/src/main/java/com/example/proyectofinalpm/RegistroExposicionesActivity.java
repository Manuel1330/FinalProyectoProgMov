package com.example.proyectofinalpm;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.proyectofinalpm.utilidades.utilidades;

public class RegistroExposicionesActivity extends AppCompatActivity {

    EditText campoIdExposicion, campoNombreExp, campoDescripcion, campoFechaInicio, campoFechaFin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_exposiciones);

        campoIdExposicion= (EditText) findViewById(R.id.campoIdExposicion);
        campoNombreExp= (EditText) findViewById(R.id.campoNombreExp);
        campoDescripcion= (EditText) findViewById(R.id.campoDescripcion);
        campoFechaInicio= (EditText) findViewById(R.id.campoFechaInicio);
        campoFechaFin= (EditText) findViewById(R.id.campoFechaFin);
    }
    
    public void onClick(View view){
        registrarExposiciones();
    }

    private void registrarExposiciones() {
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this, "bd_practica", null, 1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(utilidades.CAMPO_ID_EXPOSICION,campoIdExposicion.getText().toString());
        values.put(utilidades.CAMPO_NOMBRE_EXP,campoNombreExp.getText().toString());
        values.put(utilidades.CAMPO_DESCRIPCION,campoDescripcion.getText().toString());
        values.put(utilidades.CAMPO_FECHA_INICIO,campoFechaInicio.getText().toString());
        values.put(utilidades.CAMPO_FECHA_FIN,campoFechaFin.getText().toString());

        Long idExposicionResultante=db.insert(utilidades.TABLA_EXPOSICIONES,utilidades.CAMPO_ID_EXPOSICION,values);

        Toast.makeText(getApplicationContext(),"IdExposicion Registro: "+idExposicionResultante,Toast.LENGTH_SHORT).show();

    }

}

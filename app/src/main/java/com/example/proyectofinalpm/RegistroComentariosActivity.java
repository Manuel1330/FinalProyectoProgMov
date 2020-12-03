package com.example.proyectofinalpm;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinalpm.utilidades.utilidades;

public class RegistroComentariosActivity extends AppCompatActivity {

    EditText campoIdExposicion, campoNombreTrab, campoComentario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_comentarios);

        campoIdExposicion= (EditText) findViewById(R.id.campoIdExposicion);
        campoNombreTrab= (EditText) findViewById(R.id.campoNombreTrab);
        campoComentario= (EditText) findViewById(R.id.campoComentario);
    }

    public void onClick(View view){
        registrarComentarios();
    }

    private void registrarComentarios() {
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this, "bd_practica", null, 1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(utilidades.CAMPO_ID_EXPOSICION,campoIdExposicion.getText().toString());
        values.put(utilidades.CAMPO_NOMBRE_TRAB,campoNombreTrab.getText().toString());
        values.put(utilidades.CAMPO_COMENTARIO,campoComentario.getText().toString());

        Long idExposicionResultante=db.insert(utilidades.TABLA_COMENTARIOS,utilidades.CAMPO_ID_EXPOSICION,values);

        Toast.makeText(getApplicationContext(),"IdExposicion Registro: "+idExposicionResultante,Toast.LENGTH_SHORT).show();
    }

}

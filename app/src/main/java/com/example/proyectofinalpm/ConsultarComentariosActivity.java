package com.example.proyectofinalpm;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinalpm.utilidades.utilidades;

public class ConsultarComentariosActivity extends AppCompatActivity {

    EditText campoIdExposicion, campoNombreTrab, campoComentario;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_comentarios);

        conn=new ConexionSQLiteHelper(getApplicationContext(),"bd_practica",null,1);

        campoIdExposicion= (EditText) findViewById(R.id.campoIdExposicion);
        campoNombreTrab= (EditText) findViewById(R.id.campoNombreTrab);
        campoComentario= (EditText) findViewById(R.id.campoComentario);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnConsultar:
                consultar();
        }
    }

    private void consultar() {
        SQLiteDatabase db=conn.getReadableDatabase();
        String[] parametros={campoIdExposicion.getText().toString()};
        String[] campos={utilidades.CAMPO_ID_EXPOSICION,utilidades.CAMPO_NOMBRE_TRAB,utilidades.CAMPO_COMENTARIO};

        try {
            Cursor cursor =db.query(utilidades.TABLA_COMENTARIOS,campos,utilidades.CAMPO_ID_EXPOSICION+"=?",parametros,null,null,null);
            cursor.moveToFirst();
            campoIdExposicion.setText(cursor.getString(0));
            campoNombreTrab.setText(cursor.getString(1));
            campoComentario.setText(cursor.getString(2));
            cursor.close();
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"No existe",Toast.LENGTH_SHORT).show();
            limpiar();
        }

    }

    private void limpiar() {
        campoIdExposicion.setText("");
        campoNombreTrab.setText("");
        campoComentario.setText("");
    }

}


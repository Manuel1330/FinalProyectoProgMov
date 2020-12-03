package com.example.proyectofinalpm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyectofinalpm.adaptadores.ListaAdapter;
import com.example.proyectofinalpm.entidades.Exposiciones;
import com.example.proyectofinalpm.utilidades.utilidades;

import java.util.ArrayList;

public class ConsultarRecyclerViewActivity extends AppCompatActivity {

    ArrayList<Exposiciones> listaExposiciones;
    RecyclerView recyclerViewExposiciones;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_recyclerview);

        conn=new ConexionSQLiteHelper(getApplicationContext(),"bd_usuarios",null,1);

        listaExposiciones=new ArrayList<>();

        recyclerViewExposiciones= (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerViewExposiciones.setLayoutManager(new LinearLayoutManager(this));

        consultarListaPersonas();

        ListaAdapter adapter=new ListaAdapter(listaExposiciones);
        recyclerViewExposiciones.setAdapter(adapter);

    }

    private void consultarListaPersonas() {
        SQLiteDatabase db=conn.getReadableDatabase();

        Exposiciones exposiciones=null;

        Cursor cursor=db.rawQuery("SELECT * FROM "+ utilidades.TABLA_EXPOSICIONES,null);

        while (cursor.moveToNext()){

            exposiciones.setIdExposicion(cursor.getInt(0));
            exposiciones.setNombreExp(cursor.getString(1));
            exposiciones.setDescripcion(cursor.getString(2));

            listaExposiciones.add(exposiciones);
        }
    }
}

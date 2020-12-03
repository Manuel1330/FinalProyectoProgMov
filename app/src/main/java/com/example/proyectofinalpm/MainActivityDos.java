package com.example.proyectofinalpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivityDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this, "bd_practica", null, 1);

    }

    public void onClick(View view){
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.btnOpcionRegistroExposiciones:
                miIntent=new Intent(MainActivityDos.this, RegistroExposicionesActivity.class);
                break;
            case R.id.btnOpcionRegistroArtistas:
                miIntent=new Intent(MainActivityDos.this, RegistroArtistasActivity.class);
                break;
            case R.id.btnOpcionRegistroExponen:
                miIntent=new Intent(MainActivityDos.this, RegistroExponenActivity.class);
                break;
            case R.id.btnOpcionRegistroTrabajos:
                miIntent=new Intent(MainActivityDos.this, RegistroTrabajosActivity.class);
                break;
            case R.id.btnOpcionRegistroComentarios:
                miIntent=new Intent(MainActivityDos.this, RegistroComentariosActivity.class);
                break;
            case R.id.btnConsultaExponen:
                miIntent=new Intent(MainActivityDos.this, ConsultarExponenActivity.class);
                break;
            case R.id.btnConsultaRecyclerView:
                miIntent=new Intent(MainActivityDos.this, ConsultarRecyclerViewActivity.class);
                break;
            case R.id.btnConsultaTelefono:
                miIntent=new Intent(MainActivityDos.this, ConsultarTelefonoActivity.class);
                break;
            case R.id.btnConsultaComentarios:
                miIntent=new Intent(MainActivityDos.this, ConsultarComentariosActivity.class);
                break;
        }
        if (miIntent!=null){
            startActivity(miIntent);
        }
    }

}

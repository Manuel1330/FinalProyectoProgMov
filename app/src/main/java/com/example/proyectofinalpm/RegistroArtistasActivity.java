package com.example.proyectofinalpm;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectofinalpm.utilidades.utilidades;

public class RegistroArtistasActivity extends AppCompatActivity {

    EditText campoDniPasaporte, campoNombre, campoDireccion, campoPoblacion, campoProvincia, campoPais, campoMovilTrabajo, campoMovilPersonal, campoTelefonoFijo, campoEmail, campoWebBlog, campoFechaNacimiento;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_artistas);

        campoDniPasaporte= (EditText) findViewById(R.id.campoDniPasaporte);
        campoNombre= (EditText) findViewById(R.id.campoNombre);
        campoDireccion= (EditText) findViewById(R.id.campoDireccion);
        campoPoblacion= (EditText) findViewById(R.id.campoPoblacion);
        campoProvincia= (EditText) findViewById(R.id.campoProvincia);
        campoPais= (EditText) findViewById(R.id.campoPais);
        campoMovilTrabajo= (EditText) findViewById(R.id.campoMovilTrabajo);
        campoMovilPersonal= (EditText) findViewById(R.id.campoMovilPersonal);
        campoTelefonoFijo= (EditText) findViewById(R.id.campoTelefonoFijo);
        campoEmail= (EditText) findViewById(R.id.campoEmail);
        campoWebBlog= (EditText) findViewById(R.id.campoWebBlog);
        campoFechaNacimiento= (EditText) findViewById(R.id.campoFechaNacimiento);
    }

    public void onClick(View view){
        registrarExposiciones();
    }

    private void registrarExposiciones() {
        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this, "bd_practica", null, 1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(utilidades.CAMPO_DNI_PASAPORTE,campoDniPasaporte.getText().toString());
        values.put(utilidades.CAMPO_NOMBRE,campoNombre.getText().toString());
        values.put(utilidades.CAMPO_DIRECCION,campoDireccion.getText().toString());
        values.put(utilidades.CAMPO_POBLACION,campoPoblacion.getText().toString());
        values.put(utilidades.CAMPO_PROVINCIA,campoProvincia.getText().toString());
        values.put(utilidades.CAMPO_PAIS,campoPais.getText().toString());
        values.put(utilidades.CAMPO_MOVIL_TRABAJO,campoMovilTrabajo.getText().toString());
        values.put(utilidades.CAMPO_MOVIL_PERSONAL,campoMovilPersonal.getText().toString());
        values.put(utilidades.CAMPO_TELEFONO_FIJO,campoTelefonoFijo.getText().toString());
        values.put(utilidades.CAMPO_EMAIL,campoEmail.getText().toString());
        values.put(utilidades.CAMPO_WEB_BLOG,campoWebBlog.getText().toString());
        values.put(utilidades.CAMPO_FECHA_NACIMIENTO,campoFechaNacimiento.getText().toString());

        Long DniPasaporteResultante=db.insert(utilidades.TABLA_ARTISTAS,utilidades.CAMPO_DNI_PASAPORTE,values);

        Toast.makeText(getApplicationContext(),"DniPasaporte Registro: "+DniPasaporteResultante,Toast.LENGTH_SHORT).show();
    }

}

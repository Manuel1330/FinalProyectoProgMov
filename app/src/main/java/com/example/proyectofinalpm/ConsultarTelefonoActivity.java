package com.example.proyectofinalpm;

import android.Manifest;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.proyectofinalpm.utilidades.utilidades;

public class ConsultarTelefonoActivity extends AppCompatActivity {

    EditText campoDniPasaporte, campoMovilPersonal;

    Button Enviar;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_telefono);

        conn=new ConexionSQLiteHelper(getApplicationContext(),"bd_practica",null,1);

        campoDniPasaporte= (EditText) findViewById(R.id.campoDniPasaporte);
        campoMovilPersonal= (EditText) findViewById(R.id.campoMovilPersonal);

        Enviar = (Button)findViewById(R.id.btnEnviar);
        if(ActivityCompat.checkSelfPermission(
                ConsultarTelefonoActivity.this, Manifest.permission.SEND_SMS)
                != PackageManager.PERMISSION_GRANTED&& ActivityCompat.checkSelfPermission(
                ConsultarTelefonoActivity.this,Manifest
                        .permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(ConsultarTelefonoActivity.this,new String[]
                    { Manifest.permission.SEND_SMS,},1000);
        }else{
        };
        Enviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                enviarMensaje("689780809","Felicidades!");
            }
        });
    }

    private void enviarMensaje (String numero, String mensaje){
        try {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(numero,null,mensaje,null,null);
            Toast.makeText(getApplicationContext(), "Mensaje Enviado.", Toast.LENGTH_LONG).show();
        }
        catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Mensaje no enviado, datos incorrectos.", Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnConsultar:
                consultar();
        }
    }

    private void consultar() {
        SQLiteDatabase db=conn.getReadableDatabase();
        String[] parametros={campoDniPasaporte.getText().toString()};
        String[] campos={utilidades.CAMPO_DNI_PASAPORTE,utilidades.CAMPO_MOVIL_PERSONAL};

        try {
            Cursor cursor =db.query(utilidades.TABLA_ARTISTAS,campos,utilidades.CAMPO_DNI_PASAPORTE+"=?",parametros,null,null,null);
            cursor.moveToFirst();
            campoDniPasaporte.setText(cursor.getString(0));
            campoMovilPersonal.setText(cursor.getString(1));
            cursor.close();
        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"No existe",Toast.LENGTH_SHORT).show();
            limpiar();
        }

    }

    private void limpiar() {
        campoDniPasaporte.setText("");
        campoMovilPersonal.setText("");
    }

}

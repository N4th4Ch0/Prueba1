package com.example.prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id. txt_mail);

        SharedPreferences preferences = getSharedPreferences(  "Datos", Context.MODE_PRIVATE);
        et1.setText(preferences.getString("mail", ""));
    }

    //funcion del boton

    public void Guardar (View view) {

        SharedPreferences preferencias = getSharedPreferences("Datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor ObjEditor = preferencias.edit();
        ObjEditor.putString( "mail", et1.getText().toString());
        ObjEditor.commit();
        finish();

    }
}
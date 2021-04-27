package com.example.pruebaas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class cargandoJuego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargando_juego2);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) { // no funciona como deberia
        super.onPostCreate(savedInstanceState);

        Intent intent = new Intent(cargandoJuego.this, Juego.class);
        startActivity(intent);
    }
}
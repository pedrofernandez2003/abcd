package com.example.pruebaas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    EditText inputCodigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputCodigo = findViewById(R.id.inputIngresarCodigo);

        inputCodigo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void afterTextChanged(Editable s) {
                inputCodigo = findViewById(R.id.inputIngresarCodigo);
                if (inputCodigo.getText().toString().length() == 6){
                    Intent intent = new Intent(MainActivity.this, cargandoJuego.class);
                    startActivity(intent);
                }
            }
        });
    }
}
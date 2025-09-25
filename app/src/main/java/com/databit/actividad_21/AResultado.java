package com.databit.actividad_21;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class AResultado extends AppCompatActivity {
    private TextView txtNombreRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aresultado);

        txtNombreRecibido = findViewById(R.id.txtNombreRecibido);

        // Lee usando la misma clave definida en MainActivity
        String nombre = getIntent().getStringExtra(MainActivity.EXTRA_NOMBRE);
        if (nombre == null || nombre.isEmpty()) {
            nombre = "(sin nombre)";
        }
        txtNombreRecibido.setText("Nombre recibido: " + nombre);
    }
}
package com.databit.actividad_21;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private Button btnAceptar;

    // Clave única y compartida
    public static final String EXTRA_NOMBRE = "STNombre";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.ETNombre);
        btnAceptar = findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener(v -> {
            String nombre = etNombre.getText().toString().trim();
            if (nombre.isEmpty()) {
                Toast.makeText(this, "Ingresa un nombre.", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(MainActivity.this, AResultado.class);
            intent.putExtra(EXTRA_NOMBRE, nombre); // usa la constante
            startActivity(intent);

        });
    }
}

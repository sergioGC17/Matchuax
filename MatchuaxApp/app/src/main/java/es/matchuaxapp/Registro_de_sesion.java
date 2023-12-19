package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Registro_de_sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_sesion);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = findViewById(R.id.siguiente);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TelefonoEditText = findViewById(R.id.Telefono);

                String Telefono = TelefonoEditText.getText().toString();

                Intent intent = new Intent(Registro_de_sesion.this, Registro_de_sesion_2.class);
                intent.putExtra("Telefono", Telefono);
                startActivity(intent);
            }
        });

        ImageView imageView = findViewById(R.id.atras);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro_de_sesion.this, Inicio_de_sesion.class);
                startActivity(intent);
            }
        });

    }
}
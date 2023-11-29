package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import es.matchuax.R;

public class Inicio_de_sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_de_sesion);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView textView = findViewById(R.id.textViewCreateAccount);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio_de_sesion.this, Registro_de_sesion.class);
                startActivity(intent);
            }
        });

        Button button = findViewById(R.id.buttonLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio_de_sesion.this, Inicio.class);
                startActivity(intent);
            }
        });
    }
}
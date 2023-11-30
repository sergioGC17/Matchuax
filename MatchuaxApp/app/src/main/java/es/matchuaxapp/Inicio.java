package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        ImageView imageView = findViewById(R.id.next);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Inicio.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = findViewById(R.id.megamatch);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Megamatch.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = findViewById(R.id.match);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Match.class);
                startActivity(intent);
            }
        });



        Spinner spinner = findViewById(R.id.spinner);
        // Datos para el Spinner
        String[] opciones = {"", "Chat", "Mi Perfil", "Planes de Pago", "", "", "", "Ajustes"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String spinner = adapter.getItem(position);
                Intent intent;
                switch (spinner) {
                    case "Chat":
                        intent = new Intent(Inicio.this, Chats.class);
                        startActivity(intent);
                        break;
                    case "Mi Perfil":
                        intent = new Intent(Inicio.this, Perfil.class);
                        startActivity(intent);
                        break;
                    case "Planes de Pago":
                        intent = new Intent(Inicio.this, Inicio.class);
                        startActivity(intent);
                        break;
                    case "Ajustes":
                        intent = new Intent(Inicio.this, Ajustes_del_perfil.class);
                        startActivity(intent);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
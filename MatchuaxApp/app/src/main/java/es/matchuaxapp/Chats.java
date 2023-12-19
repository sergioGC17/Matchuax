package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Chats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);

        ImageView imageView = findViewById(R.id.atras);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarActivity(Inicio.class,  "", "");
            }
        });

        LinearLayout linearLayoutMaria = findViewById(R.id.LinearLayoutMariaFondo);
        linearLayoutMaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarActivity(Conversaciones.class, "María", "maria");
            }
        });

        LinearLayout linearLayoutTeresa = findViewById(R.id.LinearLayoutTeresaFondo);
        linearLayoutTeresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarActivity(Conversaciones.class, "Teresa", "teresa");
            }
        });

        LinearLayout linearLayoutPaula = findViewById(R.id.LinearLayoutPaulaFondo);
        linearLayoutPaula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarActivity(Conversaciones.class, "Paula", "paula");
            }
        });

        LinearLayout linearLayoutAndrea = findViewById(R.id.LinearLayoutAndreaFondo);
        linearLayoutAndrea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarActivity(Conversaciones.class, "Andrea", "andrea");
            }
        });

        LinearLayout linearLayoutLucia = findViewById(R.id.LinearLayoutLuciaFondo);
        linearLayoutLucia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarActivity(Conversaciones.class, "Lucía", "lucia");
            }
        });

        LinearLayout linearLayoutSofia = findViewById(R.id.LinearLayoutSofiaFondo);
        linearLayoutSofia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarActivity(Conversaciones.class, "Sofía", "sofia");
            }
        });

        LinearLayout linearLayoutMartina = findViewById(R.id.LinearLayoutMartinaFondo);
        linearLayoutMartina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarActivity(Conversaciones.class, "Martina", "martina");
            }
        });
    }

    public void cambiarActivity(Class<?> claseDestino, String nombrePersona, String nombreImagen){
        Intent intent = new Intent(Chats.this, claseDestino);
        if(!nombrePersona.equals("")){
            intent.putExtra("Persona", nombrePersona);
        }
        if(!nombreImagen.equals("")) {
            intent.putExtra("Imagen", nombreImagen);
        }
        startActivity(intent);
    }
}

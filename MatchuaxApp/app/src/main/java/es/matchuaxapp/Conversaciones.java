package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import es.matchuax.R;

public class Conversaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversaciones);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = findViewById(R.id.atras);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Conversaciones.this, Chats.class);
                startActivity(intent);
            }
        });


        ImageView imageView2 = findViewById(R.id.imagen);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Conversaciones.this, Perfil_de_las_personas.class);
                startActivity(intent);
            }
        });


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView = findViewById(R.id.nombre);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Conversaciones.this, Perfil_de_las_personas.class);
                startActivity(intent);
            }
        });
    }
}
package es.matchuax;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Conversaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversaciones);

        //Redirigir a Perfil_de_las_personas
        LinearLayout linearLayoutPersona = findViewById(R.id.linear_layout_persona);
        linearLayoutPersona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Conversaciones.this, Perfil_de_las_personas.class);
                startActivity(intent);
            }
        });



        //Redirigir a Chats
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = findViewById(R.id.atras);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Conversaciones.this, Chats.class);
                startActivity(intent);
            }
        });

    }
}
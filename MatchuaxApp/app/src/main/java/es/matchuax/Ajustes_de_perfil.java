package es.matchuax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ajustes_de_perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes_de_perfil);


        ImageView imageView = findViewById(R.id.atras);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ajustes_de_perfil.this, Inicio.class);
                startActivity(intent);
            }
        });

        ImageView img3 = findViewById(R.id.ubi);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ajustes_de_perfil.this, Ubicacion.class);
                startActivity(intent);
            }
        });
        ImageView img2 = findViewById(R.id.quienesosmos);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ajustes_de_perfil.this, Quienes_somos.class);
                startActivity(intent);
            }
        });
    }

}
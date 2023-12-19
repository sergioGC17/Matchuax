package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Ajustes_del_perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajustes_del_perfil);

        TextView textViewEdad = findViewById(R.id.edad);
        TextView textViewNombre = findViewById(R.id.Nombre);
        TextView textViewDescripcion = findViewById(R.id.Descripcion);
        TextView textViewTelefono = findViewById(R.id.Telefono);
        TextView textViewEdificio = findViewById(R.id.Edificio);

        String edad = "";
        String Nombre = "";
        String Descripcion = "";
        String Telefono = "";
        String Edificio = "";

        Intent intent = getIntent();
        if (intent != null) {
            edad = intent.getStringExtra("edad");
            Nombre = intent.getStringExtra("Nombre");
            Descripcion = intent.getStringExtra("Descripcion");
            Telefono = intent.getStringExtra("Telefono");
            Edificio = intent.getStringExtra("Edificio");
            if (edad != null) {
                textViewEdad.setText(edad);
                textViewNombre.setText(Nombre);
                textViewDescripcion.setText(Descripcion);
                textViewTelefono.setText(Telefono);
                textViewEdificio.setText(Edificio);
            }
        }


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = findViewById(R.id.atras);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ajustes_del_perfil.this, Inicio.class);
                startActivity(intent);
            }
        });


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView2 = findViewById(R.id.quienesosmos);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ajustes_del_perfil.this, Quienes_somos.class);
                startActivity(intent);
            }
        });


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView3 = findViewById(R.id.ubi);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ajustes_del_perfil.this, Ubicacion.class);
                startActivity(intent);
            }
        });
    }
}
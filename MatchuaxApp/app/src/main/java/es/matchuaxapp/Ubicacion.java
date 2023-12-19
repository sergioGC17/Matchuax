package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Ubicacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);

        Intent intent = getIntent();
        if (intent != null) {
            String edad = intent.getStringExtra("edad");
            String Nombre = intent.getStringExtra("Nombre");
            String Descripcion = intent.getStringExtra("Descripcion");
            String Telefono = intent.getStringExtra("Telefono");
            String Edificio = intent.getStringExtra("Edificio");

            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = findViewById(R.id.atras);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Ubicacion.this, Ajustes_del_perfil.class);
                    intent.putExtra("edad", edad);
                    intent.putExtra("Nombre", Nombre);
                    intent.putExtra("Descripcion", Descripcion);
                    intent.putExtra("Edificio", Edificio);
                    intent.putExtra("Telefono", Telefono);
                    startActivity(intent);
                }
            });
        }else{
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = findViewById(R.id.atras);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Ubicacion.this, Ajustes_del_perfil.class);
                    startActivity(intent);
                }
            });
        }



        //Spinner
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Spinner spinnerEdificios = findViewById(R.id.edificio);

        String[] edificios = {"Edificio A", "Edificio B", "Edificio C", "Edificio D", "Edificio T1", "Edificio T2"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, edificios);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEdificios.setAdapter(adapter);
        ImageView imageViewMapa = findViewById(R.id.mapa);

        spinnerEdificios.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String EdificioSeleccionado = adapter.getItem(position);

                switch (EdificioSeleccionado) {
                    case "Edificio A":
                        imageViewMapa.setImageResource(R.drawable.mapaa);
                        break;
                    case "Edificio B":
                        imageViewMapa.setImageResource(R.drawable.mapab);
                        break;
                    case "Edificio C":
                        imageViewMapa.setImageResource(R.drawable.mapac);
                        break;
                    case "Edificio D":
                        imageViewMapa.setImageResource(R.drawable.mapad);
                        break;
                    case "Edificio T1":
                        imageViewMapa.setImageResource(R.drawable.mapat1);
                        break;
                    case "Edificio T2":
                        imageViewMapa.setImageResource(R.drawable.mapat2);
                        break;
                    default:
                        imageViewMapa.setImageResource(R.drawable.mapa);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
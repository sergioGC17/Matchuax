package es.matchuax;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Registro_de_sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_sesion);
        // Definir la lista de universidades
        /*String[] universidades = {"Seleciona tu Universidad", "Universidad Alfonso X el sabio","Universidad Francisco de vitoria","Universidad Europea"};

        // Enlazar el Spinner con las opciones de universidades
        Spinner universitySpinner = findViewById(R.id.Universidades);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, universidades);
        universitySpinner.setAdapter(adapter);

        // Agregar un escuchador al Spinner para manejar la selección
        universitySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedUniversity = universidades[position];
                // Realizar acciones con la universidad seleccionada


            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Manejar caso en que no se selecciona nada (si es necesario)
            }
        });
        */

        ImageView imageView = findViewById(R.id.atras);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro_de_sesion.this, Inicio_de_sesion.class);
                startActivity(intent);
            }
        });
        Button button = findViewById(R.id.BOTON_REGISTRAR);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro_de_sesion.this, Registro_de_sesion2.class);
                startActivity(intent);
            }
        });
    }
}
package es.matchuax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;


public class Match extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        // Obtén la referencia del Spinner desde el diseño
        Spinner spinner = findViewById(R.id.spinner);

        // Datos para el Spinner
        String[] languages = {"","Chat", "Mi Perfil", "Planes de Pago", "", "", "", "Ajustes"};

        // Crea un adaptador y configúralo para el Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }
}
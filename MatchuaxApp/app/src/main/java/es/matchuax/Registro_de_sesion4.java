package es.matchuax;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class Registro_de_sesion4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_sesion4);

        String[] edificios = getResources().getStringArray(R.array.edificios);
        String[] listaedificios = getResources().getStringArray(R.array.edificios);

// Crear un adaptador para el spinner
        Spinner spinnerCountries = findViewById(R.id.EDIFICIOS);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listaedificios);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCountries.setAdapter(adapter);

// Obtener el país seleccionado
        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedCountry = listaedificios[position];
                // Aquí puedes trabajar con el país seleccionado
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Acción cuando no se selecciona nada
            }
        });
    }
}

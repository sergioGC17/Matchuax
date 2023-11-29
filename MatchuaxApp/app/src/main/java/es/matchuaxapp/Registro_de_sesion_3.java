package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import es.matchuax.R;

public class Registro_de_sesion_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_sesion3);

        Button button = findViewById(R.id.siguiente);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro_de_sesion_3.this, Registro_de_sesion_4.class);
                startActivity(intent);
            }
        });



        String[] countries = getResources().getStringArray(R.array.countries_array);
        String[] listaPaises = getResources().getStringArray(R.array.countries_array);

// Crear un adaptador para el spinner
        Spinner spinnerCountries = findViewById(R.id.pais);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listaPaises);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCountries.setAdapter(adapter);

// Obtener el país seleccionado
        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedCountry = listaPaises[position];
                // Aquí puedes trabajar con el país seleccionado
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // Acción cuando no se selecciona nada
            }
        });
    }


}
package es.matchuax;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Spinner spinner = findViewById(R.id.spinner);

        // Datos para el Spinner
        String[] opciones = {"", "Chat", "Mi Perfil", "Planes de Pago", "", "", "", "Ajustes"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ImageView matchBtn = findViewById(R.id.match);
        matchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Match.class);
                startActivity(intent);
            }
        });

        ImageView megamatchBtn = findViewById(R.id.megamatch);
        megamatchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Megamatch.class);
                startActivity(intent);
            }
        });
    }
}

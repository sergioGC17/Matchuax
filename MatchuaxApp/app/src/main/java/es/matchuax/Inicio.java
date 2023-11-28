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
        setContentView(R.layout.activity_match);

        // Obtén la referencia del Spinner desde el diseño
        Spinner spinner = findViewById(R.id.spinner);

        // Datos para el Spinner
        String[] languages = {"", "Chat", "Mi Perfil", "Planes de Pago", "", "", "", "Ajustes"};

        // Crea un adaptador y configúralo para el Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Aquí empieza el código para el ImageView "atras"
        ImageView imageViewAtras = findViewById(R.id.atras);
        imageViewAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Chats.class);
                startActivity(intent);
            }
        });
        // Aquí termina el código para el ImageView "atras"

        // Aquí empieza el código para el ImageView "match"
        ImageView imageViewMatch = findViewById(R.id.match);
        imageViewMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Match.class);
                startActivity(intent);
            }
        });
        // Aquí termina el código para el ImageView "match"

        // Aquí empieza el código para el ImageView "matchpremium"
        ImageView imageViewMatchPremium = findViewById(R.id.matchpremium);
        imageViewMatchPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Megamatch.class);
                startActivity(intent);
            }
        });
        // Aquí termina el código para el ImageView "matchpremium"
    }
}



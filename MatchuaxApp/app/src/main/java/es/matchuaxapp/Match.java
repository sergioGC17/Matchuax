package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Match extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        // Obtén referencias a las vistas
        ImageView imageViewAtras = findViewById(R.id.atras);
        TextView textViewNombre = findViewById(R.id.match_nombre);
        TextView textViewEdificio = findViewById(R.id.building);
        ImageView imageViewChat = findViewById(R.id.matchchat);
        ImageView imageViewFoto = findViewById(R.id.match_foto);

        // Obtén la información pasada desde la actividad Inicio
        Intent intent = getIntent();
        if (intent != null) {
            String nombrePersona = intent.getStringExtra("NombrePersona");
            int idImagenPersona = intent.getIntExtra("IdImagenPersona", 0);
            String edificio = intent.getStringExtra("Edificio");

            // Muestra la información en las vistas
            textViewNombre.setText(nombrePersona);
            textViewEdificio.setText(edificio);
            imageViewFoto.setImageResource(idImagenPersona);
        }

        // Manejador de clic para el botón "Atrás"
        imageViewAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Match.this, Inicio.class);
                startActivity(intent);
            }
        });

        // Manejador de clic para la imagen de chat
        imageViewChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Match.this, Chats.class);
                startActivity(intent);
            }
        });
    }
}

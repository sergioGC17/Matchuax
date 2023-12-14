package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Inicio extends AppCompatActivity {

    private static final int[] IMAGENES_PERSONAS = {
            R.drawable.maria,
            R.drawable.paula,
            R.drawable.andrea,
            R.drawable.lucia,
            R.drawable.martina,
            R.drawable.sofia,
            R.drawable.teresa,
            // Agrega más recursos de imágenes según sea necesario
    };

    private ImageView imageViewPersona;
    private TextView textViewNombre;
    private TextView textViewEdificio;
    private int indiceActual;  // Asegúrate de actualizar este índice según tu lógica

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ImageView imageView = findViewById(R.id.next);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Inicio.class);
                startActivity(intent);
            }
        });



        ImageView imageView4 = findViewById(R.id.ajustes);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Ajustes_del_perfil.class);
                startActivity(intent);
            }
        });

        ImageView imageView5 = findViewById(R.id.user);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Ajustes_del_perfil.class); // Cambia PerfilDeUsuario por el nombre correcto de tu clase de perfil de usuario
                startActivity(intent);
            }
        });

        ImageView imageView6 = findViewById(R.id.chat);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Chats.class); // Cambia ListaDeChats por el nombre correcto de tu clase de lista de chats
                startActivity(intent);
            }
        });

        // Obtén referencias a las vistas
        imageViewPersona = findViewById(R.id.persona);
        textViewNombre = findViewById(R.id.editText);
        textViewEdificio = findViewById(R.id.textView);

        // Configura una imagen aleatoria y muestra la información
        indiceActual = obtenerIndiceAleatorio();
        mostrarInformacionPersona();

        // Manejador de clic para el botón "Match"
        ImageView imageViewMatch = findViewById(R.id.match);
        imageViewMatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtén la información actual de la persona en la actividad Inicio
                String nombrePersona = textViewNombre.getText().toString();
                int idImagenPersona = IMAGENES_PERSONAS[indiceActual];
                String edificio = textViewEdificio.getText().toString();

                // Crea un Intent y pasa la información a la actividad Match
                Intent intent = new Intent(Inicio.this, Match.class);
                intent.putExtra("NombrePersona", nombrePersona);
                intent.putExtra("IdImagenPersona", idImagenPersona);
                intent.putExtra("Edificio", edificio);
                startActivity(intent);
            }
        });

        // Manejador de clic para el botón "Megamatch"
        ImageView imageViewMegamatch = findViewById(R.id.megamatch);
        imageViewMegamatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtén la información actual de la persona en la actividad Inicio
                String nombrePersona = textViewNombre.getText().toString();
                int idImagenPersona = IMAGENES_PERSONAS[indiceActual];
                String edificio = textViewEdificio.getText().toString();

                // Crea un Intent y pasa la información a la actividad Megamatch
                Intent intent = new Intent(Inicio.this, Megamatch.class);
                intent.putExtra("NombrePersona", nombrePersona);
                intent.putExtra("IdImagenPersona", idImagenPersona);
                intent.putExtra("Edificio", edificio);
                startActivity(intent);
            }
        });

        // Otros manejadores de clic para imágenes...
    }

    private int obtenerIndiceAleatorio() {
        Random random = new Random();
        return random.nextInt(IMAGENES_PERSONAS.length);
    }

    private void mostrarInformacionPersona() {
        int idImagen = IMAGENES_PERSONAS[indiceActual];
        imageViewPersona.setImageResource(idImagen);

        String[] nombres = {"Maria 20 años", "Paula 18 años", "Andrea 21 años", "Lucia 22 años", "Martina 19 años", "Sofia 24 años", "Teresa 23 años"};
        String[] edificios = {"Edificio A", "Edificio B", "Edificio C", "Edificio D"};

        String nombre = nombres[new Random().nextInt(nombres.length)];
        String edificio = edificios[new Random().nextInt(edificios.length)];

        textViewNombre.setText(nombre);
        textViewEdificio.setText(edificio);
    }
}

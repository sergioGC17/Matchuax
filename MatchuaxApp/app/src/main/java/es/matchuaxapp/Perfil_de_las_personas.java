package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Perfil_de_las_personas extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_de_las_personas);


        ImageView imagenPerfil = findViewById(R.id.perfil);
        ImageView imagenSpinner = findViewById(R.id.spinner);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView textView = findViewById(R.id.nombre);

        Intent intent = getIntent();
        if (intent != null) {
            String nombrePersona = intent.getStringExtra("Persona");
            textView.setText(nombrePersona);

            String nombreImagen = intent.getStringExtra("Imagen");
            @SuppressLint("DiscouragedApi") int idImagen = getResources().getIdentifier(nombreImagen, "drawable", getPackageName());
            if (idImagen != 0) {
                imagenPerfil.setImageResource(idImagen);
                imagenSpinner.setImageResource(idImagen);
            }

            TextView email = findViewById(R.id.email);

            switch (nombreImagen) {
                case "maria":
                    email.setText("mariadgz@uax.com");
                    break;
                case "teresa":
                    email.setText("teresapeca@uax.com");
                    break;
                case "paula":
                    email.setText("paulapagar@uax.com");
                    break;
                case "andrea":
                    email.setText("andreagofe@uax.com");
                    break;
                case "lucia":
                    email.setText("luciasanga@uax.com");
                    break;
                case "sofia":
                    email.setText("sofiapergon@uax.com");
                    break;
                case "martina":
                    email.setText("martinafuga@uax.com");
                    break;
                default:
                    // Acción por defecto si nombreImagen no coincide con ninguno de los casos anteriores
                    break;
            }

        }

    }
}
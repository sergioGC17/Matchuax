package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;

public class Conversaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversaciones);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = findViewById(R.id.atras);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Conversaciones.this, Chats.class);
                startActivity(intent);
            }
        });


        ImageView imageView2 = findViewById(R.id.imagen);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView textView = findViewById(R.id.nombre);

        Intent intent = getIntent();
        if (intent != null) {
            //poner el nombre
            String nombrePersona = intent.getStringExtra("Persona");
            textView.setText(nombrePersona);

            //poner la imagen
            String nombreImagen = intent.getStringExtra("Imagen");
            @SuppressLint("DiscouragedApi") int idImagen = getResources().getIdentifier(nombreImagen, "drawable", getPackageName());
            if (idImagen != 0) {
                imageView2.setImageResource(idImagen);
            }

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cambiarActivity(Perfil_de_las_personas.class, nombrePersona, nombreImagen);
                }
            });

            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cambiarActivity(Perfil_de_las_personas.class, nombrePersona, nombreImagen);
                }
            });

            /*

            HashMap<Integer, String> tusMesajes = new HashMap<>();
            HashMap<Integer, String> otrosMesajes = new HashMap<>();

            if(nombreImagen.equals("maria")){
                otrosMesajes.put(1, "Hola!");
                otrosMesajes.put(2, "¿De dónde eres?");
                tusMesajes.put(3, "Yo soy de Madrid.");
                tusMesajes.put(4, "¿Y tú?");
                otrosMesajes.put(5, "Yo de Zaragoza.");
                otrosMesajes.put(6, "De este pequeño pueblo.");
                otrosMesajes.put(7, "\uD83D\uDCF8 Foto.");
                tusMesajes.put(8, " Que bonito!!");
                otrosMesajes.put(9, "Jaja.");
                otrosMesajes.put(10, "La verdad que si.");
                otrosMesajes.put(11, "Tú estás estudiando medicina, ¿verdad?");
                tusMesajes.put(12, "Si, en el edificio 'A', ¿y tú?");
                otrosMesajes.put(13, "\uD83D\uDD08 Audio.");
            }
            TextView textViewNuevo = new TextView(this);

            textViewNuevo.setText(otrosMesajes.get(5)); // Establecer el texto desde resources
            textViewNuevo.setTextColor(getResources().getColor(R.color.black)); // Establecer color de texto
            textViewNuevo.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18); // Establecer tamaño de texto en sp
            textViewNuevo.setBackgroundResource(R.drawable.textview_otros_mensajes_conversaciones); // Establecer fondo
            textViewNuevo.setGravity(Gravity.START); // Establecer gravedad
            textViewNuevo.setPadding(0, 0, 0, 5);
            textViewNuevo.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                    )
            );

            LinearLayout layout = findViewById(R.id.LinearLayoutConversacion); // Reemplaza con tu layout
            layout.addView(textViewNuevo);

             */

        }

    }
    public void cambiarActivity(Class<?> claseDestino, String nombrePersona, String nombreImagen){
        Intent intent = new Intent(Conversaciones.this, claseDestino);
        if(!nombrePersona.equals("")){
            intent.putExtra("Persona", nombrePersona);
        }
        if(!nombreImagen.equals("")) {
            intent.putExtra("Imagen", nombreImagen);
        }
        startActivity(intent);
    }
}
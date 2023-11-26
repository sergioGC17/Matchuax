package es.matchuax;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Chats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);

        //Redirigir a Inicio
        ImageView imageView = findViewById(R.id.atras);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chats.this, Inicio.class);
                startActivity(intent);
            }
        });




        //Redirigir a Chats
        //Maria
        LinearLayout linearLayoutMaria = findViewById(R.id.linear_layout_maria_fondo);
        linearLayoutMaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirConversaciones("Maria");
            }
        });

        //Teresa
        LinearLayout linearLayoutTeresa = findViewById(R.id.linear_layout_teresa_fondo);
        linearLayoutTeresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirConversaciones("Teresa");
            }
        });

        //Paula
        LinearLayout linearLayoutPaula = findViewById(R.id.linear_layout_paula_fondo);
        linearLayoutPaula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirConversaciones("Paula");
            }
        });

        //Andrea
        LinearLayout linearLayoutAndrea = findViewById(R.id.linear_layout_andrea_fondo);
        linearLayoutAndrea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirConversaciones("Andrea");
            }
        });

        //Lucia
        LinearLayout linearLayoutLucia = findViewById(R.id.linear_layout_lucia_fondo);
        linearLayoutLucia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirConversaciones("Lucia");
            }
        });

        //Sofia
        LinearLayout linearLayoutSofia = findViewById(R.id.linear_layout_sofia_fondo);
        linearLayoutSofia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirConversaciones("Sofia");
            }
        });

        //Martina
        LinearLayout linearLayoutMartina = findViewById(R.id.linear_layout_martina_fondo);
        linearLayoutMartina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirConversaciones("Martina");
            }
        });
    }


    private void abrirConversaciones(String nombre) {
        Intent intent = new Intent(Chats.this, Conversaciones.class);
        intent.putExtra("nombre", nombre);
        startActivity(intent);
    }
}

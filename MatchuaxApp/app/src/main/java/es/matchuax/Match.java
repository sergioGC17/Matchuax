package es.matchuax;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import es.varela.mario.machtuax.R;

public class Match extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        ImageView imageView = findViewById(R.id.atras);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Match.this, Inicio.class);
                startActivity(intent);
            }
        });

        // Configuración del OnClickListener para el ImageView "matchchat"
        ImageView imageViewMatchChat = findViewById(R.id.matchchat);
        imageViewMatchChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción al hacer clic en el ImageView "matchchat"
                Intent intent = new Intent(Match.this, Chats.class);
                startActivity(intent);
            }
        });
    }
}

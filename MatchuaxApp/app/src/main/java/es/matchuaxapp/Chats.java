package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import es.matchuax.R;

public class Chats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);

        ImageView imageView = findViewById(R.id.atras);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chats.this, Inicio.class);
                startActivity(intent);
            }
        });

        LinearLayout linearLayout = findViewById(R.id.LinearLayoutMariaFondo);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chats.this, Conversaciones.class);
                startActivity(intent);
            }
        });
    }
}
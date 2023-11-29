package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import es.matchuax.R;


public class Logo_cargando extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_cargando);


        ImageView imageView = findViewById(R.id.logocargando);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Logo_cargando.this, Inicio_de_sesion.class);
                startActivity(intent);
            }
        });
    }
}
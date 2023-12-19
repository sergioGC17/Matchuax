package es.matchuaxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Registro_de_sesion_4 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_de_sesion4);

        Button button = findViewById(R.id.siguiente);
        EditText DescripcionEditText = findViewById(R.id.Descripcion);


        final String[] Edificio = {""};
        @SuppressLint("CutPasteId") Spinner EdificioEditText = findViewById(R.id.Edificio);
        String[] opciones = {"Seleciona tu edificio", "Edificio A", "Edificio B", "Edificio C", "Edificio D", "Edificio T1", "Edificio T2"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        EdificioEditText.setAdapter(adapter);
        EdificioEditText.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                String spinner = adapter.getItem(position);
                Intent intent;
                switch (spinner) {
                    case "Edificio A":
                        Edificio[0] = "Edificio A";
                        break;
                    case "Edificio B":
                        Edificio[0] = "Edificio B";
                        break;
                    case "Edificio C":
                        Edificio[0] = "Edificio C";
                        break;
                    case "Edificio D":
                        Edificio[0] = "Edificio D";
                        break;
                    case "Edificio T1":
                        Edificio[0] = "Edificio T1";
                        break;
                    case "Edificio T2":
                        Edificio[0] = "Edificio T2";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registro_de_sesion_4.this, Inicio.class);

                String edad = getIntent().getStringExtra("edad");
                String Nombre = getIntent().getStringExtra("Nombre");
                String Telefono = getIntent().getStringExtra("Telefono");
                String Descripcion = DescripcionEditText.getText().toString();
                intent.putExtra("edad", edad);
                intent.putExtra("Nombre", Nombre);
                intent.putExtra("Telefono", Telefono);
                intent.putExtra("Descripcion", Descripcion);
                intent.putExtra("Edificio", Edificio[0]);

                startActivity(intent);
            }
        });
    }
}
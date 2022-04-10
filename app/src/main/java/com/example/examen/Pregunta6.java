package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Pregunta6 extends AppCompatActivity {
    TextView respuesta6;
    TextView textView6;
    Button radioButton16, radioButton17, radioButton18, atras6, salir6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta6);
        radioButton16 = findViewById(R.id.radioButton16);
        radioButton17 = findViewById(R.id.radioButton17);
        radioButton18 = findViewById(R.id.radioButtton18);
        salir6 = findViewById(R.id.salir6);
        atras6 = findViewById(R.id.atras6);
        textView6 = findViewById(R.id.textView6);
        respuesta6 = findViewById(R.id.respuesta6);

        atras6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                PreguntaAnterior();

            }
        });

        salir6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("irse a la pregunta siguiente...");
                RegresarseALasPreguntas();
            }
        });

        respuesta6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("mostrar resultado...");
                MostrarResultado();
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    private void PreguntaAnterior() {
        Intent i = new Intent(this, Pregunta5.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void MostrarResultado() {
        TextView textoResultado = (TextView) findViewById(R.id.respuesta6);
        textoResultado.setText("Respuesta: Encapsulamiento");
    }
}
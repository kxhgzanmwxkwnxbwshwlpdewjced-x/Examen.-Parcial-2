package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivitypregunta1 extends AppCompatActivity {
    TextView respuesta1;
    TextView textView1;
    Button radioButton1, radioButton2, radioButton3, siguiente1, salir1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypregunta1);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2_1);
        radioButton3 = findViewById(R.id.radioButton3_1);
        siguiente1 = findViewById(R.id.siguiente1);
        salir1 = findViewById(R.id.salir1);
        respuesta1 = findViewById(R.id.respuesta1);
        textView1 = findViewById(R.id.textView1);

        siguiente1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("regresarse a la pregunta anterior...");
                SiguientePregunta();
            }
        });

        salir1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("irse a la pregunta siguiente...");
                RegresarseALasPreguntas();
            }
        });

        respuesta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("mostrar resultado...");
                MostrarResultado();
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }

    private void SiguientePregunta()
    {
        Intent i= new Intent(this, Pregunta2.class);
        startActivity(i);
    }

    private void RegresarseALasPreguntas()
    {
        Intent i = new Intent( this, MainActivity.class);
        startActivity(i);
    }

    public void MostrarResultado() {
        TextView textoResultado = (TextView) findViewById(R.id.respuesta1);
        textoResultado.setText("Respuesta: es la instancia de una clase ");
    }

}
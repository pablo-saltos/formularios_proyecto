package facci.leonardotoala.dolphin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class clases_dia_asistencia_teach extends AppCompatActivity {
    TextView tomar_asistencia;
    TextView ver_asistencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clases_dia_asistencia_teach);
        tomar_asistencia = findViewById(R.id.tomar_asistencia);
        tomar_asistencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(clases_dia_asistencia_teach.this,asistencia_curso_teach.class);
                startActivity(intent);
            }
        });
        ver_asistencia = findViewById(R.id.ver_asistencia);
        ver_asistencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(clases_dia_asistencia_teach.this,revisar_asistencia_teach.class);
                startActivity(intent);
            }
        });

    }
}
package facci.leonardotoala.dolphin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class estudiantes_admin extends AppCompatActivity {
    Button bnuevoestudiante;
    ImageView imEditarEstudiante1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiantes_admin);

        bnuevoestudiante = findViewById(R.id.bnuevoestudiante);
        bnuevoestudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(estudiantes_admin.this,estudiantes_admin_crear.class);
                startActivity(intent);
            }
        });

        imEditarEstudiante1 = findViewById(R.id.imEditarEstudiante1);
        imEditarEstudiante1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(estudiantes_admin.this,estudiantes_admin_editar.class);
                startActivity(intent);
            }
        });
    }
}
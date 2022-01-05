package facci.leonardotoala.dolphin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class profesor_admin extends AppCompatActivity {
    Button bnuevoprofesor;
    ImageView imEditarProfesor1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesor_admin);

        bnuevoprofesor = findViewById(R.id.bnuevoprofesor);
        bnuevoprofesor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(profesor_admin.this,profesor_admin_crear.class);
                startActivity(intent);
            }
        });
        imEditarProfesor1 = findViewById(R.id.imEditarProfesor1);
        imEditarProfesor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(profesor_admin.this,profesor_admin_editar.class);
                startActivity(intent);
            }
        });
    }
}
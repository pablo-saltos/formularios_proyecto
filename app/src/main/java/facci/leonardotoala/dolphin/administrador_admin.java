package facci.leonardotoala.dolphin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class administrador_admin extends AppCompatActivity {
    Button bnuevoadministrador;
    ImageView imEditarAdministrador1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador_admin);
        bnuevoadministrador = findViewById(R.id.bnuevoadministrador);
        bnuevoadministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(administrador_admin.this,administrador_admin_crear.class);
                startActivity(intent);
            }
        });

        imEditarAdministrador1 = findViewById(R.id.imEditarAdministrador1);
        imEditarAdministrador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(administrador_admin.this,administrador_admin_editar.class);
                startActivity(intent);
            }
        });
    }
}
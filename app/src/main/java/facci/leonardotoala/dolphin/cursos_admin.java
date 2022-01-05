package facci.leonardotoala.dolphin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class cursos_admin extends AppCompatActivity {
    TextView nuevo_curso;
    TextView editar_curso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos_admin);

        nuevo_curso = findViewById(R.id.textView3);
        nuevo_curso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(cursos_admin.this,cursos_admin_crear.class);
                startActivity(intent);
            }
        });

        editar_curso = findViewById(R.id.textView7);
        editar_curso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(cursos_admin.this,cursos_admin_editar.class);
                startActivity(intent);
            }
        });

    }
}
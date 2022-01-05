package facci.leonardotoala.dolphin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class horario_admin extends AppCompatActivity {
    TextView editarclase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_admin);

        editarclase = findViewById(R.id.textView10);
        editarclase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(horario_admin.this,profesor_admin_editar.class);
                startActivity(intent);
            }
        });
    }
}
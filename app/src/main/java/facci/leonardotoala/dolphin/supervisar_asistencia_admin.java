package facci.leonardotoala.dolphin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class supervisar_asistencia_admin extends AppCompatActivity {
    CardView card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supervisar_asistencia_admin);

        card = (CardView) findViewById(R.id.cv);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(supervisar_asistencia_admin.this,estudiantes_asistencia_admin.class);
                startActivity(intent);
            }
        });
    }
}
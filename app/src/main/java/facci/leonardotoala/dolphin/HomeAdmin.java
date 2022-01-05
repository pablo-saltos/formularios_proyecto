package facci.leonardotoala.dolphin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeAdmin extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);
        bottomNavigationView=findViewById(R.id.bottomNav);
        getSupportFragmentManager().beginTransaction().replace(R.id.content,new cartelera()).commit();

        bottomNavigationView.setSelectedItemId(R.id.cartelera);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.cartelera:
                        fragment = new cartelera();
                        break;
                    case R.id.asistencia:
                        fragment = new asistencia();
                        break;
                    case R.id.administrar:
                        fragment = new administrar();
                        break;
                    case R.id.agendar:
                        fragment = new agendar();
                        break;
                    case R.id.perfil:
                        fragment = new perfil();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.content,fragment).commit();
                return true;
            }
        });
    }
}
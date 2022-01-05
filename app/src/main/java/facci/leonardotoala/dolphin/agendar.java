package facci.leonardotoala.dolphin;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class agendar extends Fragment {
    TextView verhorario;
    TextView añadir_clase;
    public agendar() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_agendar, container, false);
    }

    public void onViewCreated( View view, Bundle savedInstanceState) {
        verhorario = view.findViewById(R.id.ver_horario);
        verhorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getActivity(), horario_admin.class);
                startActivity(intent);
            }
        });
        añadir_clase = view.findViewById(R.id.añadir_clase);
        añadir_clase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getActivity(), agendar_crear_clase.class);
                startActivity(intent);
            }
        });
    }


}
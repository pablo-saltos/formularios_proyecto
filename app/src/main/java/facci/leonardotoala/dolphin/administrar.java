package facci.leonardotoala.dolphin;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class administrar extends Fragment {
    CardView profesores;
    CardView estudiantes;
    CardView administradores;
    CardView cursos;
    public administrar() {
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
        return inflater.inflate(R.layout.fragment_administrar, container, false);
    }
    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        profesores = view.findViewById(R.id.profesores);
        profesores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getActivity(),profesor_admin.class);
                startActivity(intent);
            }
        });
        estudiantes = view.findViewById(R.id.estudiantes);
        estudiantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getActivity(),estudiantes_admin.class);
                startActivity(intent);
            }
        });

        administradores = view.findViewById(R.id.administradores);
        administradores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getActivity(),administrador_admin.class);
                startActivity(intent);
            }
        });

        cursos = view.findViewById(R.id.cursos);
        cursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getActivity(),cursos_admin.class);
                startActivity(intent);
            }
        });
    }
}
package facci.leonardotoala.dolphin;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class asistencia extends Fragment {
    CardView card1;
    CardView card2;
    public asistencia() {
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
        return inflater.inflate(R.layout.fragment_asistencia, container, false);
    }
    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        card1 = view.findViewById(R.id.Curso1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getActivity(),supervisar_asistencia_admin.class);
                startActivity(intent);
            }
        });
        card2 = view.findViewById(R.id.Curso2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getActivity(),supervisar_asistencia_admin.class);
                startActivity(intent);
            }
        });
    }
}
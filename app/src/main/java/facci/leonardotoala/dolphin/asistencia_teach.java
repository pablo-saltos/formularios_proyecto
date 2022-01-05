package facci.leonardotoala.dolphin;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class asistencia_teach extends Fragment {
    CardView card;
    public asistencia_teach() {
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
        return inflater.inflate(R.layout.fragment_asistencia_teach, container, false);
    }

    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        card = view.findViewById(R.id.cursoa);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getActivity(),clases_dia_asistencia_teach.class);
                startActivity(intent);
            }
        });

    }
}
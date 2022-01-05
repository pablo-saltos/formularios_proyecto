package facci.leonardotoala.dolphin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;

public class login extends AppCompatActivity {
    Button btn;
    TextInputLayout usuario;
    TextInputLayout contrasena;

    String usuarios ="[{\"usuario\":\"admin\",\"contrasena\":\"123456\",\"rol\":\"admin\"},{\"usuario\":\"profesor\",\"contrasena\":\"123456\",\"rol\":\"profesor\"}]" ;
    JSONArray usuariosjson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn = findViewById(R.id.button);
        usuario = findViewById(R.id.etLoginUsername);
        contrasena=findViewById(R.id.etLoginPassword);
        try {
            usuariosjson=new JSONArray(usuarios);
        } catch (JSONException e) {}
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validar()) {
                    String user = usuario.getEditText().getText().toString();
                    String password = contrasena.getEditText().getText().toString();
                    JSONObject usuariovalidar = null;
                    JSONObject usuarioencontrado = null;
                    for (int indice = 0; indice < usuariosjson.length(); indice++) {
                        try {
                            usuariovalidar = usuariosjson.getJSONObject(indice);
                        } catch (JSONException e) {
                        }
                        try {
                            if (usuariovalidar.getString("usuario").equals(user) && usuariovalidar.getString("contrasena").equals(password)) {
                                usuarioencontrado = usuariosjson.getJSONObject(indice);
                            }
                        } catch (JSONException e) {
                        }
                    }
                    if (usuarioencontrado == null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
                        builder.setTitle("Error");
                        builder.setMessage("Usuario no encontrado o contraseña incorrecta");
                        builder.setPositiveButton("Aceptar", null);

                        AlertDialog dialog = builder.create();
                        dialog.show();

                    } else {
                        String rol = null;
                        try {
                            rol = usuarioencontrado.getString("rol");
                        } catch (JSONException e) {
                        }
                        Intent intent;
                        if (rol.equals("admin")) {
                            intent = new Intent(login.this, HomeAdmin.class);
                        } else {
                            intent = new Intent(login.this, home_teach.class);
                        }
                        startActivity(intent);
                    }
                }
                }
            });
    }


    public boolean validar(){
        boolean retorno=true;
        String user = usuario.getEditText().getText().toString();
        String password = contrasena.getEditText().getText().toString();

        if(user.isEmpty()){
            usuario.setError("Este campo no puede quedar vacio");
            retorno = false;
        }else{usuario.setError(null);}
        if(password.isEmpty()){
            contrasena.setError("Este campo no puede quedar vacio");
            retorno = false;
        }else{contrasena.setError(null);}
        return retorno;
    }

}
package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtusuario,txtclave;
    Button btningresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtusuario  = findViewById(R.id.txtusuario);
        txtclave  = findViewById(R.id.txtclave);
        btningresar = findViewById(R.id.btningresar);

        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtusuario.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Campo usuario Vacio", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    if (txtclave.getText().toString().isEmpty()){
                        Toast.makeText(MainActivity.this, "Campo Clave vacio", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                    if (txtusuario.getText().toString().equals("esteban") &&
                            txtclave.getText().toString().equals("123456789")) {
                        Intent b = new Intent(MainActivity.this,MenuActivity.class);
                        String usuario = txtusuario.getText().toString();
                        b.putExtra("usuario",usuario);
                        startActivity(b);
                    } else {
                        Toast.makeText(MainActivity.this, "usuario o contraseña incorrectas", Toast.LENGTH_SHORT).show();
                    }

                }

        });
    }
}

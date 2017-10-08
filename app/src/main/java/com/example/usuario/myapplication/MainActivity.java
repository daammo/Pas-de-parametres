package com.example.usuario.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button boton;
    EditText editText;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);
        texto = (TextView) findViewById(R.id.textView2);


        boton.setOnClickListener(this);

        Intent intent2 = getIntent();
        Bundle extras2 = intent2.getExtras();

        if (extras2 != null) {
            int edad = extras2.getInt("EDAD");


            if (edad > 18 && edad < 25) {
                texto.setText("Como tienes " + edad + " años ya eres mayor de edad");
            } else {
                if (edad >= 25 && edad < 35) {
                    texto.setText("Como tienes " + edad + " años estas en la flor de la vida");
                } else {
                    if (edad >= 35) {
                        texto.setText(edad + " años ya... ai ai ai");
                    }
                }
            }
        }

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.button:
                String nombre = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("NOMBRE", nombre);
                startActivity(intent);
                break;
        }
    }

}



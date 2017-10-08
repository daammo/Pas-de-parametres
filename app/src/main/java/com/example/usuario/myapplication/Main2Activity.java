package com.example.usuario.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    TextView texto;
    Button boton;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texto = (TextView) findViewById(R.id.textView3);
        boton = (Button) findViewById(R.id.button2);
        editText = (EditText) findViewById(R.id.editText2);

        boton.setOnClickListener(this);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras!=null){
            String nombre = extras.getString("NOMBRE");
            texto.setText("Buenas "+nombre+" indica tu edad");
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button2:
                int edad = Integer.parseInt(editText.getText().toString());
                Intent intent2 = new Intent(Main2Activity.this,MainActivity.class);
                intent2.putExtra("EDAD",edad);
                startActivity(intent2);
                break;

        }
    }
}

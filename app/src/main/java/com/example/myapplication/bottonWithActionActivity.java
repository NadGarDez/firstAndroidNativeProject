package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class bottonWithActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botton_with_action);

    }

    public void increse(View view){
        TextView textView = (TextView) findViewById(R.id.text);
        String texto = textView.getText().toString();
        String[] lineas = texto.split("/n");
        Integer numero = Integer.parseInt(lineas[0]);
        numero++;
        textView.setText(Integer.toString(numero));
        if(numero == 0){
            showToast("Number Cero");
        }
        else if(numero % 10 == 0){
            showToast("10 product");
        }
    }
    public void decrese(View view){
        TextView textView = (TextView) findViewById(R.id.text);
        String texto = textView.getText().toString();
        String[] lineas = texto.split("/n");
        Integer numero = Integer.parseInt(lineas[0]);
        numero--;

        textView.setText(Integer.toString(numero));
        if(numero == 0){
            showToast("Number Cero");
        }
        else if(numero % 10 == 0){
            showToast("10 product");
        }
    }

    public void showToast(String text){
        Context contexto = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(contexto,text,duration);
        toast.show();
    }

    public void comeBack(View view){
        Intent m = new Intent(this,MainActivity2.class);
        startActivity(m);
    }
}
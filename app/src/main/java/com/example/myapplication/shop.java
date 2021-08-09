package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class shop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
    }

    public void startRotIntent(View view){
        Intent myIntent = new Intent(this,MainActivity2.class);
        startActivity(myIntent);
    }
}
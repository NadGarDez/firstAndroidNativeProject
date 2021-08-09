package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;

public class MainActivity2 extends AppCompatActivity {
    public String layout = "main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void setNextLayout(View view){
        String tag = view.getTag().toString();
        switch (tag){
            case "goBack":
                setContentView(R.layout.main_activity);
            break;
            case "party":
                setContentView(R.layout.another_activity);
            break;
        }

    }
    public void startNextIntent(View view){
        Intent myintent = new Intent(this,shop.class);
        startActivity(myintent);

    }


}
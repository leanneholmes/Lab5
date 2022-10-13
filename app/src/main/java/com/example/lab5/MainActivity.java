package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button SignIn = findViewById(R.id.SignIn);
        Button CreateAccount = findViewById(R.id.CreateAccount);

        SignIn.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), SignIn.class);
            startActivity(intent);
        });

        CreateAccount.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), CreateAccount.class);
            startActivity(intent);
        });

        }



}
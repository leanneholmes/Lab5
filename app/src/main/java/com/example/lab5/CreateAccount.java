package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        Button SignUp = findViewById(R.id.SignUp);

        SignUp.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), Homepage.class);
            startActivity(intent);
        });
    }
}
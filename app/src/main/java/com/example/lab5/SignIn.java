package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button SignIn = findViewById(R.id.SignIn);

        SignIn.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), Homepage.class);
            startActivity(intent);
        });
    }
}
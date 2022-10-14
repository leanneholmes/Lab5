package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Todo extends AppCompatActivity {

    Fragment mainFragment;
    protected EditText inputTodo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        mainFragment  = new TodoFragment();
//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();

        Bundle bundle = new Bundle();

        bundle.putString("message", "test");
        mainFragment.setArguments(bundle);



        Button saveButton = findViewById(R.id.saveButton);

        inputTodo = findViewById(R.id.inputToDo);

        saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String message = inputTodo.getText().toString();
                bundle.putString("message", message);

                mainFragment.setArguments(bundle);

                getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();

//                FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
//                tr.detach(mainFragment).attach(mainFragment).commit();

//                tr.replace(R.id.container, mainFragment);
//                tr.commit();

                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
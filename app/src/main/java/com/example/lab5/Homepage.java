package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        FragmentManager fragmentManager = getSupportFragmentManager();

        Fragment budget = new BudgetFragment();
        Fragment expense = new ExpenseFragment();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.homePageFragmentContainerView, budget);
        fragmentTransaction.commit();

        Button budgetButton = findViewById(R.id.BudgetButton);
        budgetButton.setOnClickListener(view -> {
            FragmentTransaction budgetTransaction = fragmentManager.beginTransaction();
            budgetTransaction.replace(R.id.homePageFragmentContainerView, budget);
            budgetTransaction.commit();
        });

        Button expenseButton = findViewById(R.id.ExpenseButton);
        expenseButton.setOnClickListener(view -> {
            FragmentTransaction expenseTransaction = fragmentManager.beginTransaction();
            expenseTransaction.replace(R.id.homePageFragmentContainerView, expense);
            expenseTransaction.commit();
        });

    }
}
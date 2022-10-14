package com.example.lab5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TodoFragment extends Fragment {

    //RecyclerView recyclerView;

    TextView fragment_tv;

    //ArrayList<TodoItem> todoList;
    //TodoAdapter todoAdapter;
    //int count = -1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_todolist, container, false);
        String sentMessage = this.getArguments().getString("message");

//
//        count++;
//        TodoItem data = new TodoItem(sentMessage);
//        todoList = new ArrayList<>();
//        todoList.add(data);
//        todoAdapter = new TodoAdapter(todoList);
//        todoAdapter.notifyDataSetChanged();
        Toast.makeText(getActivity(), sentMessage, Toast.LENGTH_SHORT).show();

        fragment_tv = rootView.findViewById(R.id.fragmentTextView);
        fragment_tv.setText(sentMessage);


//        initUI(rootView);
        return rootView;
    }

//    private void initUI(ViewGroup rootView) {
//        recyclerView = rootView.findViewById(R.id.recyclerView);
//        recyclerView.setAdapter(todoAdapter);
//    }
}

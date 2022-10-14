package com.example.lab5;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.CustomViewHolder> {

    private ArrayList<TodoItem> todoList;

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView todoTitle;

        public CustomViewHolder(View view) {
            super(view);
            this.todoTitle = (TextView) view.findViewById(R.id.todoItemTextView);
        }
    }

    public TodoAdapter(ArrayList<TodoItem> list) {
        this.todoList = list;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.todo_item, viewGroup, false);

        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder viewholder, int position) {
        viewholder.todoTitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);

        viewholder.todoTitle.setGravity(Gravity.CENTER);

        viewholder.todoTitle.setText(todoList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return (null != todoList ? todoList.size() : 0);
    }
}

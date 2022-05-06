package com.example.fragmentjava.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentjava.R;
import com.example.fragmentjava.model.ListData;

import java.util.ArrayList;
import java.util.List;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    List<ListData> list = new ArrayList<>();

    public UserAdapter(List<ListData> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.second_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ListData data = list.get(position);
        holder.textView.setText(data.getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }

//        @Override
//        public void onClick(View v) {
//            int position = getAdapterPosition();
//
//            ListData listData = list.get(position);
//
//            Intent intent = new Intent(context, SecondActivity.class);
//            intent.putExtra("img", listData.getImage());
//            intent.putExtra("title", listData.getTitle());
//
//            context.startActivity(intent);
//
//
//        }
    }
}
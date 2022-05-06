package com.example.fragmentjava.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentjava.R;
import com.example.fragmentjava.adapter.UserAdapter;
import com.example.fragmentjava.model.ListData;

import java.util.ArrayList;
import java.util.List;


public class SecondFragment extends Fragment {
    RecyclerView recyclerView2;
    RecyclerView.LayoutManager layoutManager2;
    RecyclerView.Adapter adapter;
    private final List<ListData> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        recyclerView2 = view.findViewById(R.id.recyclerView2);
        list();
        layoutManager2 = new LinearLayoutManager(requireContext());
        adapter = new UserAdapter(list);
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setAdapter(adapter);
        return view;
    }

    public void list() {
        list.add(new ListData("Java"));
        list.add(new ListData("Kotlin"));
        list.add(new ListData("C++"));
        list.add(new ListData("PHP"));
        list.add(new ListData("Java Script"));
        list.add(new ListData("Java"));
        list.add(new ListData("Kotlin"));
        list.add(new ListData("C++"));
        list.add(new ListData("PHP"));
        list.add(new ListData("Java Script"));
        list.add(new ListData("Java"));
        list.add(new ListData("Kotlin"));
        list.add(new ListData("C++"));
        list.add(new ListData("PHP"));
        list.add(new ListData("Java Script"));
        list.add(new ListData("Java"));
        list.add(new ListData("Kotlin"));
        list.add(new ListData("C++"));
        list.add(new ListData("PHP"));
        list.add(new ListData("Java Script"));
    }
}
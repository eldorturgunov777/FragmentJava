package com.example.fragmentjava.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentjava.R;
import com.example.fragmentjava.adapter.ContactsAdapter;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    ArrayList<String> contacts = new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(requireContext());
        adapter = new ContactsAdapter(contacts);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        list();
        return view;
    }

    public void list() {
        contacts.add("1234");
        contacts.add("1234");
        contacts.add("xzv");
        contacts.add("zvzx");
        contacts.add("123zxv4");
        contacts.add("zvzxv");
        contacts.add("zv");
        contacts.add("1234");
        contacts.add("1234");
        contacts.add("1234");
        contacts.add("xzv");
        contacts.add("zvzx");
        contacts.add("123zxv4");
        contacts.add("zvzxv");
        contacts.add("zv");
        contacts.add("1234");
    }
}
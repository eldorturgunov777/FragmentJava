package com.example.fragmentjava.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentjava.R;
import com.example.fragmentjava.adapter.PostAdapter;
import com.example.fragmentjava.model.PostData;

import java.util.ArrayList;
import java.util.List;


public class ThreeFragment extends Fragment {
    RecyclerView recyclerView3;
    RecyclerView.LayoutManager layoutManager3;
    RecyclerView.Adapter adapter;
    private final List<PostData> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        recyclerView3 = view.findViewById(R.id.recyclerView3);
        layoutManager3 = new LinearLayoutManager(requireContext());
        adapter = new PostAdapter(list);
        recyclerView3.setLayoutManager(layoutManager3);
        recyclerView3.setAdapter(adapter);

        list();
        return view;
    }

    public void list() {
        list.add(new PostData("Sovuq suv bilan chaying: mutaxassis yog‘li sochlar bilan uy sharoitida qanday kurashish kerakligini ma’lum qildi", "Agar soch har kuni yuvilsa, bosh terisi ko‘proq yog‘ ishlab chiqarishni boshlaydi"));
        list.add(new PostData("Onlayn auksionda 50 777 ZZZ avtomobil raqami 669,6 mln so‘mga sotildi", "Ushbu avtoraqam 135 million so‘m boshlang‘ich narx bilan savdoga qo‘yilgan va savdolar davomida uning narxi 132 marta oshirilgan"));
        list.add(new PostData("O‘zbekistonning eng daromadli banklar ro‘yxati ma’lum bo‘ldi", "Ko‘plab banklar davlatga tegishli va rivojlantirish tashkilotlar sifatida ish yuritadi"));
        list.add(new PostData("Rasman: “Arsenal” Mikel Arteta bilan shartnomani uzaytirdi", "Kanonirlar” ispan mutaxassisiga ishonch bildirishda davom etadi"));
        list.add(new PostData("O‘zbekistonda nogironlarning soliqqa tortilmaydigan daromadi miqdori oshirildi", "Endilikda bolalikdan nogiron bo‘lganlar, shuningdek, I va II guruh nogironlarining MHTEKMning 3 baravari miqdoridagi mablag‘lari daromad solig‘iga tortilmaydi"));

    }
}
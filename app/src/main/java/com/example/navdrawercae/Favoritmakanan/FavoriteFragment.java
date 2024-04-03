package com.example.navdrawercae.Favoritmakanan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawercae.Model;
import com.example.navdrawercae.R;
import com.example.navdrawercae.makanan.Adaptermakanan;
import com.example.navdrawercae.minuman.AdapterMinuman;

import java.util.ArrayList;


public class FavoriteFragment extends Fragment {

    ArrayList<Model> modelmakananfav = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_fovarite,container,false);
        RecyclerView rvmakananfav = rootview.findViewById(R.id.rvfavorite);

        modelmakananfav.add(new Model("https://asset.kompas.com/crops/MX7SiiX2S-ayQJWU4WNk6N6akWg=/0x12:1000x679/750x500/data/photo/2021/01/29/60139260888f2.jpg","Nasi Liwet","Nasi liwet adalah hidangan nasi yang dimasak dengan santan dan rempah-rempah, disajikan dengan lauk-pauk seperti ayam goreng, tahu, tempe, dan telur serta ditaburi dengan serundeng (kelapa parut sangrai)."));
        modelmakananfav.add(new Model("https://asset.kompas.com/crops/Z66wjL-5TfcXmRUen_x7V5hvQcM=/0x372:1080x1092/750x500/data/photo/2022/06/26/62b7bbb145922.jpg"," Soto Solo","Soto Solo adalah sup ayam khas Solo yang kaya akan rempah-rempah dan bumbu. Disajikan dengan potongan ayam, telur rebus, kentang, tomat, daun bawang, dan bawang goreng, serta tambahan sambal dan kerupuk."));
        modelmakananfav.add(new Model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTPzrmiuLamSICHYGVM7EHpxPo9Qyofia0x3d5nhVGXxQ&s","Sego Kucing","Sego kucing adalah hidangan nasi kecil dengan lauk beragam seperti ayam suwir, tempe goreng, telur pindang, dan sambal."));
        modelmakananfav.add(new Model("https://asset.kompas.com/crops/J-BSOZ4kJgmEYryOU3GqKlU23g4=/0x0:1000x667/750x500/data/photo/2020/08/01/5f24e8ed0cbc9.jpg","Tengkleng Solo","Tengkleng adalah hidangan daging kambing yang dimasak dengan kuah kental berbumbu, biasanya disajikan dengan potongan tulang dan irisan daun bawang."));
        modelmakananfav.add(new Model("https://img-global.cpcdn.com/recipes/4a3f3fb183d1d80a/1200x630cq70/photo.jpg","Mangut Lele","Mangut lele adalah hidangan lele yang dimasak dengan bumbu rempah khas Jawa, seperti kemiri, ketumbar, dan kunyit, serta santan. Rasanya gurih, pedas, dan lezat, sering disajikan dengan nasi hangat."));


        rvmakananfav.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adaptermakanan adaptermakanfav = new Adaptermakanan(getContext(),modelmakananfav);
        rvmakananfav.setAdapter(adaptermakanfav);
        // Inflate the layout for this fragment
        return rootview;
    }
}
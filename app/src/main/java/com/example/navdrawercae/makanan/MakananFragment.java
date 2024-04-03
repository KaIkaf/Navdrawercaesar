package com.example.navdrawercae.makanan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawercae.Model;
import com.example.navdrawercae.R;

import java.util.ArrayList;


public class MakananFragment extends Fragment {
    ArrayList<Model> modelmakan = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_makanan, container, false);
        RecyclerView rvmakanan = rootview.findViewById(R.id.rvmakanan);
        // Inflate the layout for this fragment
            modelmakan.add(new Model("https://asset.kompas.com/crops/13s3VjlTLJDabBTBmmS08XphFVY=/0x0:1000x667/750x500/data/photo/2020/07/30/5f2242077ea7b.jpg","Sate buntal ","Sate buntal kambing adalah hidangan tradisional Indonesia yang terdiri dari potongan daging kambing yang ditusuk dan dipanggang di atas bara api. "));
            modelmakan.add(new Model("https://img-global.cpcdn.com/recipes/81a1af8241807a86/680x482cq70/serabi-solo-teflon-ala-notosuman-foto-resep-utama.jpg","Serabi Solo ","Serabi adalah jajanan khas Indonesia berupa kue dadar tipis yang dibuat dari campuran tepung beras, santan, dan gula. "));
            modelmakan.add(new Model("https://awsimages.detik.net.id/community/media/visual/2020/03/09/0fbc627a-58f3-43c9-9931-f49bfcc8f220_169.jpeg?w=1200"," Sate Kere","Sate kere adalah variasi sate yang lebih terjangkau secara finansial, terdiri dari potongan daging murah seperti hati, usus, atau tahu yang ditusuk dan dipanggang di atas bara api."));
            modelmakan.add(new Model("https://awsimages.detik.net.id/community/media/visual/2023/05/01/resep-sosis-solo-isi-ayam_43.jpeg?w=1200","Sosis Solo","Sosis Solo adalah hidangan khas Indonesia yang terbuat dari daging sapi cincang yang dicampur dengan rempah-rempah dan dibungkus dengan kulit pangsit. "));
            modelmakan.add(new Model("https://awsimages.detik.net.id/community/media/visual/2019/07/31/41dd3721-77c2-4340-81fc-eb1204a0e635_43.jpeg?w=600&q=90","Timlo Solo","Timlo Solo adalah masakan khas dari kota Solo, Jawa Tengah, Indonesia. Terdiri dari sup ayam yang kaya rempah, potongan daging ayam, telur rebus, kentang, wortel, dan kadang-kadang ditambahkan sosis atau bakso. "));


          rvmakanan.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adaptermakanan adatermakan = new Adaptermakanan(getContext(),modelmakan);
       rvmakanan.setAdapter(adatermakan);


        return rootview;

    }
}
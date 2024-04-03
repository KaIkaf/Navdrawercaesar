package com.example.navdrawercae.minuman;

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

import java.util.ArrayList;


public class MinumanFragment extends Fragment {
ArrayList<Model>modelminuman= new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_minuman, container, false);
        RecyclerView rvminuman = rootview.findViewById(R.id.rvminuman);
        modelminuman.add(new Model("https://elsamara.id/wp-content/uploads/2024/01/es-kapal.jpg"," Es Kapal Solo","Es kapal adalah hidangan pencuci mulut yang terdiri dari potongan es krim yang dibentuk menyerupai kapal layar. Biasanya terbuat dari beberapa lapisan es krim yang berbeda rasa, seperti vanilla, cokelat, dan stroberi, yang disusun secara bertingkat."));
        modelminuman.add(new Model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBq-Tfo4-ESVBYTjWHYq-i0XUek1Bk4ziEMOQnqs99Iw&s"," Wedang Asle","Wedang asle adalah minuman tradisional khas Jawa yang terkenal dengan khasiatnya dalam menghangatkan tubuh. Minuman ini terbuat dari campuran jahe segar, gula merah, daun pandan, dan rempah-rempah seperti kayu manis dan cengkeh."));
        modelminuman.add(new Model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTbBmU9wPKWSiktgQcwEDw-E624uHcMlUw8BMDTwGmBA&s","Es Gempol Pleret","Es Gempol Pleret adalah sebuah hidangan es tradisional khas Jawa Tengah yang terkenal akan keunikan rasa dan teksturnya. Terbuat dari campuran gempol (pasta beras yang digulung) dan pleret (pasta ketela pohon), es ini memiliki cita rasa yang unik dan menyegarkan."));
        modelminuman.add(new Model("https://asset.kompas.com/crops/UVQEPnETASJGN8uatfvQpbRcdhM=/0x0:780x520/750x500/data/photo/2019/03/06/342337677.jpg","Es Dawet Telasih","Es Dawet Telasih Pleret adalah minuman segar dari Jawa Tengah. Butiran dawet kenyal, biji telasih yang renyah, dan pasta pleret memberikan sensasi unik di setiap tegukan."));
        modelminuman.add(new Model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSrxtZz9kbWQRBdA4U972hDBvU8y1KTwDzCKjhbpXktuw&s","Wedang Ronde","Wedang Ronde  adalah minuman tradisional yang khas dari daerah Solo. Minuman ini terbuat dari campuran bahan-bahan alami seperti jahe, gula merah, telasih, dan pleret. Ronde-ronde kecil yang terbuat dari tepung ketan dan diisi dengan kacang tanah serta biji wijen menjadi ciri khasnya."));
        modelminuman.add(new Model("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqqY_3Zr0VZghcxcfentxwxUZmrw6Hriu2lucHWc90zw&s"," Beras Kencur","Beras Kencur Solo Telasih Pleret adalah minuman tradisional khas Solo yang memukau dengan kombinasi rasa dan aroma yang unik. Terbuat dari campuran beras, kencur, jahe, gula merah, dan air."));


        // Inflate the layout for this fragment

        rvminuman.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adaptermakanan adaterminuman = new Adaptermakanan(getContext(),modelminuman);
        rvminuman.setAdapter(adaterminuman);


        return rootview;
    }
}
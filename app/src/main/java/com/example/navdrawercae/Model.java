package com.example.navdrawercae;

public class Model {
    String Img;
    String Nama;
    String Desc;



    public Model(String img, String nama, String desc) {
        Img = img;
        Nama = nama;
        Desc = desc;

    }

    public String getImg() {
        return Img;
    }

    public String getNama() {
        return Nama;
    }
    public String getDesc() {
        return Desc;
    }

}

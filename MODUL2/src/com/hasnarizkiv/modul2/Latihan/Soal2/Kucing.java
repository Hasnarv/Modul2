package com.hasnarizkiv.modul2.Latihan.Soal2;

public class Kucing extends Binatang {
    String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }
    void getNama(){
        System.out.println("Nama Binatang : " + nama);
    }
    void meong(){
        System.out.println("Kucing ini juga mengeong");
    }
}

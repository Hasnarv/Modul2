package com.hasnarizkiv.modul2.Latihan.Soal2;

public class Burung extends Binatang{
    String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    void getNama(){ System.out.println("Nama Binatang : " + nama); }
    void terbang(){ System.out.println("Burung ini juga bisa terbang"); }
}

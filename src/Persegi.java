/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raka
 */
public class Persegi {
    //akses modifer tipe_data namaVariable
    private double sisi;
    // membentuk objek, hanya melalui construktor
    // konstruktor ada 2 jenis
    //1. konstruktor kosogn, tidak ada argument yang diberikan

    public Persegi() {
    }
    // 2. kosntruktor isi

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    // akses_modifier returnValue namaMethod ParameterList
    public double hitungLuas(){
        double luas;
        // this digunakan untuk mengambil atau mengakses varible sisi dari objek tersebut
        luas = this.sisi * this.sisi;
        return luas;
    }     
    public double hitungLuas(double sisi){
        return sisi*sisi;
    }
    public double hitungKeliling(){
        return 4*this.sisi;
    }
    
    @Override
    public String toString() {
        return "Persegi{" + "sisi=" + sisi + ", dengan luas = " + hitungLuas() + '}';
    }
  }


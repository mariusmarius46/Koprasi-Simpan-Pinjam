/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author raka
 */
public class CLassBalok {
    private double panjang;
    private double lebar;
    private double tinggi;
    
    // constructor

    public CLassBalok() {
    }

    public CLassBalok(double panjang) {
        this.panjang = panjang;
    }

    public CLassBalok(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public CLassBalok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    // overloading method hitungVolume
    public double Volume(){
        return this.panjang * this.lebar * this.tinggi;   
    }
    public double Volume(double panjang){
        return panjang * this.lebar * this.tinggi;   
    }
    public double Volume(int panjang){
        return panjang * this.lebar * this.tinggi;   
    }
    public double Volume(int panjang, double lebar){
        return panjang * lebar * this.tinggi;   
    }
    public double Volume(int panjang, int lebar){
        return panjang * lebar * this.tinggi;   
    }

    @Override
    public String toString() {
        return "CLassBalok{" + "panjang=" + panjang + ", lebar=" + lebar + ", tinggi=" + tinggi + '}';
    }
    
    }

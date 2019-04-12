/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3.Bangun;

/**
 *
 * @author raka
 */
public class Kubus extends Bangun {
    private int sisi;

    public Kubus() {
    }

    public Kubus(int sisi, String nama) {
        super(nama);
        this.sisi = sisi;
    }

    public Kubus(int sisi) {
        super("Kubus");
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    public int hitungVolume(){
        return this.sisi*this.sisi*this.sisi;
    }
    public int luasPermukaan(){
        return (this.sisi*this.sisi)*6;
    }
    @Override
    public String toString() {
        return super.toString() + "Kubus{" + "sisi=" + sisi + " Volume = " + 
                this.hitungVolume() + " luas permukaan = " + this.luasPermukaan() + '}';
    }
    
}

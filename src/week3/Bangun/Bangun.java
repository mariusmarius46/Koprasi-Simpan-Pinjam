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
public class Bangun {
    private String nama;

    public Bangun(String nama) {
        this.nama = nama;
    }

    public Bangun() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Bangun{" + "nama=" + nama + '}';
    }
    
     
}

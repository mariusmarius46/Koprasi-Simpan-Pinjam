/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.komposisi;

/**
 *
 * @author raka
 */
public class Roda {
    private String tipe;
    private int dimensi;
    private String velk;

    public Roda() {
    }

    public Roda(String tipe, int dimensi, String velk) {
        this.tipe = tipe;
        this.dimensi = dimensi;
        this.velk = velk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getDimensi() {
        return dimensi;
    }

    public void setDimensi(int dimensi) {
        this.dimensi = dimensi;
    }

    public String getVelk() {
        return velk;
    }

    public void setVelk(String velk) {
        this.velk = velk;
    }

    @Override
    public String toString() {
        return "Roda{" + "tipe=" + tipe + ", dimensi=" + dimensi + ", velk=" + velk + '}';
    }
    
    
}

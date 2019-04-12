/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import javax.swing.JOptionPane;

/**
 *
 * @author raka
 */
public class MainArrayBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size;
        size = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah balok"));
        CLassBalok[] arrBlk = new CLassBalok[size];
        for(int i=0; i<size; i++){
            arrBlk[i] = setElemenBalok();
        }
        for(CLassBalok blk: arrBlk){
            System.out.println(blk.toString());
            System.out.println("Dengan volume = " + blk.Volume());
        }
    }
    private static CLassBalok setElemenBalok(){
        CLassBalok blk = new CLassBalok();
        double panjang, lebar, tinggi;
        panjang = Double.parseDouble(JOptionPane.showInputDialog("Maskkan panjang balok"));
        lebar = Double.parseDouble(JOptionPane.showInputDialog("Maskkan lebar balok"));
        tinggi = Double.parseDouble(JOptionPane.showInputDialog("Maskkan tinggi balok"));
        blk.setPanjang(panjang);
        blk.setLebar(lebar);
        blk.setTinggi(tinggi);
        return blk;
    }
}

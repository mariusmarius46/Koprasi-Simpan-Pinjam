/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raka
 */
public class MainPersegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //nama objeknya adalah psg
        Persegi psg = new Persegi();
        System.out.println("Luas persegi =" + psg.hitungLuas());
        Persegi psg2 = new Persegi(8);
        System.out.println("Luas persegi 2 =" + psg2.hitungLuas());
        System.out.println(psg.toString());
        System.out.println("Luas persegi = " + psg.hitungLuas(9));
        System.out.println(psg.toString());
        //MENGUBAH nilai atribut sisi dari objek psg
        psg.setSisi(11);
        System.out.println(psg.toString());
        System.out.println("sisi persegi psg = " + psg.getSisi());
        System.out.println("Keliling persegi psg = " +psg.hitungKeliling()); //44
        psg2.setSisi(7);
        System.out.println("Luas psg 2 = " + psg2.hitungLuas()); //49
        System.out.println("Keliling psg 2 = " + psg2.hitungKeliling()); //28
    }
}

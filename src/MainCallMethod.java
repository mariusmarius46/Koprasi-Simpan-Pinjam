/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author raka
 */
public class MainCallMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 2 jenis method di java
        // 1 method static/class
        callStaticMethod();
        // 2 method instant
        MainCallMethod omm = new MainCallMethod();
        omm.callInstantMethod();
    }
        //method class/ static dicirikan dengan penggunaan keyword static
    private static void callStaticMethod(){
        double sisi;
        sisi = Double.parseDouble(JOptionPane.showInputDialog("masukan sisi persegi"));
        Persegi psg = new Persegi(sisi);
        System.out.println("Luas =" + psg.hitungLuas());
        System.out.println("Kelilig = " + psg.hitungKeliling());
        }
    private void callInstantMethod(){
        double sisi;
        sisi = Double.parseDouble(JOptionPane.showInputDialog("masukan sisi persegi"));
        Persegi psg = new Persegi(sisi);
        System.out.println("Luas =" + psg.hitungLuas());
        System.out.println("Kelilig = " + psg.hitungKeliling());
    }    
       
    }

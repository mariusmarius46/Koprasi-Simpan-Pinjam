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
public class MainBalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CLassBalok blk1 = new CLassBalok();
        CLassBalok blk2 = new CLassBalok(7.8);
        CLassBalok blk3 = new CLassBalok(7.8, 6.5);
        CLassBalok blk4 = new CLassBalok(7.8, 6.5, 7);
        CLassBalok blk5 = new CLassBalok(7, 6, 4);
        System.out.println(blk1.toString());
        System.out.println(blk2.toString());
        System.out.println(blk3.toString());
        System.out.println(blk4.toString());
        System.out.println(blk5.toString());
        
        System.out.println("Volume blk1 = " + blk1.Volume());
        System.out.println("Volume blk2 = " + blk2.Volume());
        System.out.println("Volume blk3 = " + blk3.Volume());
        System.out.println("Volume blk4 = " + blk4.Volume());
        System.out.println("Volume blk5 = " + blk5.Volume());
        
        System.out.println("Volume blk5 = " + blk5.Volume(8.5));
        System.out.println("Volume blk5 = " + blk5.Volume(8));
        System.out.println("Volume blk5 = " + blk5.Volume(8, 7.5));
    }
    
}

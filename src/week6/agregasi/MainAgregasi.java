/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.agregasi;

/**
 *
 * @author raka
 */
public class MainAgregasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa("15200101", "Wahyu", "Bandung no. 1", 16);
        Mahasiswa mhs2 = new Mahasiswa("15200102", "Cahya", "Bandung no. 1", 16);
        Mahasiswa mhs3 = new Mahasiswa("15200103", "Rudi", "Bandung no. 1", 17);
        Mahasiswa mhs4 = new Mahasiswa("15200104", "Budiman", "Bandung no. 1", 16);
        Mahasiswa mhs5 = new Mahasiswa("15200105", "Welly", "Bandung no. 1", 16);
        Mahasiswa mhs6 = new Mahasiswa("15200106", "Redeam", "Bandung no. 1", 17);
        
        Mahasiswa[] mhsBimb1 = {mhs1, mhs3, mhs6};
        Mahasiswa[] mhsBimb2 = {mhs2, mhs4, mhs5};
        Dosen dsn1 = new Dosen ("1519", "Budi", "Programming");
        dsn1.setLstBimbingan(mhsBimb1);
        Dosen dsn2 = new Dosen ("1520", "Martin Lutter", "Analisis dan Design");
        dsn2.setLstBimbingan(mhsBimb2);
        Dosen[] lstDsn = {dsn1, dsn2};
        for(Dosen dsn : lstDsn){
            System.out.println(dsn);
            System.out.println("Mahasiswa bimbingan: ");
            Mahasiswa[] myMhs = dsn.getLstBimbingan();
            for(Mahasiswa mhs : myMhs)
                System.out.println(mhs);
        }
    }
    
}

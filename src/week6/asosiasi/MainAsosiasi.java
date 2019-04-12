/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6.asosiasi;

/**
 *
 * @author raka
 */
public class MainAsosiasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MataKuliah mtk1 = new MataKuliah("IFA-101", " Pengantar Teknik Informatika", 2, "A");
        MataKuliah mtk2 = new MataKuliah("IFA-102", " Matematika", 3, "A");
        MataKuliah mtk3 = new MataKuliah("IFA-103", " Algoritma Pemrograman", 3, "B");
        MataKuliah mtk4 = new MataKuliah("IFA-201", " Basis Data", 4, "C");
        MataKuliah mtk5 = new MataKuliah("IFA-202", " Pengantar Multimedia", 2, "C");
        MataKuliah mtk6 = new MataKuliah("IFA-203", " Struktur Data", 3, "A");
        
        String[] lstMkMhs1 = {"IFA-101", "IFA-103", "IFA-202"};
        String[] lstMkMhs2 = {"IFA-101", "IFA-203", "IFA-202"};
        String[] lstMkMhs3 = {"IFA-102", "IFA-103", "IFA-201", "IFA-203"};
        
        Mahasiswa mhs1 = new Mahasiswa("15201801", "Abdullah", 16);
        mhs1.setListKodeMk(lstMkMhs1);
        Mahasiswa mhs2 = new Mahasiswa("15201701", "Budiman", 17);
        mhs1.setListKodeMk(lstMkMhs2);
        Mahasiswa mhs3 = new Mahasiswa("15201502", "Clarah", 18);
        mhs1.setListKodeMk(lstMkMhs3);
        Mahasiswa mhs4 = new Mahasiswa("1520010", "Donny", 15);
        Mahasiswa[] lstMhs = {mhs1, mhs2, mhs3, mhs4};
        MataKuliah[] lstMtk = {mtk1, mtk2, mtk3, mtk4, mtk5, mtk6};
        //System.out.println(mhs4.getListKodeMk());
        
        for (Mahasiswa mhs : lstMhs){
            System.out.println(mhs);
            String[] myKodeMk = mhs.getListKodeMk();
            //System.out.println("Panjang : " + myKodeMk.length);
            System.out.println("Mata kuliah yang diambil mahasiswa : ");
            if(myKodeMk.length>0){
            for (String kodeMk : myKodeMk){
                for(MataKuliah mtk : lstMtk){
                    if(kodeMk.equalsIgnoreCase(mtk.getKodeMk())){
                        System.out.println(mtk);
                    }
                    }
                }
            }
        }
    }
    
}

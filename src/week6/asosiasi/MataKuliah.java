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
public class MataKuliah {
    private String kodeMk;
    private String namaMk;
    private int sks;
    private String grade;

    public MataKuliah() {
    }

    public MataKuliah(String kodeMk, String namaMk, int sks, String grade) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
        this.grade = grade;
    }

    public String getKodeMk() {
        return kodeMk;
    }

    public void setKodeMk(String kodeMk) {
        this.kodeMk = kodeMk;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public void setNamaMk(String namaMk) {
        this.namaMk = namaMk;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kodeMk=" + kodeMk + ", namaMk=" + namaMk + ", sks=" + sks + ", grade=" + grade + '}';
    }
    
    
}

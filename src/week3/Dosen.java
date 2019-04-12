/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author raka
 */
public class Dosen extends Profile {
    private String nrp;
    private String keahilian;

    public Dosen() {
    }

    public Dosen(String nrp, String keahilian, String nama, String alamat, int umur, String email) {
        super(nama, alamat, umur, email);
        this.nrp = nrp;
        this.keahilian = keahilian;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getKeahilian() {
        return keahilian;
    }

    public void setKeahilian(String keahilian) {
        this.keahilian = keahilian;
    }

    @Override
    public String toString() {
        return "Dosen{" + super.toString() +  "nrp=" + nrp + ", keahilian=" + keahilian + '}';
    }
    
    
}

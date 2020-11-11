/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author Asus
 */
public class MataKuliah implements java.io.Serializable {
    
    private static final long serialVersionUID = 5559055602375093688L;
    
    private String kodeMK;
    private transient String nama;
    private static byte sks;

    public MataKuliah(String kodeMK, String nama, byte sks) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static byte getSks() {
        return sks;
    }

    public static void setSks(byte sks) {
        MataKuliah.sks = sks;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kodeMK= " + kodeMK + ", nama= " + nama + ", sks= " + sks + '}';
    }
    
    
    

    
    
    
}

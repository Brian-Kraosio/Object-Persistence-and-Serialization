/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Asus
 */
public class Mahasiswa implements java.io.Serializable {

    private String name, nim,jurusan,programStudi;
    private double ipk;

    public Mahasiswa(String name, String nim, String jurusan, String programStudi, double ipk) {
        this.name = name;
        this.nim = nim;
        this.jurusan = jurusan;
        this.programStudi = programStudi;
        this.ipk = ipk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "name= " + name + ", nim= " + nim + ", jurusan= " + jurusan + ", programStudi= " + programStudi + ", ipk= " + ipk + '}';
    }
    
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author HP
 */
public class Karyawan {

    private String Nama;

    /**
     * @return the Nama
     */
    protected String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    protected void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public Karyawan(String Nama) {
        this.Nama = Nama;
    }

    public void info() {
        System.out.println("Karyawan ini bernama " + getNama());
    }
}

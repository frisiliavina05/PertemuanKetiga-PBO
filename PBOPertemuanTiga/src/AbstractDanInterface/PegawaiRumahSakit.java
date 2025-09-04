/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDanInterface;

/**
 *
 * @author HP
 */
abstract class PegawaiRumahSakit {

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

    public PegawaiRumahSakit(String Nama) {
        this.Nama = Nama;
    }

    public abstract void hadir();

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDanInterface;

/**
 *
 * @author HP
 */
abstract class Dokter extends TenagaMedis {

    private String Spesialis;

    /**
     * @return the Spesialis
     */
    protected String getSpesialis() {
        return Spesialis;
    }

    /**
     * @param Spesialis the Spesialis to set
     */
    protected void setSpesialis(String Spesialis) {
        this.Spesialis = Spesialis;
    }

    public Dokter(String Nama, String Bidang, String Spesialis) {
        super(Nama, Bidang);
        this.Spesialis = Spesialis;
    }

    public abstract void PeriksaPasien();
}

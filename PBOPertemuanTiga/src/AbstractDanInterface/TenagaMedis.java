/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDanInterface;

/**
 *
 * @author HP
 */
abstract class TenagaMedis extends PegawaiRumahSakit {

    private String Bidang;

    /**
     * @return the Bidang
     */
    protected String getBidang() {
        return Bidang;
    }

    /**
     * @param Bidang the Bidang to set
     */
    protected void setBidang(String Bidang) {
        this.Bidang = Bidang;
    }

    public TenagaMedis(String Nama, String Bidang) {
        super(Nama);
        this.Bidang = Bidang;
    }

    public abstract void bekerja();
}

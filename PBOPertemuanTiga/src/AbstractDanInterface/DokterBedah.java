/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractDanInterface;

/**
 *
 * @author HP
 */
public class DokterBedah extends Dokter implements BeriResep, BisaEdukasi, BisaOperasi {

    public DokterBedah(String Nama, String Bidang, String Spesialis) {
        super(Nama, Bidang, Spesialis);
    }

    // Dari Abstract Class PegawaiRumahSakit
    public void hadir() {
        System.out.println(getNama() + " hadir di rumah sakit tepat waktu");
    }

    // Dari Abstract Class TenagaMedis
    public void bekerja() {
        System.out.println(getNama() + " bekerja di rumah sakit pada bidang " + getBidang());
    }

    // Dari Abstract Class Dokter
    public void PeriksaPasien() {
        System.out.println(getNama() + " memeriksa pasien sebagai dokter " + getSpesialis());
    }

    // Dari Interface BeriResep
    public void MenulisResep() {
        System.out.println(getNama() + " menulis resep obat untuk pasian");
    }

    // Dari Interface BisaEdukasi
    public void MemberiEdukasi() {
        System.out.println(getNama() + " memberikan edukasi kesehatan kepada masyarakat");
    }

    // Dari Interface BisaOperasi
    public void MelakukanOperasi() {
        System.out.println(getNama() + " melakukan operasi besar di rumah sakit");
    }

    public static void main(String[] args) {
        DokterBedah dokter = new DokterBedah("Dr. Ayman", "Medis", "Bedah Umum");

        System.out.println("Nama : " + dokter.getNama());
        System.out.println("Bidang : " + dokter.getBidang());
        System.out.println("Spesialis : " + dokter.getSpesialis());
        
        System.out.println("\nAktivitas Dr. Ayman sebagai Dokter : ");
        // Abstract class methods
        dokter.hadir();
        dokter.bekerja();
        dokter.PeriksaPasien();

        // Interface methods
        dokter.MelakukanOperasi();
        dokter.MenulisResep();
        dokter.MemberiEdukasi();

    }

}

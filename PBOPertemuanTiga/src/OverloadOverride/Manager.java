/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author HP
 */
public class Manager extends Karyawan {

    private double bonus;

    public Manager(String Nama, double bonus) {
        super(Nama);
        this.bonus = bonus;
    }

    @Override
    public void info() {
        System.out.println("Manager ini bernama " + getNama() + " dengan bonus " + "Rp " + bonus);
    }

    public static void main(String[] args) {
        Gaji g = new Gaji();
        System.out.println("Hasil dari Overloading : ");
        System.out.println("Gaji pokok + tunjangan: " + "Rp " + g.gaji(5000000, 1000000));
        System.out.println("Gaji pokok + tunjangan + bonus: " + "Rp " + g.gaji(5000000, 1000000, 2000000));

        // Overriding
        System.out.println("\nHasil dari Overriding : ");
        Karyawan k = new Karyawan("Ikhsan");
        Manager m = new Manager("Fadi", 2000000);

        k.info();
        m.info();
        System.out.println("Total gaji Karyawan: " + "Rp " + g.gaji(5000000, 1000000));
        System.out.println("Total gaji Manager: " + "Rp " + g.gaji(8000000, 1000000));
    }
}

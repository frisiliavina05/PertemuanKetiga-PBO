/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OverloadOverride;

/**
 *
 * @author HP
 */
public class Gaji {

    // Overload 1: gaji pokok + tunjangan
    public double gaji(double gajiPokok, double tunjangan) {
        return gajiPokok + tunjangan;
    }

    // Overload 2: gaji pokok + tunjangan + bonus
    public double gaji(double gajiPokok, double tunjangan, double bonus) {
        return gajiPokok + tunjangan + bonus;
    }
}

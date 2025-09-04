# Penerapan Konsep Interface, Abstract Class, Overload, dan Override

Pada tugas ini mengimplementasikan konsep Pemrograman Berorientasi Objek (PBO) dalam Java yang mencakup :
•	3 abstract class
•	3 interface
•	Subclass yang mengimplementasikan abstract class dan interface
•	Contoh penerapan overloading dan overriding dalam 3 class

# Petunjuk praktikum
1.	Buatlah sebuah project baru pada IDE Java seperti NetBeans. 
2.	Rancang sebuah abstract class beserta subclass-nya, sehingga objek dapat diciptakan dari kelas turunan. 
3.	Buat contoh penerapan overloading dalam satu kelas dengan nama method yang sama tetapi parameter berbeda. 
4.	Lakukan overriding pada subclass untuk menuliskan ulang method dari superclass dengan implementasi yang baru. 
5.	Buat juga sebuah interface yang diimplementasikan oleh salah satu class untuk menunjukkan perbedaan dengan abstract class. 
6.	Tambahkan komentar pada setiap bagian kode agar mudah dipahami saat dijelaskan dalam laporan. 
7.	Jalankan program untuk memastikan bahwa keempat konsep (abstract class, interface, overloading, overriding) dapat berjalan dengan benar.


# Abstract Class
Abstract class dalah kelas dalam OOP yang tidak bisa dibuat objek secara langsung, hanya bisa diturunkan (inheritance). Abstract class bisa memiliki atribut, method biasa, dan method abstract (tanpa implementasi). Fungsinya memberikan struktur umum untuk kelas turunan, tanpa harus menentukan detail implementasinya.
Abstract class:
•	Dapat memiliki variabel/field (misal: int umur, String jenis).

•	Dapat memiliki constructor untuk inisialisasi nilai awan.
•	Dapat berisi method abstract ataupun method biasa.

Contoh Coding:
abstract class PegawaiRumahSakit {

    private String Nama;
    
    protected String getNama() {
        return Nama;
    }

    protected void setNama(String Nama) {
        this.Nama = Nama;
    }

    public PegawaiRumahSakit(String Nama) {
        this.Nama = Nama;
    }

    public abstract void hadir();

}

# Interface
Interface adalah sebuah kontrak dalam Java yang berisi kumpulan method (tanpa isi) dan konstanta, yang harus diimplementasikan oleh class. Class yang mengimplementasikan interface wajib menyediakan implementasi untuk semua method yang ada di interface tersebut.
Interface:
•	Tidak bisa punya constructor (berbeda dengan abstract class)
•	Semua method di dalam interface bersifat abstrak (tanpa isi, kecuali default atau static).
•	Atribut/Field dalam interface otomatis bersifat public static final.

Contoh Coding:
interface BisaOperasi {

    void MelakukanOperasi();
}

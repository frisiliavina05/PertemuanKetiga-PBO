# Penerapan Konsep Interface, Abstract Class, Overload, dan Override

Pada tugas ini mengimplementasikan konsep Pemrograman Berorientasi Objek (PBO) dalam Java yang mencakup :
- 3 abstract class
- 3 interface
- Subclass yang mengimplementasikan abstract class dan interface
- Contoh penerapan overloading dan overriding dalam 3 class

# Petunjuk praktikum
1.	Buatlah sebuah project baru pada IDE Java seperti NetBeans. 
2.	Rancang sebuah abstract class beserta subclass-nya, sehingga objek dapat diciptakan dari kelas turunan. 
3.	Buat contoh penerapan overloading dalam satu kelas dengan nama method yang sama tetapi parameter berbeda. 
4.	Lakukan overriding pada subclass untuk menuliskan ulang method dari superclass dengan implementasi yang baru. 
5.	Buat juga sebuah interface yang diimplementasikan oleh salah satu class untuk menunjukkan perbedaan dengan abstract class. 
6.	Tambahkan komentar pada setiap bagian kode agar mudah dipahami saat dijelaskan dalam laporan. 
7.	Jalankan program untuk memastikan bahwa keempat konsep (abstract class, interface, overloading, overriding) dapat berjalan dengan benar.


# Abstract Class
Abstract class dalah sebuah kontrak (blueprint) dalam OOP yang berisi kumpulan deklarasi method (tanpa implementasi) yang harus diimplementasikan oleh class yang menggunakannya. Interface biasanya digunakan untuk mencapai multiple inheritance. Fungsinya memberikan struktur umum untuk kelas turunan, tanpa harus menentukan detail implementasinya.

Abstract class:
- Dapat memiliki variabel/field (misal: int umur, String nama).
- Dapat memiliki constructor untuk inisialisasi nilai awan.
- Dapat berisi method abstract ataupun method biasa.

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
- Tidak bisa punya constructor (berbeda dengan abstract class)
- Semua method di dalam interface bersifat abstrak (tanpa isi, kecuali default atau static).
- Atribut/Field dalam interface otomatis bersifat public static final.

Contoh Coding:

    interface BisaOperasi {

    void MelakukanOperasi();
    }

# Overloading
Overloading adalah kemampuan sebuah kelas untuk memiliki beberapa method dengan nama yang sama, namun parameter berbeda (jumlah, tipe, atau urutan). Dengan overloading, satu method bisa digunakan untuk berbagai situasi, membuat kode lebih fleksibel dan mudah dipahami.

Overloading:
- Ditentukan oleh parameter (jumlah/tipe/urutan)
- Bisa static, final, atau private
- Compile-time polymorphism

Contoh Coding:

    public double gaji(double gajiPokok, double tunjangan) {
        return gajiPokok + tunjangan;
    }

    public double gaji(double gajiPokok, double tunjangan, double bonus) {
        return gajiPokok + tunjangan + bonus;
    }

# Overriding
Overriding adalah kemampuan subclass untuk mengubah atau menulis ulang method yang sudah ada di superclass dengan implementasi baru. Hal ini memungkinkan subclass memberikan perilaku khusus, mendukung polymorphism dalam OOP.

Overriding:
- Ditentukan oleh inheritance (harus ada hubungan parent-child)
- Tidak bisa static, final, atau private
- Runtime polymorphism

Contoh Coding:

Pada class Karyawan

    public void info() {
        System.out.println("Karyawan ini bernama " + getNama());
    }

Pada class Manager

    public void info() {
        System.out.println("Manager ini bernama " + getNama() + " dengan bonus " + "Rp " + bonus);
    }

public class Karyawan {
    String nama;
    String alamat;
    String jabatan;
    double gaji;

    void tampilkanNama(){
        System.out.println("Nama Karyawan: " + nama);
    }
    void tampilkanJabatan(){
        System.out.println("Jabatan Karyawan: " + jabatan);
    }
    void tampilkanAlamat(){
        System.out.println("Alamat Karyawan: " + alamat);
    }
    void tampilkanGaji(){
        System.out.println("Gaji Karyawan sebesar Rp." + gaji);
    }
}

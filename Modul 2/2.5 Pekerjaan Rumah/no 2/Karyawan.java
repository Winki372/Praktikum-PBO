public class Karyawan {
    String nama;
    String alamat;
    String jabatan;
    double gaji;

    void tampilkanNama(){
        System.out.println("Nama Karyawan: " + nama);
    }
    void tampilkanAlamat(){
        System.out.println("Alamat Karyawan: " + alamat);
    }
    void tampilkanJabatan(){
        System.out.println("Jabatan Karyawan: " + jabatan);
    }
    void tampilkanGaji(){
        System.out.println("Gaji Karyawan sebesar Rp." + gaji);
    }
}

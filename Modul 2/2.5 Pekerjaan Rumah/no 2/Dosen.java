import java.util.Date;
        
public class Dosen {
    String nama;
    int nik;
    String pendidikan;
    Date tglLahir = new Date();

    void tampilkanNama(){
        System.out.println("Nama Dosen adalah: " + nama);
    }
    void tampilkantglLahir(){
        System.out.println("Tanggal Lahir Dosen adalah: " + tglLahir);
    }
    void tampilkanNik(){
        System.out.println("NIK dosen adalah: " + nik);
    }
}

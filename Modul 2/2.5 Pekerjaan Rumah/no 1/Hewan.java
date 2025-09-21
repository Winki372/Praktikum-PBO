/* @author muhs*/

package Hewan;

public class Hewan {
    String nama;
    int jumlahKaki;
    String makanan;
    String tipeHewan;
    
    void binatang(String namaHewan, int kaki, String makananHewan, String tipeHewan) {
        this.nama = namaHewan;
        this.jumlahKaki = kaki;
        this.makanan = makananHewan;
        this.tipeHewan = tipeHewan; 
    }
    
    void heHewan() {
        System.out.println("Nama Hewan: " + nama + "\n" + 
                "Jumlah kaki: "+ jumlahKaki + "\n" +
                "Makanan hewan: "+ makanan + "\n" +
                "Tipe hewan: " + tipeHewan + "\n");
    }
}

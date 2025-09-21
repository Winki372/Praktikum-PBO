public class Rekening {
    double saldo;
    String noRekening;
    String nama;
    
    //template/konstrukttor
    public Rekening(String noRekeningg, String namaa, double saldoo) {
        noRekening = noRekeningg;
        nama = namaa;
        saldo = saldoo;
    }
    
    //method cek saldo
    void cekSaldo(){
        System.out.println("Rekening atas nama: " + nama + "\n"+
                "Dengan nomor rekening "+ noRekening + "\n"+
                "Saldo anda saat ini: " + saldo + "\n");
    }
    
   //method nabung
    void menabung(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println(nama + " berhasil menabung sejumlah: " + jumlah + "\n");
        } 
        else {
            System.out.println("Error: gagal menabung, jumlah menabung harus lebih dari 0");
        }
    }
    
    //method narik
    void menarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println(nama + " berhasil menarik sejumlah: " + jumlah + "\n" );
        }
        else {
          System.out.println("Error: Jumlah penarikan tidak diperbolehkan atau saldo anda tidak cukup");  
        }
    }
    
    //method transfer
    void transfer(Rekening tujuan, double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println(nama + " berhasil mentransfer sejumlah: " + jumlah + " ke rekening " + tujuan.noRekening + "\n");
        }
        else {
          System.out.println("Error: Jumlah transfer tidak diperbolehkan atau saldo anda tidak cukup");  
        }   
    }
}

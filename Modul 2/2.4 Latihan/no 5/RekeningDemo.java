public class RekeningDemo {
 public static void main(String[] args) {
        Rekening akun1 = new Rekening("1234321", "Winki", 700000);
        Rekening akun2 = new Rekening("0987890", "Thoriq", 55500);
        
        akun1.cekSaldo();
        akun2.cekSaldo();
        
        akun2.menabung(1017);
        akun2.cekSaldo();
        
        akun1.menarik(20000);
        akun1.cekSaldo();
        
        akun1.transfer(akun2, 2223);
  
        akun1.cekSaldo();
        akun2.cekSaldo();
    }
}

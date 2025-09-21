public class KucingDemo {
    public static void main(String[] args) {
        Kucing Anggora = new Kucing(1, "hitam.");
        Kucing Persia = new Kucing(3, "putih.");
        Kucing Minecoon = new Kucing(4, "abu-abu.");
        Kucing Garfield = new Kucing(2, "oranye.");
        
        Anggora.meong();
        Anggora.umur();
        
        Persia.meong();
        Persia.umur();
        
        Minecoon.meong();
        Minecoon.umur();
        
        Garfield.meong();
        Garfield.umur();
    }    
}

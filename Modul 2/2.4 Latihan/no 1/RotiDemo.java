
public class RotiDemo {
    public static void main(String[] args) {
        Roti roti = new Roti();
        roti.beriWarna("Ungu");
        roti.beriRasa("Strawberry");
        roti.timbangBerat(700);
        roti.hargaJual(99999);
        roti.infoRoti();
        System.out.println("\n");
        
        Roti rotiO = new Roti();
        rotiO.beriWarna("Cokelat");
        rotiO.beriRasa("Margarin");
        rotiO.timbangBerat(1000);
        rotiO.hargaJual(10000);
        rotiO.infoRoti();
        System.out.println("\n");
        
        Roti rotiBoy = new Roti();
        rotiBoy.beriWarna("Putih");
        rotiBoy.beriRasa("Vanilla");
        rotiBoy.timbangBerat(10000);
        rotiBoy.hargaJual(7777);
        rotiBoy.infoRoti();
        System.out.println("\n");

        Roti rotiLempuyangan = new Roti();
        rotiLempuyangan.beriWarna("Hitam");
        rotiLempuyangan.beriRasa("Moka");
        rotiLempuyangan.timbangBerat(90000);
        rotiLempuyangan.hargaJual(6539);
        rotiLempuyangan.infoRoti();
        System.out.println("\n");                        
    }
}

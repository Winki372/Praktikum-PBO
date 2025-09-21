public class Kucing { 
    int umur; 
    String warnaBulu; 

    public Kucing(int umurKucing, String warnaBuluKucing){ 
    umur = umurKucing; 
    warnaBulu = warnaBuluKucing; 
} 
 
void meong() { 
    System.out.println("Miiaawwwwwww"); 
} 
 
void umur() { 
    System.out.println("Umur kucing ini adalah " + umur + " tahun" + "\n"+
            "Kucing ini memiliki warna bulu "+ warnaBulu + "\n" ); 
    } 

}

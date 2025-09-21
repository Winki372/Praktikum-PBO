/* @author muhs*/

package Hewan;

public class HewanDemo {
    public static void main(String[] args) {
    Hewan harimau = new Hewan();
    harimau.binatang("Harimau", 4, "Daging", "Karnivora");

    Hewan kerbau = new Hewan();
    kerbau.binatang("Kerbau", 4, "Rumput", "Herbivora");    
    
    harimau.heHewan();
    kerbau.heHewan();
    }
    
}

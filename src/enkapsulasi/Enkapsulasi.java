/*
 * Object Oriented Programming (OOP) STT Poliprofesi Medan.
 * OOP dengan Java
 */
package enkapsulasi;

/**
 *
 * @author LENOVO
 */
public class Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persegi persegiku = new Persegi();
        
        //persegiku.panjang=5;
        persegiku.setPanjang(5);
        persegiku.setLebar(6);
        
        System.out.println("Panjang = "+persegiku.getPanjang());
        System.out.println("Lebar = "+persegiku.getLebar());
        System.out.println("Luas Segitiga = "+persegiku.getLuas());
    }
    
}

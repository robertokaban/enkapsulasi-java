/*
 * Object Oriented Programming (OOP) STT Poliprofesi Medan.
 * OOP dengan Java
 */
package enkapsulasi;

/**
 *
 * @author LENOVO
 */
public class Segitiga {
    public float alas;
    private int tinggi;


public float getAlas() {
    return alas;
}
 
protected void setAlas(float alas) {
this.alas = alas;
}
 
public int getTinggi() {
return tinggi;
}
 
protected void setTinggi(int tinggi) {
this.tinggi = tinggi;
}
 
/*-- constructor --*/
public Segitiga(){
int a = 0;
int t = 0;
}
 
public float luas(int a, int t){
return (float)(a * t)/2;
}
 
public float getLuas(){
return luas(alas, tinggi);
}  

}

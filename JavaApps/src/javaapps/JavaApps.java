package javaapps;
/*@author Kornelius Satria B POLIMORPHISM*/
class binatang{
    void suara(){
        System.out.println(" Suara binatang");
    }
}
// subclass serrigala auww , ayam kukuruyuk dan perkutut kukgeruk
class serigala extends binatang{
    void suara(){
        System.out.println(" Aauuuuw");
    }
}
class ayam extends binatang{
    void suara(){
        System.out.println(" Kukuruyuk");
    }
}
class perkutut extends binatang{
    void suara(){
        System.out.println(" Kukgeruk kok");
    }
}
public class JavaApps {
    /*** @param args the command line arguments*/
    public static void main(String[] args) {
        binatang h = new binatang(); //buat objek
        h.suara();
        
        binatang s = new serigala();
        s.suara();
        
        binatang a = new ayam();
        a.suara();
        
        binatang p = new perkutut();
        p.suara();
    }
}

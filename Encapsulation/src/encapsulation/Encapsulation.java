package encapsulation;
/** @author Kornelius Satria B*/
public class Encapsulation {

    public static void main(String[] args) {
        binatang e = new binatang();
        e.setTinggi(100);
        System.out.println("Tinggi jerapah adalah "+e.getTinggi()+" meter");
    }
}

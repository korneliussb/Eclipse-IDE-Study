package inheritance;
/*** @author Kornelius Satria B*/

class binatang{
    int umur;
    String nama;
    
    int get_umur(){
        return umur;
    }
}

public class Inheritance extends binatang{

    public static void main(String[] args) {
        Inheritance k = new Inheritance();
        k.set_umur();
        System.out.println("Umur kuda itu = "+k.get_umur()+" tahun");
        
    }
    
    void set_umur(){
        umur = 20;
    }
}

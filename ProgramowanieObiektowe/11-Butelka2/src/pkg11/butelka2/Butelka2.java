package pkg11.butelka2;
public class Butelka2 {
    public static void main(String[] args) {
       Butelka[] butelka = new Butelka[3]; // NULL
       
       for(int i = 0; i < 3; i++) {
           butelka[i] = new Butelka(i);
       }
        System.out.println(butelka[0].getIleLitrow());
        butelka[0].wlej(5);
        System.out.println(butelka[0].getIleLitrow());
        butelka[0].przelej(6, butelka[1]);
        System.out.println(butelka[0].getIleLitrow()); 
    }
   
}

class Butelka {
    private double ileLitrow;
       
    Butelka(double ileLitrow) {
        this.ileLitrow = ileLitrow;
    }
    
    double getIleLitrow() {
        return ileLitrow;
    }
    
    void wlej(double ilosc) {
        this.ileLitrow += ilosc;
    }
    
    boolean wylej(double ilosc) {
        if(ilosc < ileLitrow)
            this.ileLitrow -= ilosc;
        else
            return false;
        
        return true;
    }
    
    void przelej(double ilosc, Butelka gdziePrzelac) {
       if(this.wylej(ilosc)) {
        gdziePrzelac.wlej(ilosc);
       }
       else
            System.out.println("Za mało");
    }
}
  
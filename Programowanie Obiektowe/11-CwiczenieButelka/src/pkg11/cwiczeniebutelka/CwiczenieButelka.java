package pkg11.cwiczeniebutelka;
public class CwiczenieButelka {    
    public static void main(String[] args) {

        Butelka[] butelka = new Butelka[4]; //null
        
        int i = 0;
        while(i < 4) {
            butelka[i] = new Butelka(i,i+1);
            i++;
        }
        System.out.print("Butelka ma litrów: ");
        System.out.println(butelka[1].getIleLitrow());
        System.out.print("Butelka ma pojemność: ");
        System.out.println(butelka[1].getPojemnosc());
        butelka[1].wlej(1);
        
        butelka[1].przelej(2, butelka[3]);
        System.out.println(butelka[1].getIleLitrow());
        System.out.println(butelka[3].getIleLitrow());
    }
    
}

class Butelka {
    private double ileLitrow;
    private double pojemnosc;
    
    double getIleLitrow() {
        return this.ileLitrow;
    }
    double getPojemnosc() {
        return this.pojemnosc;
    }
    
    Butelka(double ileLitrow, double pojemnosc) {
        this.ileLitrow = ileLitrow;
        this.pojemnosc = pojemnosc;
    }
    
    boolean wylej(double ile) {
        if(ile <= ileLitrow)
            this.ileLitrow -= ile;
        else
            return false;
        
        return true;
    }
    
    boolean wlej(double ile) {
        if(ileLitrow + ile <= pojemnosc)
            this.ileLitrow += ile;
        else 
            return false;
                    
        return true;
    }
    
    void przelej(double ile, Butelka gdzie) {
        
        if(this.wylej(ile)) {
            if(gdzie.pojemnosc - gdzie.ileLitrow < ile) {
                gdzie.ileLitrow = gdzie.pojemnosc;
                double reszta = gdzie.ileLitrow - ile;
                this.ileLitrow = reszta;
            }
            else
                gdzie.wlej(ile);
        }
        else
            System.out.println("Operacja przelewania nie udana!");
    }
}

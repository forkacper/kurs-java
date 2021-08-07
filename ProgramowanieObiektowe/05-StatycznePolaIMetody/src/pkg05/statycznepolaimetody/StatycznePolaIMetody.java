package pkg05.statycznepolaimetody;
public class StatycznePolaIMetody {
    public static void main(String[] args) {

//        Matematyka test = new Matematyka();
        
        double wynik = Matematyka.dodaj(10, 55.55);
        
        System.out.println(wynik);
        
        System.out.println(Matematyka.PI);
        
        
        Klient a = new Klient("Kacper");
        Klient b = new Klient("Marek");
        Klient c = new Klient("Wojtek");
        
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
        System.out.println(Klient.nastepneId);
    }
    
}

class Matematyka {
    
    static final double PI = 3.14;
    static double dodaj(double a, double b) {
        return a + b;
    }
}

class Klient {
    Klient(String imie) {
       this.imie = imie;       
       this.id = nastepneId;
       nastepneId++;
    }
    
    String imie;
    String nazwisko;
    
    int id = 1;
    static int nastepneId = 1;
    
}
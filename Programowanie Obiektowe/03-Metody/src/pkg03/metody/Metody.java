package pkg03.metody;
public class Metody {
    public static void main(String[] args) {
           
        Test a = new Test();

        a.wypisz("Arek", "Ogarek");
    
        Test a2 = new Test();
        
        a.wypisz("Kacper", "Formas");
        
        int wynik = a.dodaj(10, 255);
        
        double wynik2 = a.dodaj(10.55, 55.22);
        
        System.out.println(wynik);
        System.out.println(wynik2);
    } 
}

class Test {
    
    void wypisz(String imie, String nazwisko) {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("");
    }
    
    int dodaj(int a, int b) {
        return a + b;
    }
    double dodaj(double a, double b) {
        return a + b;
    }
       
}
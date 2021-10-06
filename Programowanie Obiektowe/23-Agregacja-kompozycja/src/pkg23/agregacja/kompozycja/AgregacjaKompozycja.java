package pkg23.agregacja.kompozycja;
public class AgregacjaKompozycja {
    public static void main(String[] args) {
        Pracownik p = new Pracownik("Arek", new Adres("Krótka", 92));
        
        System.out.println(p);
    }
    
}

class Pracownik {
    String imie;
    Adres adres;

    public Pracownik(String imie, Adres adres) {
        this.imie = imie;
        this.adres = adres;
    }

    @Override
    public String toString() {
        return this.imie + ": " + adres.ulica + " " + adres.numerDomu;
    }
    
    
    
}

class Adres {
    String ulica;
    int numerDomu;

    public Adres(String ulica, int numerDomu) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
    }
    
}
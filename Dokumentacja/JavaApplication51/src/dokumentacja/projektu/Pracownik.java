package dokumentacja.projektu;

/**
 * Obiekt <code>Pracownik</code> reprezentuje Pracownika, jest to nadklasa dla...
 * @author Kacper Formas
 */
public class Pracownik {
    
    /** 
     */
    
    public Pracownik() {}
    
    /**
     * Konstruktor tworzący obiekt <code>Pracownik</code> z imieniem i nazwiskiem
     * @param imie ustawia imie
     * @param nazwisko ustawia nazwisko
     */
    
    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    
    /**
     * Konstruktor tworzący obiekt <code>Pracownik</code> z imieniem nazwiskiem i wynagrodzeniem
     * @param imie ustawia imie
     * @param nazwisko ustawia nazwisko
     * @param wynagrodzenie ustawia wynagrodzenie
     */
    
    public Pracownik(String imie, String nazwisko, double wynagrodzenie) {
        this(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }
            
    /**
     * 
     * @param noweWynagrodzenie - Ustawia pracownikowi nowe wynagrodzenie
     */
    
    public void setWynagrodzenie(double noweWynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }
    
    /**
     * @since 1.0.0
     * @return zwraca pensje typu double w zł
     */
    
    public double getWynagrodzenie() {
        return this.wynagrodzenie;
    }
    
    
    /**
     Imię pracownika 
     */
    private String imie;
    /**
     Nazwisko pracownika 
     */    
    private String nazwisko;
    /**
     Wynagrodzenie pracownika 
     */
    private double wynagrodzenie;
}

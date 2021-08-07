package pkg12.dziedziczenie.potwory;

public abstract class Potwor {
    protected double predkoscChodzenia = 10;
    protected double zywotnosc; 
    
    public double getPredkoscChodzenia() {
        return this.predkoscChodzenia;
    }
    public double getZywotnosc() {
        return this.zywotnosc;
    }
    
    
    public void atakuj() {
        //logic to do
        
        System.out.println("To jest metoda atakuj z klasy potwór");
    }
    
    protected abstract void opisPotwora();
    
    public Potwor() {
        
    }
    public Potwor(double predkoscChodzenia, double zywotnosc) {
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
    }
    
}

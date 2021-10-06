package pkg12.dziedziczenie.potwory;

public class Szkielet extends Potwor {
    String typBroni;


    @Override
    public void atakuj() {
        super.atakuj();
           
        //Dodatkowe instrukcje atakujace 
    }
    
    
    public Szkielet() {
        System.out.println("Domyslny konstruktor klasy szkielet");
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc) {
        super(predkoscChodzenia, zywotnosc);
    }
    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni) {
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
    }

    @Override
    protected void opisPotwora() {
         System.out.println("Fajny Szkielet");
    }
}

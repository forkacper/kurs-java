package pkg12.dziedziczenie;

import pkg12.dziedziczenie.potwory.Potwor;
import pkg12.dziedziczenie.potwory.Szkielet;
import pkg12.dziedziczenie.potwory.Zombie;


public class Dziedziczenie {
    public static void main(String[] args) {
        Szkielet s = new Szkielet();
        Zombie z = new Zombie(10, 10, "MPA");
        
        System.out.println(z.getPredkoscChodzenia());
        System.out.println(z.getZywotnosc());
        System.out.println(z.zbroja);
    
        
        //Polimorfizm 
        Potwor p1 = new Szkielet(10 , 100);
        Potwor p2 = new Zombie(50, 150);
        
        System.out.println(p1.getPredkoscChodzenia());
        System.out.println(p2.getPredkoscChodzenia());
    }
    
}

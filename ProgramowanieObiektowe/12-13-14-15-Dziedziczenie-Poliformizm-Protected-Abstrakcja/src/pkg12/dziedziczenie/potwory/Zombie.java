/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.dziedziczenie.potwory;

/**
 *
 * @author kacper-test
 */
public class Zombie extends Potwor {
    public String zbroja;
    
    public Zombie() {
        
    }
    public Zombie(double predkoscChodzenia, double zywotnosc) {
        super(predkoscChodzenia, zywotnosc);
    }
    public Zombie(double predkoscChodzenia, double zywotnosc, String zbroja) {
        super(predkoscChodzenia, zywotnosc);
        this.zbroja = zbroja;
    }

    @Override
    protected void opisPotwora() {
        System.out.println("Fajny Zombi");
    }
}

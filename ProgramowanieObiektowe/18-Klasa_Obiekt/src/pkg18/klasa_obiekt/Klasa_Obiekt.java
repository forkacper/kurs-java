/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18.klasa_obiekt;

/**
 *
 * @author kacper-test
 */
public class Klasa_Obiekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object a = new Punkt(100, 200);
        Punkt p = new Punkt(10, 20);
        Punkt p2 = new Punkt(10, 20);
        
        
        System.out.println(p.getClass());
        System.out.println(p.toString());
        

    // p.equals(p2)
        
        if(p.equals(p2)) {
            System.out.println("są równe");
        }
    }
    
}

class Punkt {
    int x = 0;
    int y = 0;
    
    Punkt() {
        System.out.println("Domyślny konstrutkor");
    }
    Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
    
    @Override
    public boolean equals(Object o) {
        Punkt przyslany = (Punkt)o;
     
        return this.x == przyslany.x && this.y == przyslany.y;
    }
    @Override
    public String toString() {
        return "Punkt x: " + x + " - " + "Punkt Y: " + y;
    }
}

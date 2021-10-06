package testy;

import java.util.Arrays;
import java.util.Collections;

public class TESTY {
    public static void main(String[] args) {
        Bike[] bikes = new Bike[4];
        bikes[0] = new Bike(100, "Romet", 12);
        bikes[1] = new Bike(88, "Sredni", 10);
        bikes[2] = new Bike(130, "Zapierdalacz", 16);
        bikes[3] = new Bike(55, "Składak", 4);
        
        if(bikes[0].equals(bikes[1]))
            System.out.println("Wartości równe");
        
        Arrays.sort(bikes, Collections.reverseOrder());
        
        for(Bike bike : bikes) {
            System.out.println(bike);
        }
    }
}

interface Rower {
    void pedalowanie();
    void hamulec();
    void opisRowera();
}

class Bike implements Rower, Comparable {
    private int maksymalnaPredkosc;
    private String nazwaRowera;
    private int liczbaPrzerzutek;
    
    Bike(int maksymalnaPredkosc, String nazwaRowera, int liczbaPrzerzutek) {
        this.maksymalnaPredkosc = maksymalnaPredkosc;
        this.nazwaRowera = nazwaRowera;
        this.liczbaPrzerzutek = liczbaPrzerzutek;
    }
    
    @Override
    public void pedalowanie() {
        System.out.println("Przyśpieszam");
    }

    @Override
    public void hamulec() {
        System.out.println("Hamuje");
    }

    @Override
    public void opisRowera() {
        System.out.println("NR " + nazwaRowera);
        System.out.println("MP " + maksymalnaPredkosc);
        System.out.println("LP " + liczbaPrzerzutek);
        System.out.println("");
    }
    
    @Override
    public String toString() {
        return nazwaRowera + " " + maksymalnaPredkosc + " " + liczbaPrzerzutek;
    }
    
    @Override
    public int compareTo(Object o) {
        Bike przyslany = (Bike)o;
        if(this.maksymalnaPredkosc > przyslany.maksymalnaPredkosc)
            return 1;
        if(this.maksymalnaPredkosc < przyslany.maksymalnaPredkosc)
            return -1;
        return 0;
    }
    
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Bike))
            return false;
        
        Bike przyslany = (Bike)o;
     
        if(maksymalnaPredkosc == przyslany.maksymalnaPredkosc)
            return true;
        
        return false;
    }
}
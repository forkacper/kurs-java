package pkg20.interfejsy.sortowanie.obiektów;

import java.util.Arrays;
import java.util.Collections;
  

public class InterfejsySortowanieObiektów {
    public static void main(String[] args) {
                   
        NazwaInterfejsu a = new Pracownik(59);
        
        System.out.println(((Pracownik)a).getWynagrodzenie());
        
        System.out.println(NazwaInterfejsu.PI);
        
        int[] tab = new int[3];
        tab[0] = 55;
        tab[1] = 5;
        tab[2] = 100;
        Arrays.sort(tab);
        System.out.println(tab[0]);
        
        Pracownik[] p = new Pracownik[5];
        p[0] = new Pracownik(2500);
        p[1] = new Pracownik(5000);
        p[2] = new Pracownik(3000);
        p[3] = new Pracownik(1500);
        p[4] = new Pracownik(9999);
    
        Arrays.sort(p, Collections.reverseOrder());

//        for(Pracownik pp : p) {
//            System.out.println(pp.getWynagrodzenie());
//        }
        
        
        System.out.println(p[0].getWynagrodzenie());
    
        System.out.println(p[0].compareTo(p[1]));
    }
    
}

interface NazwaInterfejsu {
    double PI = 3.14;

    void cos();
}

interface cosik {
    
}

class Pracownik implements NazwaInterfejsu, cosik, Comparable{
        
    private double wynagrodzenie = 3500;
    
    Pracownik(double wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }
    
    @Override
    public void cos() {
    
    }
    
    public double getWynagrodzenie() {
        return this.wynagrodzenie;
    }

    @Override
    public int compareTo(Object o) {
        Pracownik przyslany = (Pracownik)o;
        
        if(this.wynagrodzenie < przyslany.wynagrodzenie)
            return -1;
        if(this.wynagrodzenie > przyslany.wynagrodzenie)
            return 1;
        return 0;
    }
}
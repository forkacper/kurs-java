package tablice;

import java.util.*;

public class Tablice {
    static void tablice() {
            String[] alfabet = new String[] {"a", "b", "c", "d", "e", "f"};
            for(String wypisz : alfabet) {
                System.out.println(wypisz);
            }
        }
    
    static void tablice2() {
        int[] liczby = new int[] {1, 2 ,3};
        
        for(int i = liczby.length - 1; i >= 0; i--) {
            System.out.println(liczby[i]);
        }
    }
    
    public static void main(String[] args) {
        tablice();      
        tablice2();
}
}

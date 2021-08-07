
package pkg06.tablicejednowymiarowe;
public class TabliceJednowymiarowe {
    public static void main(String[] args) {
        // piszemy typ tablicy, kwadratowy nawias i nazwe tablicy (deklaracja tablicy)
        
        /*
            --------------------
            tab[0] tab[1] tab[2]
            --------------------
        */
        
        int[] tab;
        
        // int tab[] = new int[5] -- TAK TEŻ MOŻNA
        //int tab[]; -- TEŻ POPRAWNIE
        
        tab = new int[5];
        
        tab[0] = 20;
        tab[1] = 15;
        tab[2] = 22;
        tab[3] = 124;
        tab[4] = 69;
        
        System.out.println(tab[1]);
        
        int[] tab2 = {4, 14, 5, 6};
        System.out.println(tab2.length);
        
        // Zadania
       String[] tabString = new String[5];
        
       tabString[0] = "TEST0";
       tabString[1] = "TEST1";
       tabString[2] = "TEST2";
       tabString[3] = "TEST3";
       tabString[4] = "TEST4";
       
       for(int i = 0; i < 2 ;i++)
            System.out.println(tabString[i]);
       
        
    }
    
}

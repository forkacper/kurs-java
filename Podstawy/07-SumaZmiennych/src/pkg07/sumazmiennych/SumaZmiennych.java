package pkg07.sumazmiennych;
public class SumaZmiennych {
    public static void main(String[] args) {
        int[] tab = {1,5,15,33,123,10};
        
        int suma = 0;
        
        for (int i = 0; i < tab.length; i++)
        {
            suma = suma + tab[i];
        }
        System.out.println(suma);
        
        suma = 0;
        for(int liczba: tab)
        {            
            suma = suma + liczba;
        }
            System.out.println(suma);
        
        }
    }


package pkg03a.zmienne;

public class Zmienne {

    public static void main(String[] args) {
        // int - integer - l. całkowita 32bity 4bajty
        int a = 10;
        int b = 6;
        int c;
        
        c = a + b;
        System.out.println(c);
        /*
        Typy całkowite:
            byte - 8 bit - od -128 do 127
            short - 16 bit ~~32 tys
            int - 32 bity 
            long - 64 bity

        Znakowe:
            char - 2 bajtowy --- 1znak w apostrofach -- apostrofoy służą do jednego znaku 
            String - ciąg znaków
        
        Zmienne zmiennoprzecinkowe (liczbzy z wartością dziesiętną)
            float - 32 bity -- z floata się nie korzysta, można stracić na precyzji.
            double - 64 bity -- prawie zawsze stosujemy double... lepiej liczy, bardziej precyzyjne wyniki
                
        */
        char znak = 'a';
        String nazwisko = "Formas";
        System.out.println(znak + " plus " + nazwisko );
        
        float liczba2 = 4.67f;
        double liczba3 = 4.88;
        System.out.println(liczba2);
        System.out.println(liczba3);
        
        String imie = "Kacper";
        int wiek = 22;
        String daneOsobowe = "Imię: " + imie + ", Nazwisko: " + nazwisko + ", Wiek: " + wiek;
        System.out.println(daneOsobowe);
        
        /*
            Nie wolno:
            1. używać w nazwie zmiennej keyowrdów
            2. nie wolno rozpocząć nazwy zmiennej od liczby
            3. używać spacji w nazwie zmiennej
            4. można rozpocząć zmienną podkreśleniem
            5. 
        */
        
        // Stałe zmienne to są final (finalne) -- podkreślenia używamy najczęściej przy zapisie stałej
        final double LICZBA_PI = 3.14;
        
        // Zmienne powinny być samoopisujące
}
    
}

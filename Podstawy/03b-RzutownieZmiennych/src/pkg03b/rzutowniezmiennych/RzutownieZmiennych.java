package pkg03b.rzutowniezmiennych;

public class RzutownieZmiennych {
    public static void main(String[] args) {
        int a = 5, b = 2;
        double c = 12, d = 15;
        
        System.out.println((double)a / b);
        
        int wynik1 = a / b;
        double wynik2 = c / d;
        
        int wynik3 = a / (int)d;
        double wynik4 = a / d;
        
        System.out.println(wynik1);
        System.out.println(wynik2);
        System.out.println(wynik3);
        System.out.println(wynik4);
        System.out.println(1.0 / 5);
    }
    
}

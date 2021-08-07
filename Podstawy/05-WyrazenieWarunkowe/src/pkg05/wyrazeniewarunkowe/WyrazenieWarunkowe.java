package pkg05.wyrazeniewarunkowe;
public class WyrazenieWarunkowe {
    public static void main(String[] args) {

        int x = 6;
//        if (x % 2 == 0)
//            System.out.println("Parzysta");
//        else
//            System.out.println("Nieparzysta");
//    
        String czyParzysta = x % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println(czyParzysta);
        
        int a = 103,
            b = 56,
            c = 123,
            d = 33;
        
        String czyParzystaA = a % 2 == 0 ? "parzysteA" : "nieparzysteA";
        String czyParzystaB = b % 2 == 0 ? "parzysteB" : "nieparzysteB";
        String czyParzystaC = c % 2 == 0 ? "parzysteC" : "nieparzysteC";
        String czyParzystaD = d % 2 == 0 ? "parzysteD" : "nieparzysteD";
        
        System.out.println(czyParzystaA);
        System.out.println(czyParzystaB);
        System.out.println(czyParzystaC);
        System.out.println(czyParzystaD);
    }
    
}

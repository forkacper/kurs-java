package metody;
public class Metody {
    static void aktualnyWiek(int ileLat) {
        System.out.println("Aktualnie masz: " + ileLat + " lat.");
    }
    static void twojeImie(String imie) {
        System.out.println("Masz na imie: " + imie + ".");
    }
    static void dwieLiczby(double l1, double l2) {
        System.out.println(l1 + l2);
        System.out.println(l1 - l2);
        System.out.println(l1 * l2);
    }
    static boolean czyParzysta(int liczba) {
        if(liczba % 2 == 0) {
            System.out.println("True");
            return true;
        }
        return false;
    }
    static boolean podzielnaPrzez(int liczba) {
        if(liczba % 3 == 0 && liczba % 5 == 0) {
            System.out.println("True");
            return true;
        }
        return false;
    }
    
    static void potega(int liczba) {
        System.out.println(Math.pow(liczba, 3)); 
    }
    
    static void pierwiastek(int liczba) {
        System.out.println(Math.sqrt(liczba));
    }
    
    static void rectangle(int a, int b, int c) {
        if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
            System.out.println("Trójkąt jest równoboczny");
        else
            System.out.println("Trójkąt nie jest równoboczny");
    }
    
    public static void main(String[] args) {
    
      Metody.aktualnyWiek(20);
      Metody.twojeImie("Kacper");
      Metody.dwieLiczby(5, 10);
      Metody.czyParzysta(1);
      Metody.podzielnaPrzez(20);
      Metody.potega(5);
      Metody.pierwiastek(100);
      Metody.rectangle(3, 4, 5);
    }
    
}

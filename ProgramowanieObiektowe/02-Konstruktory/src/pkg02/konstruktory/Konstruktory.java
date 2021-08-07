package pkg02.konstruktory;
public class Konstruktory {
    public static void main(String[] args) {
        Punkt p = new Punkt(10,10);
        System.out.println(p.x);
        System.out.println(p.y);
    }
    
}

class Punkt {
    Punkt() {
        System.out.println("Konstruktor domyslny");
        }
    Punkt(int pierwszy, int drugi) {
        System.out.println("Wywolano konsturktor z dwoma paremtrami");
        x = pierwszy;
        y = drugi;
    }
    
    int x;
    int y;
}

package obiekty.i.pakiety;
public class ObiektyIPakiety {
    public static void main(String[] args) {
     
        Prostokat p = new Prostokat(5, 5);
        System.out.println("Pole prostokata: " + p.pole());
        System.out.println("Obwod prostokata: " + p.obwod());
        System.out.println("Dlugosc przekatnej " + p.dlugoscPrzekatnej());
        System.out.println("");
        
        MyNumber m = new MyNumber(10);
        System.out.println("Czy parzysta: " + m.isEven());
        System.out.println("Czy nieparzysta " + m.isOdd());
        System.out.println("Pierwiastek " + m.sqrt());
        System.out.println("Potęga MyNumber " + m.pow(new MyNumber(2)));
        System.out.println("Dodawanie MyNumber " + m.add(new MyNumber(10)));
        System.out.println("Odejmowanie MyNumber " + m.subtract(new MyNumber(30)));
        System.out.println("");
    }
    
}

class Human {
    private int wiek;
    private int waga;
    private int wzrost;
    private String imie;
    private String plec;

    public String getImie() {
        return imie;
    }

    public String getPlec() {
        return plec;
    }

    public int getWaga() {
        return waga;
    }

    public int getWiek() {
        return wiek;
    }

    public int getWzrost() {
        return wzrost;
    }
    
}

class Prostokat {
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double pole() {
        return a * b;
    }
    
    public double obwod() {
        return 2 * a + 2 * b;
    }
    
    public double dlugoscPrzekatnej() {
        double aa = Math.pow(a, 2);
        double bb = Math.pow(b, 2);        
        return Math.sqrt(aa + bb);
    }
    
}

class MyNumber {
    private double liczba;

    public MyNumber(double liczba) {
        this.liczba = liczba;
    }
    
    public boolean isEven() {
        if(liczba % 2 == 0) 
            return true;
        
        return false;
    }
    
    public boolean isOdd() {
        if(!(liczba % 2 == 0))
            return true;
        
        return false;
    }
    
    public double sqrt() {
        return Math.sqrt(liczba);
    }
    
    public double pow(MyNumber x) {
        double pow = Math.pow(liczba, x.liczba);
        return pow;
    }
    
    public double add(MyNumber x) {
        double add = liczba + x.liczba;
        return add;
    }
    
    public double subtract(MyNumber x) {
        double subtract = liczba - x.liczba;
        return subtract;
    }
    
    
}
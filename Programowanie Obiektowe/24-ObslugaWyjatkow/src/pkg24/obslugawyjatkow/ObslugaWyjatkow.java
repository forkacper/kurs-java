package pkg24.obslugawyjatkow;
public class ObslugaWyjatkow {
    public static void main(String[] args) {        
        
        int a = 10;
        
        try {
        if(a == 10)
            throw new NaszWyjatek("A = 10");
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
        try {
            System.out.println(5/0);
        }
        catch(Exception ex) {
            System.out.println("Powstal wyjatek " + ex.getMessage());
        }
        finally {
            System.out.println("Cos co zawsze zostanie wykonane");
        }
        
        System.out.println("Cokolwiek");
    
        
    }
    
}


class NaszWyjatek extends Exception {

    public NaszWyjatek(String string) {
        super(string);
    }
    
}
package pkg07.enkapsulacja;
public class Enkapsulacja {
    public static void main(String[] args) {
        
        KontoBankowe oszczednosciowe = new KontoBankowe();
            
        System.out.println(oszczednosciowe.getSaldo());
    }
    
}

class KontoBankowe {
    
    public KontoBankowe() {
        saldo = 1000;
    }
    
    private int saldo;
    
    int getSaldo() {
        return saldo;
    }
    
    private boolean setSaldo(int saldo) {
        this.saldo = saldo;
        return true;
    }
    
    boolean wyplac(int kwota) {
        if (kwota > saldo)
            return false;
        else
            setSaldo(saldo - kwota);
        
        return true;
    }
    
    boolean wplac (int kwota) {
        setSaldo(saldo + kwota);
        return true;
    }
    
}
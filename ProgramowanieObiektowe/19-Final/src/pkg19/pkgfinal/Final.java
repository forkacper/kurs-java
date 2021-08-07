finapckage pkg19.pkgfinal;

import java.util.Date;

public class Final {
    public static void main(String[] args) {
         final double PI;
         PI = 3.14;
    
         Osoba o1 = new Pracownik();
        
         //Rzutowanie do klasy Pracownik --- bo nie bylo
        // System.out.println(((Pracownik)o1).dataZatrudnienia);
    
        
    }
    
}

abstract class Osoba {
    
}

class Pracownik extends Osoba {
    final Date dataZatrudnienia;
     
    Pracownik()
    {
        this.dataZatrudnienia = new Date();
    }
    
    Pracownik(Date data) {
        this.dataZatrudnienia = data;
    }
    
    final Date getDataZatrudnienia() {
        return this.dataZatrudnienia;
    }
    
}

class Progrmiasta extends Pracownik {
    
}

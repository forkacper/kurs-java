package pkg09.przekazywanie.wartosci.ref.prym;
public class PrzekazywanieWartosciRefPrym {
    public static void main(String[] args) {
        int a = 5;
        
        Test x = new Test();
        a = x.zmienWartosc(a);
  
        System.out.println(a);
    }
    
}

class Test {
    int zmienWartosc(int zm) {
        zm += 2;
        return zm;
    }
}
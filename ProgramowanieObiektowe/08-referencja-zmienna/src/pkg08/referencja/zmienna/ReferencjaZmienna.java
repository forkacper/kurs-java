package pkg08.referencja.zmienna;
public class ReferencjaZmienna {
    public static void main(String[] args) {

        int x = 50;
        int b = x;
        b += 30;
        System.out.println(x);
        
        
        Test tt = new Test();
        Test xx = tt;
        xx.a = 100;
        System.out.println(tt.a);
        
        
        String test1 = "Dupa";
        String test2 = new String(test1);
        
        test2 = "szczyl";
        
        System.out.println(test1);
        System.out.println(test2);
    }
    
}

class Test {
    int a = 50;
}


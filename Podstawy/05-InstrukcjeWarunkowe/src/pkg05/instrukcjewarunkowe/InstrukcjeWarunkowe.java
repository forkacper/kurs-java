package pkg05.instrukcjewarunkowe;
public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        /*
            true false
            INSTRUKCJE WARUNKOWE
        
            if(WYRAZENIE) {
                INSTRUKCJA;
            }
            else {
                INSTRUKCJA;
            }
        */
        int a = 5,
            b = 7;
        
        System.out.println(a == b); //false
        
        if(a > b)
            System.out.println("A > B");
        else if(a < b) {
            System.out.println("A < B");
            System.out.println("To działa!");
        }
        else 
            System.out.println("A == B");
    }
    
}

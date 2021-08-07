package pkg04.operatorylogiczne;

public class OperatoryLogiczne {

    public static void main(String[] args) {
        /*
            Operatory logiczne
            
            true false
            
            ! - negacja
        
            !(true) - false
            !(false) - true
        
            && - Ampersand - Koniunkcja - "I" - W TYM SAMYM MOMENCIE 
            
            || - Alternatywa - "LUB"
       
        */
        
        int a = 5;
        int b = 5;
        int c = 7;
        
        if(a == b && c >= 7)
            System.out.println("Oba wyrażenia są prawdziwe");
       
        if(a != b || c > 5)
            System.out.println("Jedno z wyrażen jest prawdziwe");
    }
    
}

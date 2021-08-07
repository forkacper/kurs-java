package pkg04.operatoryrelacyjne;

public class OperatoryRelacyjne {

    public static void main(String[] args) {
        // Operatory relacyjne (Porówniania)
        
        /*
            =  -  przypisanie
            == - porównanie
            != - porównanie czy są rózne od siebie
        
            > - większe od
            < - mniejsze od
        
            >= - większe bądź równe
            <= - mniejsze bądź równe
        */
        
        boolean isTrue = 4 == 8;
        System.out.println(isTrue);
        
        if(4 == 8)
            System.out.println("TAK");
        else
            System.out.println("NIE");
        
        if(5 != 6)
            System.out.println("Różne");
        
        
    }
    
}

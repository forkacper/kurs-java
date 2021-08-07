package aplikacja.restauracja;
import java.util.*;

public class AplikacjaRestauracja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        Party party = new Party();
        
        boolean shouldContinue = true;
        
        while(shouldContinue) {
            System.out.println("Wybierz opcję");
            System.out.println("1. Wyświelt gości");
            System.out.println("2. Dodaj gościa");
            System.out.println("3. Wyświetl potrawy");
            System.out.println("4. Znajdź po numerze telefonu");
            System.out.println("5. Wyjście");
            
            int userChoice = scanner.nextInt();
            
             switch (userChoice) {
                 case 1 -> party.displayGuests();
                 case 2 -> party.addGuest();
                 case 3 -> party.displayMeals();
                 case 4 -> party.displayGuestByPhoneNumber();
                 case 5 -> shouldContinue = false;
             }
            
        }
    }
    
}

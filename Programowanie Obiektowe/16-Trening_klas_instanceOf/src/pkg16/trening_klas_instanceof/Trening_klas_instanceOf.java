package pkg16.trening_klas_instanceof;

public class Trening_klas_instanceOf {
    
    public static void main(String[] args) {
        Osoba[] osoba = new Osoba[4];
        
        osoba[0] = new Pracownik("Arkadiusz", "Ogarek", 2999.99);
        osoba[1] = new Student("Kacper", "Formas");
        osoba[2] = new Pracownik("Tomasz", "Wpierdol", 199.90);
                
        for(Osoba person: osoba) {
            
                //instanceof
            if(person instanceof Pracownik) {
                person.pobierzOpis();
                
                //Rzutowanie
                ((Pracownik)person).pracuj();
            }
            else if(person instanceof Student)
                person.pobierzOpis();
            else 
                break;
        }   
    }
    
}

abstract class Osoba {
    String imie;
    String nazwisko;
    
    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    
    abstract void pobierzOpis();
}

class Pracownik extends Osoba {
    double wynagrodzenie;
    
    Pracownik(String imie, String nazwisko, double wynagrodzenie) {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    void pobierzOpis() {   
        System.out.println("Jestem pracownikiem");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wynagrodzenie: " + wynagrodzenie);
        
    }
    
    void pracuj() {
        System.out.println("Ja pracuje");
        System.out.println("");
    }
    
}

class Student extends Osoba {
    Student(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    void pobierzOpis() {
        System.out.println("Jestem studentem");
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("");
    }
}
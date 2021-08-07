package pkg21.klasyzagniezdzone_przyklady;
public class KlasyZagniezdzone_przyklady {
    public static void main(String[] args) {
        KontoBankowe kontoBankowe = new KontoBankowe(1000);
        System.out.println(kontoBankowe.getStanKonta());
        kontoBankowe.start(10);
        System.out.println(kontoBankowe.getStanKonta());
    }
    
}

class KontoBankowe {
    private double stanKonta;

    public KontoBankowe(double stanKonta) {
        this.stanKonta = stanKonta;
    }
    
    double getStanKonta() {
        return this.stanKonta;
    }
    
    void start(double stopa){
        Odestki odsetki = new Odestki(stopa);
    }
    
    class Odestki {
        private double stopaProcentowa;

        public Odestki(double stopaProcentowa) {
            this.stopaProcentowa = stopaProcentowa;
            this.zmienStanKonta(stopaProcentowa);
        }
        void zmienStanKonta(double stopa) {
            double odsetki = (stanKonta * stopa) / 100;
            stanKonta += odsetki;
        }
    }
}
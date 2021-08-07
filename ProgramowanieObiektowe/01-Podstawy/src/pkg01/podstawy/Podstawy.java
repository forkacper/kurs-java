package pkg01.podstawy;
public class Podstawy {
    public static void main(String[] args) {
        
        Komputer gaming = new Komputer();
        gaming.procesor = "i5-9400";
        gaming.kartaGraficzna = "GTX 1060Ti";
        
        System.out.println(gaming.procesor);
        System.out.println(gaming.kartaGraficzna);
       }
}
class Komputer {
            
            String procesor;
            String kartaGraficzna;
        
        }

package pkg05.zapis.i.odczyt.sformatowany.tekst;

import java.io.*;

public class ZapisIOdczytSformatowanyTekst {

    public static void main(String[] args) {
        try {
            PrintWriter drukarz = new PrintWriter(new FileWriter("dane.txt", true));
            
            drukarz.println(1234);
//            drukarz.flush();
            drukarz.close();
            
            drukarz = new PrintWriter(new FileWriter("dane.txt", true));
            drukarz.append("lala");
            drukarz.println();
            drukarz.printf("lala %d kg oraz %.2f %s wzrostu", 50, 165.4, "cm");
            drukarz.close();
            
            
            BufferedReader reader = new BufferedReader(new FileReader("dane.txt"));
            
//            System.out.println(reader.read());
//            System.out.println(reader.readLine());

            BufferedWriter writer = new BufferedWriter(new FileWriter("baza.txt"));

            String tresc = "";
            while((tresc = reader.readLine()) != null) {
//                System.out.println(tresc);
                writer.write(tresc);
                writer.newLine();
            }
            reader.close();
            
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        
        
//        ZapisIOdczytSformatowanyTekst.test(1, 2, 4, 125, "asd");
        
    }
    
    static void test(Object... a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    
}

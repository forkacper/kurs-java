package pkg03.abstrakcyjne.klasy.strumieni;

import java.io.*;

public class AbstrakcyjneKlasyStrumieni {
    public static void main(String[] args) throws IOException {
        InputStream inS;
        OutputStream outS;
        
        Reader reader;
        
        Writer writer = new FileWriter("nazwaPliku.txt");
        writer.write("lalal");
        writer.close();
        
    }
    
    void nazwaFunkcji(InputStream inS) {
        
    }
}

package pkg04.filtrowanie.strumieni;

import java.io.*;
        
public class FiltrowanieStrumieni {

    public static void main(String[] args) throws IOException {
        
        File plik = new File("nazwaPliku.txt");
        
        InputStream inS;
        OutputStream outS;
        
        Reader reader;
        
        Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(plik)));
        ((BufferedWriter)writer).write("lalal");
        ((BufferedWriter)writer).newLine();
        ((BufferedWriter)writer).write("asdasd");
        ((BufferedWriter)writer).close();
    }
    
    void nazwaFunkcji(InputStream inS) {
        
    }
}

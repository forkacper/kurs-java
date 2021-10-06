package pkg01.pliki.oraz.katalogi;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class PlikiOrazKatalogi {

    public static void main(String[] args) {
        try {
            File katalog = new File("video kursy"+File.separator+"php"+File.separator+"mysql");
            katalog.mkdirs();
            
            File plik2 = new File("video kursy"+File.separator+"php"+File.separator+"mysql", "lekcja1.txt");
            
            if(!plik2.exists())
                plik2.createNewFile();
            
            
            File plik = new File("test.txt");
            
            if(!plik.exists())
                plik.createNewFile();
          
            System.out.println(plik.getPath());
            System.out.println(plik.getAbsolutePath()); //absolutna doslowna sciezka
            System.out.println(plik.getCanonicalPath()); // kanonicza, zawsze prawdziwa
            
            System.out.println("Czy mogę pisać? "+plik.canWrite());
            System.out.println("Czy mogę odpalić? "+plik.canExecute());
            System.out.println("Czy mogę czytać? "+plik.canRead());
            System.out.println("Czy jest ukryty? "+plik.isHidden());
            System.out.println("Czy jest plikiem? "+plik.isFile());
            System.out.println("Ostatnia modyfikacja "+ new Date(plik.lastModified()));
            System.out.println("Dłguość pliku w batjach (il. znaków) "+ plik.length());
    
            wypiszSciezki(new File(System.getProperty("user.dir")));
            
            plik.list();
            
//            plik.delete();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
//        System.out.println(System.getProperty("user.dir"));
//        System.out.println(System.getProperty("java.home"));


    }

    public static void wypiszSciezki(File nazwaSciezki) {
            String[] nazwyPlikowIKatalogow = nazwaSciezki.list();
            
            for (int i = 0; i < nazwyPlikowIKatalogow.length; i++) {
                File p = new File(nazwaSciezki.getPath(), nazwyPlikowIKatalogow[i]);
                
                if(p.isFile())
                    System.out.println(p.getPath());
                
                if(p.isDirectory())
                    wypiszSciezki(new File(p.getPath()));
                
            }
        }
    
}

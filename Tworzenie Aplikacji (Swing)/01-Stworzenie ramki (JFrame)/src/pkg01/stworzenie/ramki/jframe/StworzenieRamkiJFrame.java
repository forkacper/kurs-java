package pkg01.stworzenie.ramki.jframe;

import javax.swing.*;
import java.awt.*; // awt - abstract window toolkit -- Abstrakcyjne narzędzia do tworzenia okien

public class StworzenieRamkiJFrame extends JFrame {
   
    public StworzenieRamkiJFrame() {
        /*
        //Tworzenie obiektu ramki konsturktor z nazwa ramki + metoda setTitle
        JFrame frame = new JFrame("Tytuł ramki");
//        frame.setTitle("Tytuł ramki");

        //Wymiary ramki
//          frame.setSize(100, 100);
//          frame.setSize(new Dimension(100, 100));
        //Lokalizacja ranki
//          frame.setLocation(100, 50);
//          frame.setLocation(new Point(100, 50));
          
        //Wymiary i lokalizacja w jednej metodzie
          frame.setBounds(100, 50, 100, 100);
          
          frame.setResizable(false);
          
          frame.setIconImage(Toolkit.getDefaultToolkit().getImage("zdjecie.jpg"));
          
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        
        
        */
        
        super("Tytuł ramki");
        
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(3);
        this.pack(); //Używa się, kalkuluje przyśpeisza komponenty
        this.setVisible(true);
        
    }
    
    public static void main(String[] args) {
       new StworzenieRamkiJFrame();
    }
    
}

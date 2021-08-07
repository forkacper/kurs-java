package pkg03.menadżery.układów.komponenty.szybka.przyciski;

import javax.swing.*;
import java.awt.*;

public class MenadżeryUkładówKomponentySzybkaPrzyciski extends JFrame {
    
    public MenadżeryUkładówKomponentySzybkaPrzyciski() {
        super("Układ graficzny (Layout)");
        this.setBounds(300, 320, 300, 200);
        
        initComponents();
        this.setDefaultCloseOperation(3);
          
    }
    
    public void initComponents() {
        centrum = new JButton("Anuluj");
        gora = new JButton("Jestem na górze!");
        dol = new JButton("Jestem na dole!");
        prawa = new JButton("Jestem z prawej strony!");
        lewa = new JButton("Jestem z lewej strony!");
        
        Container kontener = this.getContentPane();
        
//        kontener.add(centrum, BorderLayout.CENTER);
//        kontener.add(gora, BorderLayout.PAGE_START);
//        kontener.add(dol, BorderLayout.PAGE_END);
//        kontener.add(prawa, BorderLayout.LINE_END);
//        kontener.add(lewa, BorderLayout.LINE_START);

        centrum.setLocation(210, 120);
        centrum.setSize(centrum.getPreferredSize());
        kontener.setLayout(null);
        kontener.add(centrum);
    }
    
    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawa;
    JButton lewa;
    
    public static void main(String[] args) {
        new MenadżeryUkładówKomponentySzybkaPrzyciski().setVisible(true);
    }
    
}

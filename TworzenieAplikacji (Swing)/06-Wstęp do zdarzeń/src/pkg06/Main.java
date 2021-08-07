package pkg06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    
    public Main() {
        
        super("Zdarzenia");
        this.setBounds(300, 300, 300, 200);
        
        initComponents();
        
        this.setDefaultCloseOperation(3);
    }
    
    public void initComponents() {
        
        kolorCzerwony = new JButton("czerwony");
        kolorCzarny = new JButton("czarny");
        kolorNiebieski = new JButton("niebieski");
        kolorCzerwony.addActionListener(new SluchaszKolorow(Color.RED));
        kolorCzarny.addActionListener(new SluchaszKolorow(Color.BLACK));
        kolorNiebieski.addActionListener(this);
        
        panel.add(kolorNiebieski);
        panel.add(kolorCzarny);
        panel.add(kolorCzerwony);
        
        
        budujButton("Zielony", Color.GRAY);
        
        this.getContentPane().add(panel);
    }
    JPanel panel = new JPanel();
    JButton kolorCzerwony;
    JButton kolorCzarny;
    JButton kolorNiebieski;
    
    public void budujButton(String nazwa, Color k) {
        JButton przycisk = new JButton(nazwa);
//        przycisk.addActionListener(new SluchaszKolorow(k));
        

//Klasa anonimowa
//        przycisk.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e) {
//                panel.setBackground(k);
//            }
//        });

//Skrocony zapis lambda klasy anonimowej
        przycisk.addActionListener(action -> panel.setBackground(k));
        

        panel.add(przycisk);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == kolorNiebieski)
             panel.setBackground(Color.BLUE);
    }
    
    private class SluchaszKolorow implements ActionListener {

        public SluchaszKolorow(Color k) {
            this.kolor = k;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("LA");
            panel.setBackground(kolor);
        }
        
        Color kolor;
        
    }
    
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
    
}

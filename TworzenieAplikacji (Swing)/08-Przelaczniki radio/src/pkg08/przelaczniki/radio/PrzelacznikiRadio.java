/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08.przelaczniki.radio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author kacper-test
 */
public class PrzelacznikiRadio extends JFrame{

    public PrzelacznikiRadio() {
        initCompontents();
    }
    
    public void initCompontents() {
        this.setTitle("Grupy przełączników radio");
        this.setBounds(300, 300, 300, 200);
        panel2.add(etykieta);
        
        zbudujPrzelacznikRozmiar("Mały", 15);
        zbudujPrzelacznikRozmiar("Średni", 25);
        zbudujPrzelacznikRozmiar("Duży", 35);
        
        zbudujPrzelacznikKolor("Zielony", Color.GREEN);
        zbudujPrzelacznikKolor("Czerwony", Color.RED);
        zbudujPrzelacznikKolor("Niebieski", Color.BLUE);
        
        this.getContentPane().add(panel, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.SOUTH);
        this.getContentPane().add(panel3, BorderLayout.CENTER);
        this.setDefaultCloseOperation(3);
    }
    
    public void zbudujPrzelacznikRozmiar(String nazwa, int rozmiar) {
        JRadioButton przelacznik = new JRadioButton(nazwa);
        przelacznik.addActionListener(action -> etykieta.setFont(new Font("Monospaced", Font.PLAIN, rozmiar)));
        grupaWielkosci.add(przelacznik);
        panel.add(przelacznik);
    }
    
    public void zbudujPrzelacznikKolor(String nazwa, final Color k) {
        JRadioButton przelacznik = new JRadioButton(nazwa);
        przelacznik.addActionListener(action -> etykieta.setForeground(k));
        grupaKoloru.add(przelacznik);
        panel3.add(przelacznik);
    }
        
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel etykieta = new JLabel("Cos");
    ButtonGroup grupaWielkosci = new ButtonGroup();
    ButtonGroup grupaKoloru = new ButtonGroup();
    
    public static void main(String[] args) {
        // TODO code application logic here
        new PrzelacznikiRadio().setVisible(true);
    }
    
}

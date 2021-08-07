/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13.listykombinowane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author kacper-test
 */
public class ListyKombinowane extends JFrame {

   public ListyKombinowane() {
       this.setTitle("Listy Kombinowane");
       this.setBounds(300, 300, 300, 300);
       
       initComponents();
       
       this.setDefaultCloseOperation(3);
   }
   
   public void initComponents() {
       kombinacja.addActionListener((ActionEvent e) -> {
           colorHandler handler = (colorHandler)((JComboBox)e.getSource()).getSelectedItem();
       
           ((JComboBox)e.getSource()).setBackground(handler.getKolor());
       });
       
       panel.add(kombinacja);
       
       kombinacja.addItem(new colorHandler("Czarny", Color.BLACK));
       kombinacja.addItem(new colorHandler("Niebieski", Color.BLUE));
       kombinacja.addItem(new colorHandler("Zółoty", Color.YELLOW));
       
       this.getContentPane().add(panel);
   }
   
   private class colorHandler {
        public colorHandler(String colorName, Color kolor) {
            this.kolor = kolor;
            this.colorName = colorName;
        }
       
        @Override
        public String toString() {
            return this.colorName;
        }
        
        public Color getKolor() {
            return this.kolor;
        }
        
       private Color kolor;
       private String colorName;
   }
   private JPanel panel = new JPanel();
   private JComboBox kombinacja = new JComboBox();
   
    public static void main(String[] args) {
        new ListyKombinowane().setVisible(true);
    }
    
}

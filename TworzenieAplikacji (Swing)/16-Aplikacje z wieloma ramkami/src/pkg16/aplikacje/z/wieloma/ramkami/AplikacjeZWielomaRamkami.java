package pkg16.aplikacje.z.wieloma.ramkami;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AplikacjeZWielomaRamkami extends JFrame {
    
    public AplikacjeZWielomaRamkami() {
        initComponents();
    }
    
    public void initComponents() {
        this.setTitle("Aplikacja z wieloma ramkami");
        this.setBounds(300, 300, 300, 300);
        
        nowaRamka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new dialog(taRamka).setVisible(true);
            }
        });
        
        this.getContentPane().add(nowaRamka);
  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private JFrame taRamka = this;
    private JButton nowaRamka = new JButton("Stwórz ramkę");
    
    public static void main(String[] args) {
        new AplikacjeZWielomaRamkami().setVisible(true);
    }
    
}

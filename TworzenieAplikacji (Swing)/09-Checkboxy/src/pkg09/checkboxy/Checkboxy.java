/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09.checkboxy;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author u180
 */
public class Checkboxy extends JFrame {

    public Checkboxy() {
        initComponents();
    }
    
    public void initComponents() {
        this.setTitle("Pola wyboru");
        this.setBounds(300, 300, 300, 200);
        
        etykieta.setFont(new Font("Monospace", Font.PLAIN, 25));
        
        CheckBoxHandler sluchacz = new CheckBoxHandler();
        
        pogrubiony.addActionListener(sluchacz);
        pochylony.addActionListener(sluchacz);
        
        panel2.add(etykieta);
        
        panel1.add(pogrubiony);
        panel1.add(pochylony);
        
        this.getContentPane().add(panel1, BorderLayout.NORTH);
        this.getContentPane().add(panel2, BorderLayout.CENTER);
        
        this.setDefaultCloseOperation(3);
    }
    
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    
    JCheckBox pogrubiony = new JCheckBox();
    JCheckBox pochylony = new JCheckBox();
    
    JLabel etykieta = new JLabel("Jestem");
    
    public class CheckBoxHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int style = Font.PLAIN;
            if(pogrubiony.isSelected())
                style += Font.BOLD;
            if(pochylony.isSelected())
                style += Font.ITALIC;
            
            etykieta.setFont(new Font(etykieta.getFont().getFamily(), style, etykieta.getFont().getSize()));
        }
    
    }
    
    public static void main(String[] args) {
        new Checkboxy().setVisible(true);
    }
    
}

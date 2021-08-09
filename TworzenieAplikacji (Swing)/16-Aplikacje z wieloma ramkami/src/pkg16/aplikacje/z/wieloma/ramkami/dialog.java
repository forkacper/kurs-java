package pkg16.aplikacje.z.wieloma.ramkami;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dialog extends JDialog {
    
    public dialog(JFrame parent) {
        super(parent, true);
        initComponents();
        
        int szer = (int)parent.getBounds().getWidth();
        int wys = (int)parent.getBounds().getHeight();
        
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;
        
        this.setLocation(parent.getBounds().x + (szer-szerRamki)/2, parent.getBounds().y + (wys-wysRamki)/2);
        
    }
    
    public void initComponents() {
        this.setTitle("To jest ramka" + i++);
        this.setBounds(300, 300, 250, 75);
         
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    static int i = 1;
    
    public static void main(String[] args) {
        new AplikacjeZWielomaRamkami().setVisible(true);
    }
    
}

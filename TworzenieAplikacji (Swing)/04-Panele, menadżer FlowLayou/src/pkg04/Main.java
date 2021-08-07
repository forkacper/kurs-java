package pkg04;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    Main() {
        super("Nazwa ramki!");
        
        this.setBounds(300, 300, 300, 200);
        
        initComponents();
        
        this.setDefaultCloseOperation(3);
        
    }
        
    public void initComponents() {
        button1.setPreferredSize(new Dimension(100, 100));
        button2.setPreferredSize(button2.getPreferredSize());
        
        panel1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        
        this.getContentPane().add(panel1, BorderLayout.PAGE_START);
    }
    
//    JPANEL == new FlowLayout()
    JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");
    
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
    
}

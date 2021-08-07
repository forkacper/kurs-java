package pkg05;
import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
    
    public Main() {
        super("Menadżer GroupLayout");
        this.setBounds(300, 300, 300, 200);
        
        initComponents();
        
        this.setDefaultCloseOperation(3);
    }
    
    public void initComponents() {
        GroupLayout layout = new GroupLayout(getContentPane());
        this.getContentPane().setLayout(layout);
        
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addComponent(button1, GroupLayout.DEFAULT_SIZE, 30, 100)
                .addGroup(layout.createParallelGroup().addComponent(button2).addComponent(button4))
                .addComponent(button3)
                        
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(bAnuluj)
        );
        
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup().addComponent(button1).addComponent(button2).addComponent(button3))
                .addComponent(button4)
                
                
                .addComponent(bAnuluj)
        );
        
        pack();
        
    }
    
    JButton button1 = new JButton("Przycisk1");
    JButton button2 = new JButton("Przycisk2");
    JButton button3 = new JButton("Przycisk3");
    JButton button4 = new JButton("Przycisk4");
    JButton bAnuluj = new JButton("Anuluj");
    
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
    
}

package pkg17.krawedzie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Krawedzie extends JFrame {
    
    public Krawedzie() {
        initComponents();
    }
    
    public void initComponents() {
        this.setTitle("Krawędzie");
        this.setBounds(300, 300, 300, 200);
        
        dodajPrzelacznik("createEtchedBorder", BorderFactory.createEtchedBorder());
        dodajPrzelacznik("createLoweredBevelBorder", BorderFactory.createLoweredBevelBorder());
        
//        panelRadio.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        
        panelRadio.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED), "Krawędzie", TitledBorder.RIGHT, TitledBorder.BOTTOM));
        
        this.getContentPane().setLayout(new GridLayout(2, 1));
        
        this.getContentPane().add(panelRadio);
        this.getContentPane().add(panelKrawedzi);
        
        this.setDefaultCloseOperation(3);
    }
    
    private JPanel panelRadio = new JPanel();
    private JPanel panelKrawedzi = new JPanel();
    private ButtonGroup grupaRadio = new ButtonGroup();
    
    public void dodajPrzelacznik(final String nazwa, final Border kr) {
        JRadioButton przelacznik = new JRadioButton(nazwa);
        
        przelacznik.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelKrawedzi.setBorder(BorderFactory.createTitledBorder(kr, nazwa));
            }
        });
    
        grupaRadio.add(przelacznik);
        panelRadio.add(przelacznik);
    
    }
    
    
    
    public static void main(String[] args) {
        new Krawedzie().setVisible(true);
    }
    
}

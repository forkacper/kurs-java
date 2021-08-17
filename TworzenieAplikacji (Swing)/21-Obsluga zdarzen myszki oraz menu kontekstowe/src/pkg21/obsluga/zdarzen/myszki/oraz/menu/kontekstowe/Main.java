package pkg21.obsluga.zdarzen.myszki.oraz.menu.kontekstowe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    
    public Main() {
        initComponents();
    }
    
    public void initComponents() {
        this.setTitle("Menu kontekstowe");
        this.setBounds(300, 300, 300, 200);
        
        final JPopupMenu menuKontekstowe = new JPopupMenu();
        
        menuKontekstowe.add(new JMenuItem(new AbstractAction("Zamknij") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }));
        menuKontekstowe.add(new JMenuItem("Kopiuj"));
        menuKontekstowe.add(new JMenuItem("Wklej"));
        
        this.getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("released");
                
                if(e.getClickCount() == 3 && e.getButton() == MouseEvent.BUTTON1 )
                   JOptionPane.showMessageDialog(rootPane, "Aleś się naklikał! Lewym przyciskiem myszy");
                
                if(e.isPopupTrigger())
                    menuKontekstowe.show(e.getComponent(), e.getX(), e.getY());
            }
        });
        
        this.getContentPane().add(testowiec, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(3);
    }
    
    private JButton testowiec = new JButton("test")
    
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
    
}

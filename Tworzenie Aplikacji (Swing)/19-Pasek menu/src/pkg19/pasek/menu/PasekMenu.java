package pkg19.pasek.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasekMenu extends JFrame {
    
    public PasekMenu () {
        initComponents();
    }
    
    public void initComponents() {
        this.setTitle("Pasek menu");
        this.setBounds(300, 300, 300, 200);

        this.setJMenuBar(pasekMenu);
        JMenu menuPlik = pasekMenu.add(new JMenu("Plik"));
        JMenuItem podMenuNowy = menuPlik.add(new JMenuItem("Nowy"));
        podMenuNowy.addActionListener((ActionEvent e) -> {
            System.out.println("Tu jest kod który tworzy nowy plik");
        });
        
        menuPlik.addSeparator();
        final JMenuItem podMenuZapisz = menuPlik.add(new JMenuItem("Zapis"));
        menuPlik.add(new JMenuItem("Wczytaj"));
        menuPlik.addSeparator();
        
        JMenu menuOpcje = new JMenu("Opcje");
        menuPlik.add(menuOpcje);
        menuOpcje.add(new JMenuItem("Opcja1"));
        menuOpcje.add(new JMenuItem("Opcja2"));
        menuOpcje.add(tylkoDoOdczytu);
        
        tylkoDoOdczytu.addActionListener((ActionEvent e) -> {
            if(tylkoDoOdczytu.isSelected())
                podMenuZapisz.setEnabled(false);
            else
                podMenuZapisz.setEnabled(true);
        });
        
        JMenu menuPomoc = pasekMenu.add(new JMenu("Pomoc"));
        menuPomoc.add(new JMenuItem("FAQ"));
        
        
        this.setDefaultCloseOperation(3);
    }
    
    private JMenuBar pasekMenu = new JMenuBar();
    private JCheckBoxMenuItem tylkoDoOdczytu = new JCheckBoxMenuItem("Tylko do odczytu"); 
    
    public static void main(String[] args) {
        new PasekMenu().setVisible(true);
    }
    
}

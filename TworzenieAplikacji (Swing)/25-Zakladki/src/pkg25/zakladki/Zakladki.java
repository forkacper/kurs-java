package pkg25.zakladki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Zakladki extends JFrame {
        
    public Zakladki() { 
        initComponents();
    }
    
    public void initComponents() {
        this.setTitle("Zakladki");
        this.setBounds(300, 300, 300, 200);
        
        zakladki.addTab("tab 1", new JLabel("To jest pierwszy"));
        zakladki.setMnemonicAt(0, KeyEvent.VK_T );
        
        JPanel panel = new JPanel();
        panel.add(new JButton("Tescior"));
        zakladki.addTab("tab 2", new ImageIcon("test.jpg"), panel, "Testowy test");
        
        zakladki.addTab("Video kurs", panelTworzenia);
        panelTworzenia.add(new JLabel("Stworz nowy plik o nazwie"));
        JTextField nazwaNowejZakladki = new JTextField(7);
        panelTworzenia.add(nazwaNowejZakladki);
        JButton stworzZakladke = new JButton("Stworz");
        panelTworzenia.add(stworzZakladke);
        
        stworzZakladke.addActionListener((ActionEvent e) -> {
            JPanel panelTekstowy = new JPanel();
            panelTekstowy.setLayout(new GridLayout(1, 1));
            JTextArea obszarTekstowy = new JTextArea();
            panelTekstowy.add(new JScrollPane(obszarTekstowy));
            
            zakladki.addTab(nazwaNowejZakladki.getText()+".txt", panelTekstowy);
            zakladki.setSelectedIndex(zakladki.getTabCount()-1);
            
            obszarTekstowy.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                      if(!(tytulZakladki+e.getKeyChar()).equals(przedZmianaObszaruTekstowego) && czyToAscii(e.getKeyChar()) && flagaZapisu) {
                          przedZmianaObszaruTekstowego = tytulZakladki+e.getKeyChar();
                          zakladki.setTitleAt(indeksZakladki, tytulZakladki+"*");
                          flagaZapisu = false;                          
                      } else if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_S && !flagaZapisu) {
                          zakladki.setTitleAt(indeksZakladki, tytulZakladki);
                          System.out.println("Zapisujemy");
                          flagaZapisu = true;
                      }
                      
                }
                
                private boolean czyToAscii(char zn) {
                    for(int i = 0; i < 255; i++)
                        if (zn == i)
                            return true;
                    
                    return false;
                }
                
                String przedZmianaObszaruTekstowego = "";
                int indeksZakladki = zakladki.getSelectedIndex();
                String tytulZakladki = zakladki.getTitleAt(indeksZakladki);
                boolean flagaZapisu = true;
                
            });
        });
     
        zakladki.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        this.getContentPane().add(zakladki);
        this.setDefaultCloseOperation(3);
    }
    private JTabbedPane zakladki = new JTabbedPane();
    private JPanel panelTworzenia = new JPanel();
    
    
    public static void main(String[] args) {
        new Zakladki().setVisible(true);
    }
    
}

package pkg27.panele.dzielone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class PaneleDzielone extends JFrame {

    public PaneleDzielone() {
        initComponents();
    }
    
    public void initComponents() {
        this.setTitle("Panele dzielone");
        this.setBounds(300, 300, 300, 200);
        
        panelListy.add(lista);
        panelObrazka.add(obrazek);
        panelOpisu.add(opis);  
        
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) {
                Obrazek img = (Obrazek) ((JList)e.getSource()).getSelectedValue();
                obrazek.setIcon(img.getImage());
                opis.setText(img.getDescription()) ;
            }
        });
        JSplitPane podzielenie = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelListy, panelObrazka);
        
        JSplitPane podzielenieGlowne = new JSplitPane(JSplitPane.VERTICAL_SPLIT, podzielenie, panelOpisu);
        
        
        this.getContentPane().add(podzielenieGlowne);
        this.setDefaultCloseOperation(3);
    }
    JPanel panelListy = new JPanel();
    JPanel panelObrazka = new JPanel();
    JPanel panelOpisu = new JPanel();
    JList lista = new JList(new Obrazek[]{
        new Obrazek("niebieski", "piękny kolorek niebieski"),
        new Obrazek("czerwony", "piękny kolorek czerwony"),
        new Obrazek("zielony", "piękny kolorek zielony"),
    });
    JLabel obrazek = new JLabel();
    JLabel opis = new JLabel();
     
    private class Obrazek {
        public Obrazek(String nazwa, String opis) {
            this.nazwa = nazwa;
            this.opis = opis; 
            
            obrazek = new ImageIcon(nazwa+".gif");
        }
        
        public String toString() {
            return nazwa;
        }
        
        public ImageIcon getImage() {
            return obrazek;
        }
        
        public String getDescription() {
            return opis;
        }  
        
        
        String nazwa, opis;
        ImageIcon obrazek;
    }
    
    
    
    public static void main(String[] args) {
        new PaneleDzielone().setVisible(true);
    }
    
}

package pkg23.listy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Listy extends JFrame {

    public Listy() {
        initComponents();
    }
    
    public void initComponents() {
        this.setTitle("Listy");
        this.setBounds(300, 300, 300, 200);
    //        String [] nazwa = new String[] {"123", "222"};

        listaPrzedmiotow.setVisibleRowCount(4);
//        listaPrzedmiotow.setFixedCellHeight(35);
//        listaPrzedmiotow.setFixedCellWidth(200);
        listaPrzedmiotow.setSelectionBackground(Color.BLUE);
        listaPrzedmiotow.setSelectionForeground(Color.GREEN);
        
//        listaPrzedmiotow.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        listaPrzedmiotow.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        listaPrzedmiotow.addListSelectionListener((ListSelectionEvent e) -> {
            System.out.println("Zmieniłem się");
            
            if (e.getValueIsAdjusting()) System.out.println("Trzymam button myszy");
            else System.out.println("Puściłem button myszy");
            
            if(!e.getValueIsAdjusting()) {
                Object[] wartosciWLiscie = ((JList)e.getSource()).getSelectedValues();
                
                String przedmioty = "";
                
                for (int i = 0; i < wartosciWLiscie.length; i++){
                    przedmioty += (String)wartosciWLiscie[i] + " ";
                    System.out.println(przedmioty);
                    
                    komunikat.setText("Nie lubie następujących przedmiotów: " + przedmioty);
                }
            }
        }); 
        
        DefaultListModel modelListy = new DefaultListModel();
        
        String[] tekst = new String[] {"Matematyka", "Fizyka", "Informatyka", "Biologia", "Chemia", "WOS", "PO", "Historia"};
        

        
               
        modelListy.addElement("k");
        modelListy.addElement("g");
        modelListy.addElement("h");
        
        JList lista2 = new JList(modelListy);
       
        lista2.addListSelectionListener((ListSelectionEvent e) -> {
//            modelListy.removeAllElements();
            for(int i = 0; i < tekst.length; i++) {
                modelListy.addElement(tekst[i]);
            }
        });
        
        
        panelListy.add(scrollListy);
        panelKomunikatu.add(komunikat);
        
        this.getContentPane().add(panelListy, BorderLayout.NORTH);
        this.getContentPane().add(panelKomunikatu, BorderLayout.CENTER);
        this.getContentPane().add(lista2, BorderLayout.SOUTH);
//        this.getConte ntPane().add(listaPrzedmiotow);
        this.setDefaultCloseOperation(3);
    }
    
    private JList listaPrzedmiotow = new JList(new String[] {"Matematyka", "Fizyka", "Informatyka", "Biologia", "Chemia", "WOS", "PO", "Historia"});
    private JScrollPane scrollListy = new JScrollPane(listaPrzedmiotow);
    private JPanel panelListy = new JPanel();
    private JPanel panelKomunikatu = new JPanel();
    private JLabel komunikat = new JLabel();
    
    public static void main(String[] args) {
        new Listy().setVisible(true);
    }
    
}

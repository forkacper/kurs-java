package pkg23.listy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
//        listaPrzedmiotow.set

        panelListy.add(scrollListy);
        
        this.getContentPane().add(panelListy, BorderLayout.NORTH);
//        this.getConte ntPane().add(listaPrzedmiotow);
        this.setDefaultCloseOperation(3);
    }
    
    private JList listaPrzedmiotow = new JList(new String[] {"Matematyka", "Fizyka", "Informatyka", "Biologia", "Chemia", "WOS", "PO", "Historia"});
    private JScrollPane scrollListy = new JScrollPane(listaPrzedmiotow);
    private JPanel panelListy = new JPanel();
    
    public static void main(String[] args) {
        new Listy().setVisible(true);
    }
    
}

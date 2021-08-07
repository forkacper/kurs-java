/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.obszar.tekstowy;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author kacper-test
 */
public class ObszarTekstowy extends JFrame {
    
    public ObszarTekstowy() {
        this.setTitle("12 - Obszar tekstowy");
        this.setBounds(300, 300, 300, 300);
        
        initComponents();
        
        this.setDefaultCloseOperation(3);
    }
    
    public void initComponents() {
        
        panelSzukania.add(znajdz);
        panelSzukania.add(szukany);
        panelSzukania.add(etykieta1);
        panelSzukania.add(zamien);
        panelSzukania.add(etykieta2);
        panelSzukania.add(nowyTekst);
        
//        obszarTekstowy.selectAll(); -- zaznacza cały tekst
//        obszarTekstowy.select(0, 2); -- zaznacza obszar od do
//        obszarTekstowy.replaceSelection("Lalalal"); -- zamienia zaznaczony aktualnie obszar
//        obszarTekstowy.replaceRange("lalala", 0, 2); -- zmienia tekst w zasięgu (podobne do select i replace selection)
//        obszarTekstowy.insert(" Jakiś tam ", 18);
//        obszarTekstowy.append("Dołączone do końca");
//        obszarTekstowy.select(obszarTekstowy.getText().indexOf("test"), obszarTekstowy.getText().indexOf("test"));
        znajdz.addActionListener(new znajdowanieHendler());
        zamien.addActionListener(new zamienHendler());
        this.getContentPane().add(panelSzukania, BorderLayout.CENTER);
        this.getContentPane().add(obszarPrzewijania, BorderLayout.NORTH);
    }
    
    private class zamienHendler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(obszarTekstowy.getSelectionStart() != obszarTekstowy.getSelectionEnd()) {
                zamien();
            }
            else {
                znajdz.doClick();
                if(obszarTekstowy.getSelectionStart() != obszarTekstowy.getSelectionEnd())
                    zamien();
            }
            
            
        }
        
        private void zamien() {
            obszarTekstowy.requestFocus();
            int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy chcesz zamienić? " + szukany.getText() + " na " + nowyTekst.getText(), "Uwaga nastąpi zmiana!", JOptionPane.YES_NO_OPTION);
            if(opcja == 0)
            obszarTekstowy.replaceRange(nowyTekst.getText(), obszarTekstowy.getSelectionStart(), obszarTekstowy.getSelectionEnd());
        }
        
        
    }
    
    private class znajdowanieHendler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            poczatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText(), poczatekSzukanego + szukany.getText().length());
            System.out.println(poczatekSzukanego);

            if(poczatekSzukanego == -1)
                poczatekSzukanego = obszarTekstowy.getText().indexOf(szukany.getText());
            
            if(poczatekSzukanego >= 0 && szukany.getText().length() > 0) {
                obszarTekstowy.requestFocus();
                obszarTekstowy.select(poczatekSzukanego, poczatekSzukanego + szukany.getText().length());
            }
        }
        
       
        
        private int poczatekSzukanego = 0;
    }
    
    
    
    private JTextArea obszarTekstowy = new JTextArea("To jest testowy tekst", 7, 10);
    private JScrollPane obszarPrzewijania = new JScrollPane(obszarTekstowy);
    
    private JPanel panelSzukania = new JPanel();
    
    private JButton znajdz = new JButton("Znajdź");
    private JLabel etykieta1 = new JLabel("i");
    private JButton zamien = new JButton("zamien");
    private JLabel etykieta2 = new JLabel("na");
    
    private JTextField nowyTekst = new JTextField(4);
    private JTextField szukany = new JTextField(5);
    
    
    public static void main(String[] args) {
        new ObszarTekstowy().setVisible(true);
    }
    
}

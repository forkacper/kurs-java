package pkg26.wewnetrzne.ramki;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class WewnetrzneRamki extends JFrame {

    public WewnetrzneRamki() {
        initComponents();
    }
     
    public void initComponents() {
        this.setTitle("Wewnętrzne ramki");
        this.setBounds(300, 300, 300, 200);
     
        JInternalFrame wewnRamka = new JInternalFrame("Tytuł rameczki", true, true, true, true);
        wewnRamka.add(new JButton("TEST"), BorderLayout.NORTH);
        wewnRamka.setVisible(true);
        wewnRamka.pack();
//        wewnRamka.setFrameIcon(icon);

        JInternalFrame wewnRamka2 = new JInternalFrame("Tytuł rameczki", true, true, true, true);
        wewnRamka2.add(new JLabel(" inny TEST"), BorderLayout.NORTH);
        wewnRamka2.setVisible(true);
        wewnRamka2.pack();
        wewnRamka.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        
        wewnRamka.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                System.out.println("Otwarte");
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                String odp = JOptionPane.showInternalInputDialog(e.getInternalFrame(), "Wpisz 'wyjscie' by wyjsc z programu, lub za 'zamknij' by zamknac tylko ramke");
                
                if (odp != null) 
                    if (odp.equals("wyjscie"))
                        System.exit(0);
                    else if (odp.equals("zamknij"))
                        e.getInternalFrame().dispose(); 
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                System.out.println("zamkniete");
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
                System.out.println("minimalizacja");
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
                System.out.println("maksymalizacja");
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
                System.out.println("aktywacja");
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                System.out.println("dezaktywacja");
            }
            
        });

        desktopPane.add(wewnRamka);
        desktopPane.add(wewnRamka2 );
        
        this.getContentPane().add(desktopPane, BorderLayout.CENTER);
        this.setDefaultCloseOperation(3);
    }
    
    private JDesktopPane desktopPane = new JDesktopPane();
    
    public static void main(String[] args) {
        new WewnetrzneRamki().setVisible(true);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10.wlasnemenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author kacper-test
 */
public class WlasneMenu extends JFrame {

    public WlasneMenu() {
        initComponents();
    }
    public void initComponents() {
        this.setTitle("Własne menu");
        this.setBounds(300, 300, 300, 200);
        
        panelMenu.setLayout(new GridLayout(3, 1));
        panelMenu.add(menu1);
        panelMenu.add(menu2);
        panelMenu.add(menu3);
                
        kontener.add(panelMenu);
        this.setDefaultCloseOperation(3);
    }
    
    private Container kontener = this.getContentPane();
    private JPanel panelMenu = new JPanel();
    private MenuButton menu1 = new MenuButton("1. Dodaj");
    private MenuButton menu2 = new MenuButton("2. Usuń");
    private MenuButton menu3 = new MenuButton("3. Zmień");
    private int i = 0;
    
    
    private class MenuButton extends JButton implements FocusListener, ActionListener {
        public MenuButton(String nazwa) {
            super(nazwa);
            this.addFocusListener(this);
            this.addActionListener(this);
            this.setBackground(kFocusLost);
            
            this.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    keyPressedHandler(e);
                }
            });
        }

        @Override
        public void focusGained(FocusEvent e) {
            this.setBackground(kFocusGained);
        }

        @Override
        public void focusLost(FocusEvent e) {
            this.setBackground(kFocusLost);
        }
        
        private void keyPressedHandler(KeyEvent e) {
            int dlMenu = panelMenu.getComponentCount();
            
            if(i == 0) i = dlMenu;
            
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                panelMenu.getComponent(++i  % dlMenu).requestFocus();
            }
            if(e.getKeyCode() == KeyEvent.VK_UP) {
                panelMenu.getComponent(--i  % dlMenu).requestFocus();
            }
            if(e.getKeyCode() == KeyEvent.VK_ENTER) {
//                MenuButton tmp = (MenuButton)e.getSource();
                ((MenuButton)e.getSource()).doClick();
            }
        }
        
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(this, ((MenuButton)e.getSource()).getText());
        }
        
        private Color kFocusGained = Color.RED;
        private Color kFocusLost = Color.BLUE;
    }
    
    public static void main(String[] args) {
        new WlasneMenu().setVisible(true);
    }
    
}

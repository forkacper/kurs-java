/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00.test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author kacper-test
 */
public class Test extends JFrame{

    public Test() {
        this.setTitle("Przypomnienie");
        initComponents();
        frameCenter();
        this.setDefaultCloseOperation(3);
    }
    public void frameCenter() {
        int szer = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wys = Toolkit.getDefaultToolkit().getScreenSize().height;
        
        this.setSize(szer / 2, wys / 2);
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;
        this.setLocation((szer - szerRamki) / 2, (wys - wysRamki) / 2);
    }
    
    
    public void initComponents() {
        
    
        
    }
    
    JPanel panel = new JPanel();
    
    public static void main(String[] args) {
        new Test().setVisible(true);
    }
    
}

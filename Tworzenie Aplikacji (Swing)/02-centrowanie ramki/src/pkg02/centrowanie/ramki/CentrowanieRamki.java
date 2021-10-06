package pkg02.centrowanie.ramki;

import javax.swing.*;
import java.awt.*;

public class CentrowanieRamki extends JFrame {

    public CentrowanieRamki() {
        
        //Pobranie szerokosci i wysokosci ekranu
        int szer = Toolkit.getDefaultToolkit().getScreenSize().width;
        int wys = Toolkit.getDefaultToolkit().getScreenSize().height;
        
        //Ustawienie wymiarów ramki
        this.setSize(szer / 2, wys / 2);
//        this.setLocation(szer / 4, wys / 4);


        //Uniwersalny kod do centrowania ramki
        int szerRamki = this.getSize().width;
        int wysRamki = this.getSize().height;
        this.setLocation((szer - szerRamki) / 2, (wys - wysRamki) / 2);
        
                
        this.setDefaultCloseOperation(3);
    }
    
    public static void main(String[] args) {
        new CentrowanieRamki().setVisible(true);
    }
    
}

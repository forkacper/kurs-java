package pkg24.spinners.i.troche.cwiczen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;

public class Main extends JFrame {

    public Main() {
        initComponents();
    }
    
    public void initComponents() {
        this.setTitle("Spinners");
        this.setBounds(300, 300, 300, 200);
    
        String [] miesiace = new DateFormatSymbols().getMonths();
        
        MySpinnerListModel modelMiesiecy = new MySpinnerListModel(miesiace);
        JSpinner spinner = new JSpinner(modelMiesiecy);
//        spinner.setEditor(new JTextArea("lala"));
        
        
        SpinnerNumberModel modelLiczb = new SpinnerNumberModel(1, 1, 5, 2);
        JSpinner spinner2 = new JSpinner(modelLiczb);
        
        
        Calendar kalendarz = Calendar.getInstance();
//        System.out.println(kalendarz);
        Date poczatkowaWartosc = kalendarz.getTime();
        kalendarz.add(Calendar.DAY_OF_MONTH, -20);
        Date minimalnaWartosc = kalendarz.getTime();
        kalendarz.add(Calendar.DAY_OF_MONTH, 40);
        Date maksymalnaWartosc = kalendarz.getTime();
        
        
        SpinnerDateModel modelDat = new SpinnerDateModel(poczatkowaWartosc, minimalnaWartosc, maksymalnaWartosc, Calendar.DAY_OF_MONTH);
        JSpinner spinner3 = new JSpinner(modelDat);
        
        JPanel panel = new JPanel();
        panel.add(spinner);
        panel.add(spinner2);
        panel.add(spinner3);
        
        this.getContentPane().add(panel, BorderLayout.CENTER);
        
        this.setDefaultCloseOperation(3);
    }
    
    private class MySpinnerListModel extends SpinnerListModel {
        public MySpinnerListModel(Object[] values) {
            super(values);
            
            firstValue = values[0];
            lastValue = values[values.length-1];
        }
        
        Object firstValue, lastValue;
    }
    
    public static void main(String[] args) {
        new Main().setVisible(true);
    }
    
}

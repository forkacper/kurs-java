/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.dziedziczenie;
import pkg12.dziedziczenie.potwory.Potwor;

/**
 *
 * @author kacper-test
 */
public class Pajak extends Potwor {
    void funk() {
        this.predkoscChodzenia = 10;
    }

    @Override
    protected void opisPotwora() {
        System.out.println("Fajny Pajak");
    }
}

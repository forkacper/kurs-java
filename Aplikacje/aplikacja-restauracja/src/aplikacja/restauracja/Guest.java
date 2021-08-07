/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikacja.restauracja;

/**
 *
 * @author kacper-test
 */
public class Guest {
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;
    
   public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
    this.name = name;
    this.meal = meal;
    this.phoneNumber = phoneNumber;
    this.isVegan = isVegan;
}
      
    public String getname() {
        return name;
    }
    
    public String getMeal() {
        return meal;
    }
    
    public int getPhoneNumber() {
        return phoneNumber;
    }
    
    public boolean isVegan() {
        return isVegan;
    }

    public void displayGuestInformation() {
        System.out.println("Imie: " + name);
        System.out.println("Preferowany posiłek: " + meal);
        System.out.println("Numer telefonu: " + phoneNumber);
        
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println("Czy weganin: " + isVeganString);        
    }
}

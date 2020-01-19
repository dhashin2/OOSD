/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeautogaloree;

/**
 *
 * @author Brooke Baldwin
 */
public class Sales {
    
    public double discount(double itemPrice){
        double discount = (itemPrice * 0.10);
        double finalPrice = itemPrice - discount;
        return finalPrice;
    }
    
    public double GST(double itemPrice){
        double finalPrice = (itemPrice * 0.06) + (itemPrice);
        return finalPrice;
    }
    
    public double BuyCycle(double itemPrice, double userBalance){
        double sale = userBalance - itemPrice;
        return sale;
    }
}

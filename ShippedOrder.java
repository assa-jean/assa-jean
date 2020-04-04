/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useorder;

/**
 *
 * @author hp
 */
public class ShippedOrder extends Order{
    
    static void compute_total_price(){
        total_price = ((quantity_ordered*unit_price)+4);
        System.out.println("The shipping price is: " +total_price);
    }
  
}

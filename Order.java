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
import java.util.Scanner;
public class Order {
   static String customer_name;
   static int customer_number;
   static int quantity_ordered;
   static int unit_price;
   static int total_price;
    
    void get(){
        
    
    }
    static void set(){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Please enter your name: ");
        customer_name = input.next();
        
        System.out.print("Please enter your number: (+237)");
        customer_number = input.nextInt();
        
        System.out.print("How many item do you want to orders?: ");
        quantity_ordered = input.nextInt();
        
        System.out.print("What's the Unit price?: ");
        unit_price = input.nextInt();
    
    }
    
    static void comput_total_price(){
        total_price = (quantity_ordered*unit_price);
    }
    static void display(){
        
        System.out.println("The Total price of the item is :" +total_price);
    }
}

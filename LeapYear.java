/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useyear;

/**
 *
 * @author hp
 */
public class LeapYear extends Year {
    static int number_day_year; 
    public LeapYear(int number_day_year) {
        super(number_day_year);
    }
  static void get(){
       System.out.println(number_day_year=366);
   }
    
    
}

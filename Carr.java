/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usevehicle;

/**
 *
 * @author hp
 */
public class Carr extends Vehicle{
    static int average = 4;

    public Carr(int number, int average) {
        super(number, average);
    }
    static void display(){
        System.out.println("The miles-per-gallon for Car is :" +average);
    }
  
}

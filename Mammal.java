/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig3;

import java.util.Scanner;

/**
 *
 * @author Shimaa Ahmed
 */
public class Mammal implements animal {

    @Override
    public void eat() {
        System.out.println("mammal_11 eat");
        
    }

    @Override
    public void travel() {
        System.out.println("mammal_22 travel");
        
    }
    public int NoOfLegs()
    {
        return 0;
    }
    public String FavFood()
    {
        return " ";
    }
    
}

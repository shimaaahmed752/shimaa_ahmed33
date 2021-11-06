/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shimaa Ahmed
 */
public class Ball implements Tossable {
    
    public String BrandName;

    @Override
    public void toss() {
        System.out.println("toss");
    }

    public Ball(String BrandName) {
        this.BrandName = BrandName;
    }
    public String getBrandName()
    {
        return BrandName;
    }
public  void bounce()
{
    
}
    
    
    
}

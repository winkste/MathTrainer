/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import settings.TestSettings;

/**
 *
 * @author stephan_wink
 */
public class MinusOp extends MathOps
{
    
    public MinusOp(int tests, int allowedFailures)
    {
        super(tests, allowedFailures);
    }
    
    public MinusOp(int tests, int allowedFailures, TestSettings settings)
    {
        super(tests, allowedFailures, settings);
    }
    
    public void calculateNextTest()
    {
        int localFirst;
        int localSecond;
        
        localFirst = super.getRandomNumberInRange(super.settings.getFirstMin(), 
                                                  super.settings.getFirstMax());
        localSecond = super.getRandomNumberInRange(super.settings.getSecondMin(), 
                                                  super.settings.getSecondMax());
        
        this.first = Math.max(localFirst, localSecond);
        this.second = Math.min(localFirst, localSecond);
               
        this.result = first - second;
        this.actualTest++;
    }

    
    public String getOperation()
    {
        return(this.first + " - " + this.second + " = ");
    }
}

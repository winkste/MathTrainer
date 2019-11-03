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
public class PlusOp extends MathOps
{
    
    public PlusOp(int tests, int allowedFailures)
    {
        super(tests, allowedFailures);
    }
    
    public PlusOp(int tests, int allowedFailures, TestSettings settings)
    {
        super(tests, allowedFailures, settings);
    }
    
    @Override
    public void calculateNextTest()
    {
        this.first = super.getRandomNumberInRange(super.settings.getFirstMin(), 
                                                  super.settings.getFirstMax());
        this.second = super.getRandomNumberInRange(super.settings.getSecondMin(), 
                                                  super.settings.getSecondMax());
        this.result = first + second;
        this.actualTest++;
    }

    
    @Override
    public String getOperation()
    {
        return(this.first + " + " + this.second + " = ");
    }
}

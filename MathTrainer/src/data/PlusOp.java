/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Random;

/**
 *
 * @author stephan_wink
 */
public class PlusOp extends MathOps
{
    
    public PlusOp(int maxCorrTests)
    {
        super(maxCorrTests);
    }
    
    public PlusOp(int maxCorrTests, int firstMin, int firstMax, int secondMin, int secondMax)
    {
        super(maxCorrTests);
    }
    
    @Override
    public void calculateNextTest()
    {
        this.first = super.getRandomNumberInRange(super.firstMin, super.firstMax);
        this.second = super.getRandomNumberInRange(super.secondMin, super.secondMax);
        this.result = first + second;
        this.actualTest++;
    }

    
    @Override
    public String getOperation()
    {
        return(this.first + " + " + this.second + " = ");
    }
}

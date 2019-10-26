/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author stephan_wink
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author stephan_wink
 */
public abstract class MathOps 
{
    protected int first;
    protected int second;
    protected int result;
    protected int correctTests;
    protected int maxCorrTests;
    protected int actualTest;
    protected int firstMin;
    protected int firstMax;
    protected int secondMin;
    protected int secondMax;
    
    
    public MathOps(int maxCorrTests)
    {
        this.first = 0;
        this.second = 0;
        this.result = 0;
        this.correctTests = 0;
        this.maxCorrTests = maxCorrTests;
        this.actualTest = 0;
        this.firstMin = 10;
        this.firstMax = 20;
        this.secondMin = 0;
        this.secondMax = 10;       
    }
    
    public MathOps(int maxCorrTests, int firstMin, int firstMax, int secondMin, int secondMax)
    {
        this(maxCorrTests);
        this.firstMin = firstMin;
        this.firstMax = firstMax;
        this.secondMin = secondMin;
        this.secondMax = secondMax;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getResult() {
        return result;
    }
    
    
    public boolean validateResult(int result)
    {
        System.out.println(this.result == result);
        return(this.result == result);
    }
    
    public boolean isTestCycleCompleted()
    {
        return(this.actualTest >= this.maxCorrTests);
    }
    
    
    
    protected int getRandomNumberInRange(int min, int max) 
    {
        if (min >= max) 
        {
                throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    
    public abstract void calculateNextTest();
    public abstract String getOperation();
    
}


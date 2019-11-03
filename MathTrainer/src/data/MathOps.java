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
import settings.TestSettings;

/**
 *
 * @author stephan_wink
 */
public abstract class MathOps 
{
    protected int first;
    protected int second;
    protected int result;
    
    protected int tests;
    protected int correctTests;
    protected int allowedFailures;
    protected int actualTest;
    
    protected TestSettings settings;
    
    
    public MathOps(int tests, int allowedFailures)
    {
        this.first = 0;
        this.second = 0;
        this.result = 0;
        
        this.tests = tests;
        this.correctTests = 0;
        this.allowedFailures = allowedFailures;
        this.actualTest = 0;
        
        this.settings = new TestSettings();      
    }
    
    public MathOps(int tests, int allowedFailures, TestSettings settings)
    {
        this(tests, allowedFailures);
        this.settings = settings;
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
        
        if(this.result == result)
        {
            this.correctTests++;
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
    public boolean isTestCycleCompleted()
    {
        return(this.actualTest >= this.tests);
    }
    
    public boolean isTestCyclePassed()
    {
        return((this.tests - this.correctTests) <= this.allowedFailures);
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

    public int getActualTests() 
    {
        return(this.actualTest);
    }

    public int getTests() 
    {
        return(this.tests);
    }
    
    
    
    public abstract void calculateNextTest();
    public abstract String getOperation();
    
}


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
public class MinusOp 
{
    private int first;
    private int second;
    private int result;
    private int correctTests;
    private int maxCorrTests;
    private int actualTest;
    
    public MinusOp(int maxCorrTests)
    {
        this.first = 0;
        this.second = 0;
        this.result = 0;
        this.correctTests = 0;
        this.maxCorrTests = maxCorrTests;
        this.actualTest = 0;
    }
    
    public void calculateNextTest()
    {
        this.first = getRandomNumberInRange(10, 20);
        this.second = getRandomNumberInRange(0, 10);
        this.result = first - second;
        this.actualTest++;
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
    
    public String getOperation()
    {
        return(this.first + " - " + this.second + " = ");
    }
    
    public boolean validateResult(int result)
    {
        return(this.result == result);
    }
    
    public boolean isTestCycleCompleted()
    {
        return(this.actualTest >= this.maxCorrTests);
    }
    
    
    
    private int getRandomNumberInRange(int min, int max) 
    {
        if (min >= max) {
                throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
	}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings;

/**
 *
 * @author stephan_wink
 */
class TestSettings
{
    private boolean testActive;
    private int firstMin;
    private int firstMax;
    private int secondMin;
    private int secondMax;

    public TestSettings() {
        this.testActive = false;
    }

        

    public TestSettings(boolean testActive, int firstMin, int firstMax, int secondMin, int secondMax){
        this.testActive = testActive;
        this.firstMin = firstMin;
        this.firstMax = firstMax;
        this.secondMin = secondMin;
        this.secondMax = secondMax;
    }

    public boolean isTestActive() {
        return testActive;
    }

    public int getFirstMin() {
        return firstMin;
    }

    public int getFirstMax() {
        return firstMax;
    }

    public int getSecondMin() {
        return secondMin;
    }

    public int getSecondMax() {
        return secondMax;
    }   
}

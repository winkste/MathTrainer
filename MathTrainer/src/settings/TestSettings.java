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
public class TestSettings
{
    private boolean testActive;
    private TestLevel testLevel;

    public TestSettings() 
    {
        this.testActive = false;
        this.testLevel = new TestLevel(0);
    }

    public TestSettings(boolean active, int testLevel) 
    {
        this();
        this.testActive = active;
        this.testLevel = new TestLevel(testLevel);   
    }

    public boolean isTestActive() {
        return testActive;
    }

    public int getFirstMin() {
        return this.testLevel.getFirstMin();
    }

    public int getFirstMax() {
        return this.testLevel.getFirstMax();
    }

    public int getSecondMin() {
        return this.testLevel.getSecondMin();
    }

    public int getSecondMax() {
        return this.testLevel.getSecondMax();
    }  
    
    public int getTestTimeInSecs() {
        return this.testLevel.getTestTimeInSecs();
    }
    
    class TestLevel
    {
        private int firstMin;
        private int firstMax;
        private int secondMin;
        private int secondMax;
        private int testTimeInSecs;
        private int testLevel;

        private TestLevel(int testLevel) {
            this.testLevel = testLevel;
            switch(this.testLevel)
            {
                case 0:
                    this.firstMin = 0;
                    this.firstMax = 10;
                    this.secondMin = 0;
                    this.secondMax = 10;
                    this.testTimeInSecs = 0;
                    break;
                case 1:
                    this.firstMin = 10;
                    this.firstMax = 20;
                    this.secondMin = 0;
                    this.secondMax = 10;
                    this.testTimeInSecs = 0;
                    break;
                case 2:
                    this.firstMin = 10;
                    this.firstMax = 20;
                    this.secondMin = 0;
                    this.secondMax = 10;
                    this.testTimeInSecs = 30;
                    break;
                case 3:
                    this.firstMin = 10;
                    this.firstMax = 20;
                    this.secondMin = 0;
                    this.secondMax = 10;
                    this.testTimeInSecs = 20;
                    break;
                case 4:
                    this.firstMin = 10;
                    this.firstMax = 90;
                    this.secondMin = 0;
                    this.secondMax = 10;
                    this.testTimeInSecs = 0;
                    break;
                case 5:
                    this.firstMin = 10;
                    this.firstMax = 90;
                    this.secondMin = 0;
                    this.secondMax = 10;
                    this.testTimeInSecs = 30;
                    break;
                case 6:
                    this.firstMin = 10;
                    this.firstMax = 90;
                    this.secondMin = 10;
                    this.secondMax = 20;
                    this.testTimeInSecs = 0;
                    break;
                case 7:
                    this.firstMin = 10;
                    this.firstMax = 90;
                    this.secondMin = 10;
                    this.secondMax = 20;
                    this.testTimeInSecs = 30;
                    break;
                case 8:
                    this.firstMin = 10;
                    this.firstMax = 90;
                    this.secondMin = 10;
                    this.secondMax = 90;
                    this.testTimeInSecs = 30;
                    break;
                default:
                    this.firstMin = 10;
                    this.firstMax = 20;
                    this.secondMin = 0;
                    this.secondMax = 10;
                    this.testTimeInSecs = 0;
                    break;
            }              
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

        public int getTestLevel() {
            return testLevel;
        }

        public int getTestTimeInSecs() {
            return testTimeInSecs;
        }
    }
}

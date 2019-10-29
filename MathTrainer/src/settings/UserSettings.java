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
public class UserSettings 
{
    private String userName;
    private int testsToGameCount;
    
    private TestSettings subs;
    private TestSettings addi;
    private TestSettings mult;
    private TestSettings divi;
    
    public UserSettings(String userName, int testsToGameCount)
    {
        this.userName = userName;
        this.testsToGameCount = testsToGameCount;
        
        subs = new TestSettings(true, 10, 20, 0, 10);
        addi = new TestSettings(true, 10, 20, 0, 10);
        mult = new TestSettings();
        divi = new TestSettings();  
    }  

    public String getUserName() {
        return userName;
    }

    public int getTestsToGameCount() {
        return testsToGameCount;
    }

    public TestSettings getSubs() {
        return subs;
    }

    public TestSettings getAddi() {
        return addi;
    }

    public TestSettings getMult() {
        return mult;
    }

    public TestSettings getDivi() {
        return divi;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stephan_wink
 */
public class UserSets 
{
    private String userName;
    private int testsIdx;  
    private int failuresIdx;  
    private int gameIdx;
    private int subsLevel;
    private int addiLevel;
    private int multLevel;
    private int diviLevel;
    private static final int[] testsLookup = {5, 10, 20, 30};
    private static final int[] failuresLookup = {0, 1, 2, 3};
    private static final String [] gameNamesLookup = {"Snake", "Tetris"};
    private static List<UserSets> users;
    
    
    public UserSets(String userName, int testIdx, int failureIdx, int gameIdx)
    {
        this.userName = userName;
        this.testsIdx = testIdx;
        this.failuresIdx = failureIdx;
        this.gameIdx = gameIdx;
        
        this.subsLevel = 0;
        this.addiLevel = 0;
        this.multLevel = 0;
        this.diviLevel = 0; 
    }  

    public String getUserName() {
        return userName;
    }

    public int getIndexToTestsLookup() {
         return(this.testsIdx);
    }
        
    public void setIndexToTestsLookup(int testCountIndex) {
        this.testsIdx = testCountIndex;
    }
    
    public int getTests()
    {
        return(this.testsLookup[this.testsIdx]);
    }
    
    public static int[] getTestsLookup() {
        return testsLookup;
    }
    
   
    public int getIndexToFailuresLookup() {
        return(this.failuresIdx);
    }
        
    public void setIndexToFailuresLookup(int failureIndex) {
        this.failuresIdx = failureIndex;
    }
    
    public int getFailures()
    {
        return(this.failuresLookup[this.failuresIdx]);
    }
    
    public static int[] getFailuresLookup() {
        return failuresLookup;
    }
    
    public int getIndexToGameLookup() {
        return(this.gameIdx);
    }
    
    public void setIndexToGameLookup(int index) {
        this.gameIdx = index;
    }  
    
    public static String[] getGamesLookup() {
        return gameNamesLookup;
    }
    
    public int getSubLevel() {
        return(this.subsLevel);
    }

    public void setSubsLevel(int subsLevel) {
        this.subsLevel = subsLevel;
    }
    
    public TestSettings getSubstractionTestSet() {
        return(new TestSettings(true, this.subsLevel));
    }
    
    public int getAddLevel() {
        return(this.addiLevel);
    }

    public void setAddiLevel(int addiLevel) {
        this.addiLevel = addiLevel;
    }
    
    public TestSettings getAdditionTestSet() {
        return(new TestSettings(true, this.addiLevel));
    }

    public int getDivLevel() {
        return(this.diviLevel);
    }
        
    public void setDivLevel(int diviLevel) {
        this.diviLevel = diviLevel;
    }
    
    public TestSettings getDivisionTestSet() {
        return(new TestSettings());
    }

    public int getMulLevel() {
        return(this.multLevel);
    }
        
    public void setMulLevel(int multLevel) {
        this.multLevel = multLevel;
    }
    
    public TestSettings getMultiplicationTestSet() {
        return(new TestSettings());
    }
    
    public static List<UserSets> LoadUserSettingsFromFile()
    {
        if(null == UserSets.users)
        {
            UserSets user;
            UserSets.users = new ArrayList();
            user = new UserSets("Lily", 0, 0, 0); 
            UserSets.users.add(user);
            user = new UserSets("Stephan", 0, 0, 0);   
            UserSets.users.add(user);
        }
        
        return(UserSets.users);
    }
    
    public static void StoreUserSettingsToFile(List<UserSets> users)
    {
        UserSets.users = users;
    }
}

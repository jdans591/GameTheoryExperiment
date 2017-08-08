/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametheoryexperiment;

import java.util.Random;

/**
 *
 * @author Dhanasit
 */
public class Urns {
    
    private int noRedBall1 = 0;
    private int noBlueBall1 = 0;
    
    private int noRedBall2 = 0;
    private int noBlueBall2 = 0;
    
    
    
    private static final int TOTALNUMBER = 100;
    
    public Urns() {
        Random red1 = new Random();
        Random red2 = new Random();
        int numberRed1 = red1.nextInt(21);
        int numberRed2 = red2.nextInt(21);
        
        noRedBall1 = 60 + numberRed1;
        noRedBall2 = 20 + numberRed2;
        noBlueBall1 = 100 - noRedBall1;
        noBlueBall2 = 100 - noRedBall2;
        
    }
    
    public int getNoRedBall1() {
       return this.noRedBall1; 
    }
     public int getNoRedBall2() {
        return this.noRedBall2;
    }
      public int getNoBlueBall1() {
        return this.noBlueBall1;
    }
       public int getNoBlueBall2() {
        return this.noBlueBall2;
    }
    
    
}

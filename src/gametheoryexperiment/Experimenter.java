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
public class Experimenter {
    
    private Urns urns;
    
    
    
    public Experimenter(Urns urns) {
        this.urns = urns;
    }
    
    public int pickUrn() {
        Random random = new Random();
        int number = random.nextInt(2);
        if(number == 0) {
            return 1;
        } else {
            return 2;
        }
    }
    
    public String pickBallColour(int urnNumber) {
        
        if(urnNumber != 1 && urnNumber != 2) {
            return "";
        }
        
        Random random = new Random();
        int number = random.nextInt(101);
        
        
        if(urnNumber == 1) {
            if(number <= urns.getNoRedBall1()) {
                return "red";
            } else {
                return "blue";
            }
        } else {
            if(number <= urns.getNoRedBall2()) {
                return "red";
            } else {
                return "blue";
            }
        }
        
       
    }
    
    public String makeDecision1(String ballColour) {
       return ballColour;
    }
    
    public String makeDecision2(String ballColour) {
       return "blue";
    }
      
      
}

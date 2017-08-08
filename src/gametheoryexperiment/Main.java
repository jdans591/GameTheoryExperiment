/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametheoryexperiment;

import java.util.ArrayList;

/**
 *
 * @author Dhanasit
 */
public class Main {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> decisions = new ArrayList<>();
        ArrayList<Integer> payouts = new ArrayList<>();
        
        Urns urns = new Urns();
        
        Experimenter experimenter = new Experimenter(urns);
        
        String ballColour = "";
        String decision = "";
        int urnNumber = 1;

        for (int j = 0; j < 10000000; j++ ) {
            urnNumber = experimenter.pickUrn();
            for (int i = 0; i < 6; i++) {

                ballColour = experimenter.pickBallColour(urnNumber);
                decision = experimenter.makeDecision2(ballColour);
                decisions.add(decision);
            }

            String groupDecision = calculateDecision(decisions);
            int payout = calculatePayout(groupDecision, ballColour);
            payouts.add(payout);

//            System.out.println("red1 is : " + urns.getNoRedBall1());
//            System.out.println("blue1 is : " + urns.getNoBlueBall1());
//            System.out.println("red2 is : " + urns.getNoRedBall2());
//            System.out.println("blue2 is : " + urns.getNoBlueBall2());
//
//            System.out.println("ballColour is : " + ballColour);
//            System.out.println("decision is : " + decision);
//            System.out.println("urnNumber is : " + urnNumber);
//            System.out.println("groupDecision is : " + groupDecision);
           // System.out.println("payout is : " + payout);
        }
        int sum = 0;
        for(int payout : payouts) {
            sum = sum + payout;
            
        }
        double mean = (double)sum/payouts.size();
        
        System.out.println("mean payout is : " + mean);
    }
    
    public static String calculateDecision(ArrayList<String> decisions) {
        for(String decision : decisions) {
            if(decision.equals("blue")) {
                return "blue";
            }
        }
        return "red";
    }
    
    public static int calculatePayout(String decision, String ballColour) {
        int payout;
        if(decision.equals(ballColour)) {
            payout = 14;
            return payout;
        } else if(decision.equals("red")) {
            payout = 5;
            return payout;
        } else {
            payout = 13;
            return payout;
        }
    }
}

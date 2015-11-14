/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commuter.computer;

import java.util.ArrayList;

/**
 *
 * @author atrain99
 */
public class CommuterComputer {

    private final double MAX_VELOCITY = 7; //Speed limit, feet per second
    private final double ACCELERATION = 9.843; //Acceleration, feet/second
    
    private double time = 0.00D;
    
    private ArrayList<Car> leftLane = new ArrayList<>();
    private ArrayList<Car> rightLane = new ArrayList<>();

    private void run() {
        for (int j = 1; j < 51; j++) {
            Car c = new Car((double) 30*(j-1), MAX_VELOCITY, ACCELERATION, 
                    Math.random()*2 <= 1 ? LeftLaneBehavior.ALLOW_MERGES : LeftLaneBehavior.DISALLOW_MERGES, 
                    Math.random()*2 <= 1 ? RightLaneBehavior.MERGE_EARLY : RightLaneBehavior.MERGE_LATE).setReferenceNumber(Lane.LEFT, j);
            this.leftLane.add(c);
        }
        for (int j = 1; j < 51; j++) {
            Car c = new Car((double) 30*(j-1), MAX_VELOCITY, ACCELERATION, 
                    Math.random()*2 <= 1 ? LeftLaneBehavior.ALLOW_MERGES : LeftLaneBehavior.DISALLOW_MERGES, 
                    Math.random()*2 <= 1 ? RightLaneBehavior.MERGE_EARLY : RightLaneBehavior.MERGE_LATE).setReferenceNumber(Lane.RIGHT, j);
            this.rightLane.add(c);
        }
        
        while(!this.leftLane.isEmpty() || !this.rightLane.isEmpty()){
            for(Car c : this.leftLane){
                
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new CommuterComputer().run();

    }

}

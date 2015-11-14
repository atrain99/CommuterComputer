package commuter.computer;

/**
 *
 * 
 */
public class Car implements Comparable<Car>{
    
    private double position;
    private Lane currentLane;
    private double velocity = 0;
    private double acceleration;
    
    private Lane intialLane;
    private int carID = 0;
    
    private final LeftLaneBehavior left;
    private final RightLaneBehavior right;
    
    public Car(double p, double v, double a, LeftLaneBehavior l, RightLaneBehavior r){
        this.position = p;
        this.acceleration = a;
        this.left = l;
        this.right = r;
    }
    
    /**
     * 
     * @return The car's velocity, in feet/second 
     */
    public double getVelocity(){
        return this.velocity;
    }
    
    /**
     * 
     * @return The car's position on the road, in feet from the finish line
     */
    public double getPosition(){
        return this.position;
    }
    
    public Car setReferenceNumber(Lane lane, int position) throws IllegalArgumentException{
        if(position == 0) throw new IllegalArgumentException("Reference Numbers Cannot Be Zero");
        
        if(this.carID != 0){
            this.intialLane = lane;
            this.carID = position;
            this.currentLane = lane;
        }
            
        return this;
    }

    @Override
    public int compareTo(Car o) {
        if(o.getPosition() < this.position){
            return -1;
        }else if(o.getPosition() > this.position){
            return 1;
        }
        return 0;
    }
}

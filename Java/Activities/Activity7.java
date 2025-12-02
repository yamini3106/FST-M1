package examples;

interface BicycleParts {
    int tyres = 2;       
    int maxSpeed = 40;   }


interface BicycleOperations {
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class Bicycle implements BicycleParts, BicycleOperations {

    protected int gears;
    protected int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

       public void applyBrake(int decrement) {
        currentSpeed -= decrement;
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
    }

   
    public void bicycleDesc() {
        System.out.println("Number of gears: " + gears);
        System.out.println("Max speed: " + maxSpeed);
    }
}

class MountainBike extends Bicycle {

    private int seatHeight;

       public MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    
    public void setHeight(int newHeight) {
        seatHeight = newHeight;
    }

    public void bicycleDesc() {
        super.bicycleDesc();  // call parent description
        System.out.println("Seat height: " + seatHeight);
    }
}



public class Activity7 {
	 public static void main(String[] args) {

	       
	        MountainBike mb = new MountainBike(5, 20, 15);

	       
	        mb.bicycleDesc();       
	        mb.speedUp(10);        
	        mb.applyBrake(5);      

	        System.out.println("Current Speed: " + mb.currentSpeed);

	      
	        mb.setHeight(20);
	        System.out.println("New seat height set!");

	        mb.bicycleDesc();     
	    }


}

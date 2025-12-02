package examples;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {

    private int maxPassengers;
    private ArrayList<String> passengers;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Plane is full! Cannot add more passengers.");
        }
    }

    public Date takeOff() {
        return new Date();
    }
    public void land() {
        lastTimeLanded = new Date();
        passengers.clear();
    }
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
    public ArrayList<String> getPassengers() {
        return passengers;
    }
}



public class Activity6 {
	public static void main(String[] args) {

        Plane plane = new Plane(10);
        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");
        Date takeOffTime = plane.takeOff();
        System.out.println("Plane took off at: " + takeOffTime);

        System.out.println("Passengers onboard: " + plane.getPassengers());

        try {

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Error during sleep.");
        }

        plane.land();
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
    }

}

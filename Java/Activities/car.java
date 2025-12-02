package examples;

public class car {
	String Color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public car() {
		this.tyres=4;
		this.doors=4;
	}

	public void displayCharacteristics() {
		System.out.println("color: " + Color);
		System.out.println("Transmission: " + transmission);
		System.out.println("Make: " + make);
		System.out.println("Tyres: " + tyres);
		System.out.println("Doors: " + doors);
		
	}
	public void accelerate() {
		System.out.println("Car is moving forward.");
	}
	public void brake()
	{
		System.out.println("Car has stopped.");
	}
}


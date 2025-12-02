package examples;

public class Activity1 {
	public static void main(String[] args)
	{
		car c=new car();
		
		c.Color="Red";
		c.transmission ="Automatic";
		c.make=2024;
		
		c.displayCharacteristics();
		c.accelerate();
		c.brake();
	}

}

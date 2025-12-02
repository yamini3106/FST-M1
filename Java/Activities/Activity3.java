package examples;

public class Activity3 {
	public static void main(String[] args)
	{
		double seconds = 1000000000;
		double mer	= 0.2408467;
		double ven	=0.61519726 ;
		double mars=1.8808158 ;
		double jup=11.862615 ;
		double sat=29.447498 ;
		double uran=84.016846 ;
		double nep=164.79132 ;
		double earthsec=31557600 ;
		double earthyr=seconds/earthsec;
		
		System.out.println("Age on Mercury " + earthyr/mer);
		System.out.println("Age on Venus " + earthyr/ven);
		System.out.println("Age on Mars " + earthyr/mars);
		System.out.println("Age on Jupiter " + earthyr/jup);
		System.out.println("Age on saturn " + earthyr/sat);
		System.out.println("Age on Uranus " + earthyr/uran);
		System.out.println("Age on Neptune " + earthyr/nep);

		
		
		
	}

}



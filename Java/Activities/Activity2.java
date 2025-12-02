package examples;

public class Activity2 {

	public static void main(String[] args)
	{
		int[] numbers= {10, 77, 10, 54, -11, 10};
		int sum=0;
		
		for(int n: numbers) {
			if(n==10) {
				sum+=n;
			}
		}
		if(sum==30) {
			System.out.println(true);
		}
				
		else
		{
			System.out.println(false);
		}
			
	}
}

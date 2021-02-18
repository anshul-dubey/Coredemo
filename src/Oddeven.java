import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		
		int a;
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter a numbers:");
		a=s.nextInt();
		
		
		if(a%2==0)
		{
			System.out.println(" Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}

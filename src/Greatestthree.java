import java.util.Scanner;

public class Greatestthree {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		if(a>b && a>c)
		{
		System.out.println(" A is greatest");	
		}
		else if (b>c)
		{
			System.out.println("B is greatest");
		}
		else {
			System.out.println("C is greatest");
		}

	}

}

import java.util.Scanner;

public class Greatesttwo {

	public static void main(String[] args) {
		
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		a=s.nextInt();
		b=s.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is Grestest");
		}
		else
		{
			System.out.println(b+" is Greatset");
		}

	}

}

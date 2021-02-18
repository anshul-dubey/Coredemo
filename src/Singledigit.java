import java.util.Scanner;

public class Singledigit {

	public static void main(String[] args) {
		
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		a=s.nextInt();
		
		if(a>=-9 && a<=9)
		{
			System.out.println("Single digit");
		}
		else
		{
			System.out.println("Not single digit");
		}

	}

}

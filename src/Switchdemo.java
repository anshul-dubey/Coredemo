import java.util.Scanner;


public class Switchdemo {

	public static void main(String[] args) {
	
		int a,b,res;

		String op;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter opeartor");
		op=s.next();
				
				switch(op)
				{
				case "+": res=a+b;
				System.out.println("Addition" +res);
				break;
				case "-": res=a-b;
				System.out.println("Subtraction" +res);
				break;
				case "/": res=a/b;
				System.out.println("Divion" +res);
				break;
				case "*": res=a*b;
				System.out.println("Multiplication" +res);
				break;
				default: System.out.println("Invalid operator");
				break;
				}



	}

}

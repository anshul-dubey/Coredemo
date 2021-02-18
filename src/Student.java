import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
		int a,b,c,d,e;
		String name;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter name:");
		name=s.next();
		System.out.println("Enter marks of English:");
		a=s.nextInt();
		System.out.println("Enter marks of Maths:");
		b=s.nextInt();
		System.out.println("Enter marks of Physics:");
		c=s.nextInt();
		System.out.println("Enter marks of Chemistry:");
		d=s.nextInt();
		System.out.println("Enter marks of Biology:");
		e=s.nextInt();
		
		int sum=a+b+c+d+e;
		float result= (float) sum/500*100;
		System.out.println("Name: "+name);
        System.out.println("Marks of English,Maths, Physics, Chemistry, Biology): " +a+","+b+","+c+","+d+","+e+"");
        System.out.println("Total: "+sum +"\tPercentage: "+result);
		if(result>70)
		{
			System.out.println(" Pass with Distinction");
		}
		else
		{
			System.out.println("Pass");
		}
       
	}

}

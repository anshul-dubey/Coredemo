import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		
		int salary;
		String name; 
		double hra, da, pf, Netsal;
		Scanner s=new Scanner(System.in);  
        System.out.println("Enter Name of Employee:");  
        name =s.nextLine();  
        System.out.println("Enter the basic salary of an employee");
        salary=s.nextInt();
		
        System.out.println("enter hra:");
        hra=s.nextDouble();
        System.out.println("enter da:");
        da=s.nextDouble();
        System.out.println("enter pf:");
        pf=s.nextDouble();
        
        hra=0.4*salary;
        da=0.5*salary;
        pf=0.12*salary;
        Netsal=salary+hra+da-pf;
        System.out.println("Net Salary is="+Netsal);
	}
}


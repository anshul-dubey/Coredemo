import java.util.Scanner;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum:" +sum);
		

	}

}

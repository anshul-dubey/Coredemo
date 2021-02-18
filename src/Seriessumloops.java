import java.util.Scanner;

public class Seriessumloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,n,sum=0;
     
     Scanner s=new Scanner(System.in);
     System.out.println("Enter a number");
     n=s.nextInt();
     
     for(i=1;i<=n;i++)
     {
    	 sum=sum+1;
    	 
     }
     System.out.println("Sum of the series: \t" +sum);
    	 
	}

}

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
	
		    Scanner s=new Scanner(System.in);
			System.out.println("Enter a letter:");
			char c=s.next( ).charAt(0);
			
			
		
			
			if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='O' || c=='U' || c=='o' || c=='u')
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
				
			}

	}

}

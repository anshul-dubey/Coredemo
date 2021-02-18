//display nos 1 to 100

public class Fordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i;
      for(i=1;i<=10;i++)
      {
    	  if(i==5)
    	  {
    		  continue; //5 not displayed 
    		  // break is used to break the loop
    	  }
    	  System.out.println(i);
      }
	}

}

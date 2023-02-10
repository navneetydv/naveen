package staticcantrolflow;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
	 Scanner obj= new Scanner(System.in);
  String str ="";
  do {
	  System.out.println("Enter any number to chek even odd=");
	  int a=obj.nextInt();
	  if(a%2==0)
	  {
		  System.out.println("your number is even");
		 
	  }
	  else {
		  System.out.println("your number is odd");
		  
	  }
	  System.out.println("do you want to check another number....press(Y/N)..");
	  str =obj.next();
	  
  }while(str.equalsIgnoreCase("Y"));
  
  System.out.println("Thank you");
  
	}

}

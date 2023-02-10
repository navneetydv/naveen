package basicloop;

import java.util.Scanner;

public class DoLoop {

	public static void main(String[] args) {

		/*
		 * Scanner abc=new Scanner(System.in);
		 * System.out.println("please enter your name");
		 * System.out.println("my name is ");
		 */
		tableprint();
        newmethod();
	}

	public static void tableprint() {
		
	 Scanner sc1 = new Scanner(System.in);
	 Scanner sc = new Scanner(System.in); 
	 String Y_N = " "; 
	 do {System.out.println("Enter your no to get table"); 
	 int a = sc.nextInt(); 
     int i= 1; do { System.out.println(a + " x " + i + "=" + a * i); i++; } 
     while (i<=10); System.out.println("do you want to enter another number"); 
	 Y_N =sc1.nextLine(); 
	 System.out.println(); } 
     while (Y_N.equals("Y"));
   	System.out.println("thank you"); 
	 talk();		 
	}
	public static void talk() {
	/*
	 * int x=0; if(x==1) { System.out.println("Hello");
	 * 
	 * } else if(x>0){ System.out.println("Hii"); } else {
	 * System.out.println("My India");} }
	 */}	  
   public static void newmethod() { 
		
		  Scanner sc2=new Scanner(System.in);
		  System.out.println("Enter your name");
		  String cy=sc2.nextLine();		  
		  
		  System.out.println("Enter your age");
		  int year=sc2.nextInt();		  
		  System.out.println("Enter your city");
		  String ab=sc2.next();		 
		  System.out.println("Enter your mob. no."); 
		  long xv=sc2.nextLong();
		  System.out.println("the details are :");
		  System.out.println("your name is " + cy);
		  System.out.println("your age is " + year);
		  System.out.println("your city is " + ab);
		  System.out.println("your mob.no is " + xv);
		 System.out.println("thank you");
		 


		 
	

}}
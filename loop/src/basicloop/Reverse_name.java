package basicloop;
import java.util.Scanner;
public class Reverse_name {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);

		String yes_no;
		do {System.out.println("Enter your String !!");
			String str=sc.nextLine();
			for(int i=str.length()-1;i>=0;i--) {
				System.out.print(str.charAt(i));
			}
			System.out.println();
			System.out.println("Do you want to enter another string ? (yes or no)");
		    yes_no=sc1.next();
		}while(yes_no.equalsIgnoreCase("yes"));
 
		if (yes_no.equalsIgnoreCase("no"))System.out.println("Thankyou !!");
		else System.out.println("invalid ");

	}
}

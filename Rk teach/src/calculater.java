import java.util.Scanner;

public class calculater {

	public static void main(String[] args) {
		
		
	    Scanner input = new Scanner(System.in);

	   String symbol;

	  double   number1 = input.nextDouble();
	    
         symbol =input.next();
	double    number2 = input.nextDouble();

	    switch (symbol) {

	      case "+":
	        System.out.println(number1 + number2   );
	        break;

	      case "_":
	        System.out.println(number1 -  number2  );
	        break;

	      case "*":
	        System.out.println(number1 *  number2 );
	        break;

	      case "/":
	        System.out.println(number1 / number2);
	        break;

	      default:
	        System.out.println("Invalid symbol");
	        break;
	    }

	    input.close();
	  }
	

	}



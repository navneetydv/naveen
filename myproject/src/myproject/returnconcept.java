package myproject;

public class returnconcept {
	
public static void main(String[]args) {
	
	  int b=500;
	  
	  int sr=calculation(2000,600,700); System.out.println(sr);
	  
	  int c= calculation(5000,2000,1000);
	  
	  System.out.println(c);
	 
	
}
	
public static int calculation(int a, int b, int c) {
	
	int basicsalary=a+b+c;
	if(basicsalary>3000)
	{
		return  b;
	}
	
	return basicsalary;
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

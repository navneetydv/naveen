package myproject;

public class globalvariable {
	
	public static char p;
	public  boolean ch;
	
	
	static int c=60; //static
	int m=9;  //non static 
	public static int vari(){
		int  b=c*c;
		return c*2;
		
	}
	public static void main(String[] args) {
		int sum=variable(6,7);
  System.out.println(sum);
  
//  int car=7;
//   
//  System.out.println(c);

	
	}
	public static int variable(int a,int b) {
		int c=a+b;
		return c;
	}

}

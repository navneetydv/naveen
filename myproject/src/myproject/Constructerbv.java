package myproject;

public class Constructerbv {
	int a=10;
	static  int vvc=900;//1,5
	{//11,14,19,
		System.out.println(vvc);//22
	}
	Constructerbv(){//12,15
		
		System.out.println("hi i am constructerbv");
	}
		
 static	{//2,6
	 
		System.out.println("hi i am block");// instance block
	}
	  
 Constructerbv(int a){//20
	 System.out.println("hi i am constructer2");//23
	 
 }
	 int bn=80; //10,13,18,21
 
	public static void main(String[] args) {  //3,
		clas();//7
		
		
	System.out.println("hi hello");//24
	}
  public static void clas() {//4
	   int abc=600;//8
	   Constructerbv vb= new Constructerbv();//9
	   System.out.println(vb.bn);//16
//	   return a;
   }
}






package thissuper;

class BestMobile extends haho {
	public BestMobile() {
		
	}
	int i = 4;

	public void raj(int i) {
		System.out.println(this.i);
		System.out.println(i);
		System.out.println(super.i);
		System.out.println(i+this.i+super.i);	
	}
	public static void mains(String[] args) {
		int i=0 ;
		for(System.out.println("hi");i<=5; System.out.println("d")) {
			System.out.println("g");
			i++;
		}	
		BestMobile mob = new BestMobile();
		mob.m7();
        haho.m7();
	}
}
 public class Practice {
	public static void mains(String[] args) {
    System.out.println("practice");
		BestMobile mob = new BestMobile();
		mob.raj(10);
		haho.m7();
	}
 }
  class haho {
	int i=7;
	haho(String i){
	this(5);
	System.out.println("hello12dgfhf");
	}
	haho(){
		this("a");
	
	System.out.println("hello12");
}
	haho(int i){
	
		System.out.println("hello123545");
		}
	public static void m7() {
		System.out.println("ff");
	}
	public void m6() {
		this.m7();
		System.out.println("ff");
	}
	public void raj(int i) {
       this.m6();
		System.out.println(this.i);
		
		System.out.println("jj");
	
	}
  public static void main(String[] args) {

  System.out.println("haho");

        new haho().m7();
        
  }

  }
  

package thissuper;

public class Custom {
	public static void main(String[] args) {
		System.out.println("main");
		C1.main(null);
	}
	void m1() {
		System.out.println("m1");
	}

}
class C1{
	public static void main(String[] args) {
		Custom k=new Custom();
		k.m1();
	}
	void cm1() {
		System.out.println("cm1");
	}
}

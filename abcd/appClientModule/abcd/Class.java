package abcd;

public class Class {

	Class() {
		System.out.println("hi");

	}

	void m1() {
		System.out.println("hello");
	}

	public void m2() {
		System.out.println("my name is navneet");
	}

	{
		System.out.println("i am instance");
	}

	public static void main(String[] arge) {
		Class a = new Class();
		Class b = new Class();
		a.m1();
		b.m2();

	}
}
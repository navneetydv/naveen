package abc.xyz.pqr;

public class parameter {

	public static void main(String[] args) {
		str();
		int v = addition(7000, 5000, 2000);
		int tax = v * 15 / 100;
		int net = v - tax;
		System.out.println(net);
	}

	public static int addition(int basic, int hra, int pf) {

		int num = basic + hra + pf;
		// int tax=num*15/100;
		System.out.println(num);
		return num;
	}

	public static void str() {
		int a = 10;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
	}

}

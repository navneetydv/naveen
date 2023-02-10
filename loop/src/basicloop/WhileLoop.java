package basicloop;

public class WhileLoop {

	int ab = 80;
	static int cb = 90;

	public static void main(String[] args) {
		basic();
		int i = 8;
		while (i >= 0) {
			int a = 0;
			while (a <= i) {
				System.out.print(" ");
				a++;
			}
			int j = 8;
			while (j >= i) {

				System.out.print("*");
				j--;
			}
			System.out.println();
			i--;
		}

	}

	public static void basic() {

		WhileLoop x = new WhileLoop();
		System.out.println(x.ab);
		basic2();

	}

	public static void basic2() {

		System.out.println("hi i am basic2");

	}
}

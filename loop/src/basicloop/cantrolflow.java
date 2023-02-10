package basicloop;

public class cantrolflow {

	static cantrolflow ab;
	static {
		System.out.println("Hi i am static constructer");
	}
	{
		System.out.println("yes hi i am semicollon");
	}

	public static cantrolflow z1(cantrolflow ab) {
		return ab;
	}

	int a = 20;

	public String z2() {
		System.out.println("I am z2 method ");
		return "Hi";
	}

	public static void main(String[] args) {
		cantrolflow ab1 = z1(new cantrolflow());

		System.out.println(ab1.z2());

		int qa = 40;
		ab1 = null;
		System.out.println(ab1);
	}
}

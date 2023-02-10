package basicloop;

class sampleclass {
	static sampleclass sc;

	public static sampleclass m1(sampleclass sc) {
		return sc;
	}

	public static void main(String[] args) {

		int a = 9;
		sampleclass f = new sampleclass();
		f = null;
		System.out.println(f);
		f.methodone("hi");

		sampleclass sc1 = new sampleclass();

		System.out.println(sc1.methodone("hi am object"));
	}

	int a = 20;

	public static String methodone(String utring) {
		int a = 5;
		System.out.println("hi i am methodone");
		return utring = "Sbi";
	}

}
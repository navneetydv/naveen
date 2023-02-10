package web_automation_basic;

public class Firefox_web_Launch {
	
	public static void m1() {
	String s="satish";
	char[] a=s.toCharArray();
	for (int i = 0; i < a.length; i=i+2) {
		char c = a[i];
	//	System.out.println(c);
		if(c%2!=0) {
			System.out.println(c);
			
		}
	}
	
	}
	
	
	
	
	public static void main(String[] args) {
		m1();
		
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Navnit\\eclipse-workspace\\myworkspace\\Automation_basic\\src\\web_automation_basic\\geckodriver.exe");
		
		//FirefoxDriver Driver=new FirefoxDriver();
		
	// Driver.get("http:\\www.localhost:8888/");
	}

}

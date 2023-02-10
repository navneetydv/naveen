package basicloop;

public class ab {
	
	public static void main(String[] args) {
		
		String word="hiy i am roihan";
		String[] ab=word.split("i");
		for (int i = 0; i < ab.length; i++) {
			for (int j = ab[i].length()-1; j >= 0; j--) {
				char[] cv=ab[i].toCharArray();
				System.out.print(cv[j]);
				
			}
			System.out.print(" ");
		}
	
	}}
		
		
	
		
		
	



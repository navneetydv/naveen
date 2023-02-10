import java.util.LinkedHashSet;

public class String_program {

	public static void main(String[] args) {
		
		String word="Hi I am Roshan Yadav".toLowerCase();
		
		LinkedHashSet<Character> cs=new LinkedHashSet();
		for (int i = 0; i < word.length(); i++) {
			if(cs.add(word.charAt(i))==false) {
				
				
			}
		
		}
		
		System.out.println(cs);	
		
		
		
		/*
		 * StringBuilder sb1=new StringBuilder(); word.chars().distinct().forEach(c
		 * ->sb1.append((char)c)); System.out.println(sb1);
		 */
	}

}

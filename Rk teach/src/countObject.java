
public class countObject {
 static int count=0;
 {
	 count++;
 }
	public static void main(String[] args) {
		
String d[][]= new String[4][3];

d[0][0]="  firstname ";
d[0][1]="  lastname ";
d[0][2]="    age  ";

d[1][0]="  Ram  ";
d[1][1]="       yadav ";
d[1][2]="        40   ";
d[2][0]="  sumit  " ;
d[2][1]="     yadav  " ;
d[2][2]="       21   " ;
d[3][0]="  suraj  " ;
d[3][1]="     yadav  " ;
d[3][2]="       25  " ;
for (String[] strings : d) {
	for (String strings2 : strings) {
		System.out.print(strings2);	
	}
	System.out.println(" ");
}
	}
}


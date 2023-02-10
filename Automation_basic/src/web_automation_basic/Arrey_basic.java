package web_automation_basic;

import java.util.Iterator;

public class Arrey_basic {

	public static void main(String[] args) {
	//	method1();
		method2();
			//int student[]= {3,7,9,8};
			//single dimention arrey
			
	//	int sum=0;
		
   // for (int i = 0; i <student.length; i++) {
			
		//sum=sum-student[i];
		//.out.println(sum);
//		System.out.print(student[i]);
//		
    }	//
				//System.out.println(sum);
			
	
	
	public static void method1(){
		//multiple dimention Arrey
		String student[]=new String[5];
		student[0]="yadav";
		student[1]="obc";
		student[2]="sc";
		student[3]="st";
		student[4]="general";
	for (int i = 0; i < student.length; i++) {
			System.out.println(student[i]);
		}
	}
	public static void method2() {
  
		int num[]= {3,7,9,8};
		int x=num.length;
		int sum=0;
		for(int i=0;i<x;i++) {
			
			sum=sum+num[i];
		}
		System.out.println(sum/x);
		
		
	}}

	

	



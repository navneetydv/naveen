package com.evs.vtiger.automation;

import java.util.Arrays;

public class Exect {
	public static void main(String[] args) {
		System.out.println("dl");

		int a[] = { 43, 6, 34, 5, 23, 65, 23, 75, 43 };
		Arrays.sort(a); // {5 6

		for (int i = 0; i < a.length; i++) {

			if (a[i] == a[i + 1]) {
				System.out.print(a[i] + " ");

			}

		}

		System.out.println("hi bhai");
	}
}

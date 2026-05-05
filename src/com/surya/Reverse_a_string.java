//1.	Reverse a String without using inbuilt methods
package com.surya;

public class Reverse_a_string {

	public static void main(String[] args) {

		String s = "Surya";

		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}

		System.out.println(rev);
	}

}

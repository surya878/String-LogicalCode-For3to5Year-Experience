//1.	Reverse a number using buildIn method
package com.surya.reverse;

public class Reverse_a_string_UsingInbuit_method {

	public static void main(String[] args) {
		
		String s="Lipu";
		
		StringBuilder sb=new StringBuilder(s);
			
		StringBuilder ss=sb.reverse();

		System.out.println(ss);
		
		System.out.println();
		
		//Reverse Number
		
		String s2="1234";
		
		StringBuilder sb1=new StringBuilder(s2);
			
		StringBuilder ss2=sb1.reverse();

		System.out.println(ss2);
	}

}
/*


Step-by-Step Flow

Step-1

String s = "Lipu";


String created:

Lipu

Step-2
StringBuilder sb = new StringBuilder(s);

StringBuilder now contains:

Lipu

Step-3
sb.reverse();

Internally reverses characters:

Before	After
 L		 u
 i		 p
 p		 i
 u		 L

Result:

upiL
Step-4

System.out.println(s1);

Prints:

upiL


				//Or//
			
				
package com.surya;

public class Reverse_a_string_UsingInbuit_method {

    public static void main(String[] args) {

        String s = "Lipu";

        String reversed = new StringBuilder(s).reverse().toString();

        System.out.println(reversed);
    }
}



*/
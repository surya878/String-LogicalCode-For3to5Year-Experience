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

/* ============================= Execution Flow ===============================

 String s = "Surya";

Indexes:

Index	Character
 0	S
 1	u
 2	r
 3	y
 4	a

s.length() = 5

 1. Correct Loop


for (int i = s.length() - 1; i >= 0; i--)


Actual values:
for (int i = 4; i >= 0; i--)
	
Step-by-Step Flow

Iteration 1

i = 4

condition

4 >= 0   → true

Charcter

s.charAt(4) → 'a'

Iteration 2

i--

Now:

i = 3

Character:

s.charAt(3) → 'y'

Iteration 3
i = 2 → r
Iteration 4
i = 1 → u
Iteration 5
i = 0 → S

Next
i--

Now:

i = -1

Condition:

-1 >= 0 → false

Loop stops.

*/
















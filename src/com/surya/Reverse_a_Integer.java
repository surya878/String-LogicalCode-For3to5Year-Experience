package com.surya;

public class Reverse_a_Integer {

	public static void main(String[] args) {

		String str = "1234";

		String ss = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			ss = ss+str.charAt(i);
		}

		System.out.println(Integer.parseInt(ss));
	}
}

// ================================ Execution flow =========================

/*

Step-by-Step Execution Flow

Step 1
String str = "1234";

A String object is created.


Memory
str → "1234"
Step 2
String ss = "";


An empty string is created.

Memory
ss → ""


Step 3 — for Loop Starts
for (int i = str.length() - 1; i >= 0; i--)
First Understand
str.length()


Length of "1234" is:

4

So:

i = 4 - 1
i = 3
Initial Loop State
Variable	Value
str	"1234"
ss	""
i	3


Iteration 1
Condition Check
i >= 0
3 >= 0

TRUE

Loop executes.

Inside Loop
ss = ss + str.charAt(i);

Current:

ss = ""
i = 3
charAt(3)
str.charAt(3)

String indexes:

Index	Character
0	1
1	2
2	3
3	4

So:

str.charAt(3) = '4'
Concatenation
ss = "" + '4'

Result:

ss = "4"
i--
i = 2

Iteration 2
Condition
2 >= 0

TRUE

charAt(2)
str.charAt(2) = '3'
Concatenation
ss = "4" + '3'

Result:

ss = "43"
i--
i = 1

Iteration 3
charAt(1)
str.charAt(1) = '2'
Concatenation
ss = "43" + '2'

Result:

ss = "432"
i--
i = 0

Iteration 4
charAt(0)
str.charAt(0) = '1'
Concatenation
ss = "432" + '1'

Result:

ss = "4321"
i--
i = -1

Loop Condition
-1 >= 0

FALSE

Loop stops.

Final Value
ss = "4321"
Step 4
System.out.println(Integer.parseInt(ss));
parseInt()

Converts String into Integer.

Integer.parseInt("4321")

Result:

4321
Final Output
4321



Complete Iteration Table
Iteration	i	charAt(i)	ss Before	ss After
1			3		4			""			"4"
2			2		3			"4"			"43"
3			1		2			"43"		"432"
4			0		1			"432"		"4321"

*/
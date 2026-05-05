/*
What is Palindrome?

A palindrome is a word or string that reads the same:

from left to right
and from right to left

for number also same logic

Examples
--------
	String	Palindrome?
	madam		Yes
	level		Yes
	racecar		Yes
	java		No
	121			yes
	
	
A palindrome is a string or number that remains the same when reversed.
 
 */

package com.surya.palindrome;

public class Check_String_PalindromeOrNot {

	public static void main(String[] args) {
		
		String s="level"; // same for String s="121"
		
		String str="";
		
		for(int i=s.length()-1; i>=0 ; i--) {
			str =str + s.charAt(i);
		}
		System.out.println(str);
		System.out.println("===");
		
		if(str.equals(s)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is Not Palindrome");
		}
	}
}




//============================== Execution Flow ==============================
/*
 
  
  
Full Execution Flow Step by Step
Initial Values
str = "madam"
reversed = ""
String Index Positions
Index	Character
0	m
1	a
2	d
3	a
4	m
Loop Starts
for(int i = str.length() - 1; i >= 0; i--)
First Understand
str.length()

Length of:

madam

is:

5

So:

i = 5 - 1
i = 4
Iteration 1
Current Values
Variable	Value
i	4
reversed	""
charAt(4)
str.charAt(4)

Result:

'm'
Concatenation
reversed = "" + 'm'

Result:

reversed = "m"
i--
i = 3
Iteration 2
charAt(3)
'a'
Concatenation
reversed = "m" + 'a'

Result:

reversed = "ma"
i--
i = 2
Iteration 3
charAt(2)
'd'
Concatenation
reversed = "ma" + 'd'

Result:

reversed = "mad"
i--
i = 1
Iteration 4
charAt(1)
'a'
Concatenation
reversed = "mad" + 'a'

Result:

reversed = "mada"
i--
i = 0
Iteration 5
charAt(0)
'm'
Concatenation
reversed = "mada" + 'm'

Result:

reversed = "madam"
i--
i = -1
Loop Condition
i >= 0
-1 >= 0

FALSE

Loop stops.

Final Values
Variable	Value
str	madam
reversed	madam
Comparison Step
str.equals(reversed)

Becomes:

"madam".equals("madam")

Result:

true
Output
Palindrome
Complete Iteration Table
Iteration	i	charAt(i)	reversed Before	reversed After
	1		4		m			""				m
	2		3		a			m				ma
	3		2		d			ma				mad
	4		1		a			mad				mada
	5		0		m			mada			madam
	
	
Example of Not Palindrome
Input
java
Reverse
avaj
Comparison
java.equals(avaj)

FALSE

Output
Not Palindrome
Important Interview Point
Why equals() is Used?

Because:

Operator	Purpose
==	Compare memory
equals()	Compare content

For strings we should use:

equals()
 
 
 
 
 
 */


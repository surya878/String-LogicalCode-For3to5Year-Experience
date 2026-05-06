/*
input
-----
 
 Given String  is "java"
 
output
------
j=1
a=2
v=1

 */

package com.surya.count.occurrence.eachcharcter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Count_Occurrence_EachCharacter {

	public static void main(String[] args) {

		String str = "suryalipsa";

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);
	}

}

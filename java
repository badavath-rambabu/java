package com.journaldev.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };

		List<Integer> intList = Arrays.asList(intArray);

		Collections.shuffle(intList);

		intList.toArray(intArray);

		System.out.println(Arrays.toString(intArray));
    }
}

<!-- checking roman number program -->
//2. checking  roman number

import java.util.*;
import java.io.*;
import java.lang.Math;
public class Main {
   public static void main(String args[]) {
      Main obj = new Main();
      String inputRoman= "LXVII";
      System.out.println("The Integer value of given Roman number is: "+obj.romanToInt(inputRoman));
   } 
   int NumValue(char rom) {
      if (rom == 'I')
         return 1;
      if (rom == 'V')
         return 5;
      if (rom == 'X')
         return 10;
      if (rom == 'L')
         return 50;
      if (rom == 'C')
         return 100;
      if (rom == 'D')
         return 500;
      if (rom == 'M')
         return 1000;
      return -1;
   }
   int romanToInt(String str) {
      int sum = 0;
      for (int i=0; i<str.length(); i++) {
         int s1 = NumValue(str.charAt(i));
         if (i+1 <str.length()) {
           int s2 = NumValue(str.charAt(i+1));
           if (s1 >= s2) {
              sum = sum + s1;
           }
           else{
              sum = sum - s1;
           }
        }
        else {
           sum = sum + s1;
        } 
     }  
     return sum;
   }
} 


<!-- pangram or not program -->
//3.pangram or not 
// Java Program to illustrate Pangram


import java.io.*;

class GFG {

	
	public static boolean checkPangram(String str)
	{
		
		boolean[] mark = new boolean[26];

		
		int index = 0;

		
		for (int i = 0; i < str.length(); i++) {
			
			if ('A' <= str.charAt(i)
				&& str.charAt(i) <= 'Z')
				index = str.charAt(i) - 'A';

			else if ('a' <= str.charAt(i)
					&& str.charAt(i) <= 'z')

				index = str.charAt(i) - 'a';

			
			else
				continue;
			mark[index] = true;
		}

		
		for (int i = 0; i <= 25; i++)
			if (mark[i] == false)
				return (false);

		
		return (true);
	}

	
	public static void main(String[] args)
	{
		String str
			= "The quick brown fox jumps over the lazy dog";

		if (checkPangram(str) == true)
			System.out.print(str + " \nis a pangram.");
		else
			System.out.print(str + " \nis not a pangram.");
	}
}
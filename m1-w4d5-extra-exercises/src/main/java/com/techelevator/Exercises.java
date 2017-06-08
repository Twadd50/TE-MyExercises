package com.techelevator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Exercises {

    /*
    Given an integer array, return the array with all of the duplicate values removed.
    arrayDeduplication([8, 13, 13, 9, 11, 12]) → [8, 13, 9, 11, 12]
    arrayDeduplication([]) → []        
    arrayDeduplication([1, 1, 1]) → [1]		//use FOR EACH when looping through entire set and dont care about order, how many times looped through. 
    */										//use FOR loop can go backwards, start at different points, etc
    public int[] arrayDeduplication(int[] nums) {
    		Set<Integer> noDuplicates = new LinkedHashSet<Integer>();    // Linked - preserves order
    		for (int i = 0; i < nums.length; i++) {
    			noDuplicates.add(nums[i]);								//adding each number in loop to the set not including duplicates
    		}
    		int[] noDupesArray = new int[noDuplicates.size()];			//creating new array and noDupesArray = to size of noDuplicates
    		int i = 0;
    		for(Integer value : noDuplicates) {							//Integer = datatype value = variable filling up 
    			noDupesArray[i++] = value;								//i++ makes sure 0 increments	//go thru noDupes get value for each element setting it to index of noDupeArray
    		}
    		return noDupesArray;
    	
    	}
   
    
  
    
    
    
    
    
    
    
    
    
    /*
    CHALLENGE: Using array A and array B, return an array that is the intersection of both A and B.
    The intersection includes numbers that appear in both arrays.
        arrayIntersection([1, 3, 5], [1, 5, 7]) → [1, 5]
        arrayIntersection([1], [1, 5, 7]) → [1]
        arrayIntersection([1, 1, 1], [1, 5, 7]) → [1]
        arrayIntersection([], []) → []
    */
    public int[] arrayIntersection(int[] a, int[] b) {
		List<Integer> result = new ArrayList<>();
    	for (int i = 0; i < a.length; i++) {
    		for (int x = 0; x < b.length; x++) {
    			if (a[i] == b[x]) {
    				result.add(a[i]);
    			
    		int[] blah = result;
    	} return blah;
    }
    
    /*
    Given an integer array, return the array sorted lowest to highest.
    	CHALLENGE: Write the Sort algorithm, don't use the .Sort() method provided to an array. 
    arraySort([8, 13, 9, 12]) → [8, 9, 12, 13]        
    */
    public int[] arraySort(int[] nums) {
    	List<Integer> result = new Arraylist<>();
    	for(int i = 0; i < nums.length; i++) {
    		
    		result.sort[i];
    			
    		}
    		
    	
        return arraySort;
    
    }

    /*
    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
    	Return 0 if they both go over.
    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19
    */
    public int blackjack(int a, int b) {
    	
    	for 
    	
    	if((a > 21 && b > 21)) {
    		return 0;
    	}
    	else if ((a <= 21 && b < a)) {
    		return a;
    	}
    	else if ((b <= 21 && a < b))	 
    		return b;
    		
    }
    
    
    
    
    
    
    
    
    
    /*
    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), 
    	while the other is "far", differing from both other values by 2 or more.
    	Note: Math.abs(num) computes the absolute value of a number.
    closeFar(1, 2, 10) → true
    closeFar(1, 2, 3) → false
    closeFar(4, 1, 3) → true
    */
    public boolean closeFar(int a, int b, int c) {
    	
    
    	
        return false;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    CHALLENGE: Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
    	Return the number of clumps in the given array.
    countClumps([1, 2, 2, 3, 4, 4]) → 2
    countClumps([1, 1, 2, 1, 1]) → 2
    countClumps([1, 1, 1, 1, 1]) → 1
    */
    public int countClumps(int[] nums) {
        return null;
    }

    /*
    CHALLENGE: Write the algorithm to find and return the given node based on its value, n. 
    	If the node cannot be found, return null.
    */
    public Integer FindNode(LinkedList<Integer> nodes, int n) {         
        return null;
    }

    /*
    * Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by 
    * 	the value plus 5, followed by the value minus 1. 
    * 	Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
    * has271([1, 2, 7, 1]) → true
    * has271([1, 2, 8, 1]) → false
    * has271([2, 7, 1]) → true     
    */
    public boolean has271(int[] nums) {
        return false;
    }

    /*
    Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
    	The ints are non-negative. 
    	Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
    lastDigit(23, 19, 13) → true
    lastDigit(23, 19, 12) → false
    lastDigit(23, 19, 3) → true
    */
    public boolean lastDigit(int a, int b, int c) {
        return false;
    }

    /*
    We want to make a row of bricks that is goal inches long. 
    	We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
    	Return true if it is possible to make the goal by choosing from the given bricks. 
    	This is a little harder than it looks and can be done without any loops.
    makeBricks(3, 1, 8) → true
    makeBricks(3, 1, 9) → false
    makeBricks(3, 2, 10) → true
    */
    public boolean makeBricks(int small, int big, int goal) {
        return false;
    }

    /*
    CHALLENGE: Given a string, return the length of the largest "block" in the string. 
    	A block is a run of adjacent chars that are the same.
    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
    */
    public int maxBlock(String str) {	
    		int maxLength = 0;
    		int numCount = 0; 
    		//for everytime i <str.length - 1, add 1
    		for(int i = 0; i < str.length() - 1; i++) {
    		//if char at "str" index = char at str index plus increment
    			if(str.charAt(i) == str.charAt(i + 1)) {
    			//set numcount var to 2 because the max number it could be is 2 " i plus i + 1"
    				if(numCount == 0) {
    					numCount = 2;
    				}
    				else {
    					// if amount is bigger than 0, increment numcount by 1
    					numCount++;
    				}
    				
    			}
    			else { 
    	//if the incremented amount of numcount is > maxLength
    				if(numCount > maxLength) {
    				//current number in numCount is set = to maxLength and reurned
    					maxLength = numCount;
    					numCount = 0;
    				}
    			}
    		}
    		return maxLength;
    }

    /*
    CHALLENGE: Consider the leftmost and righmost appearances of some value in an array.
    	We'll say that the "span" is the number of elements between the two inclusive. 
    	A single value has a span of 1. 
    	Returns the largest span found in the given array. (Efficiency is not a priority.)
    maxSpan([1, 2, 1, 1, 3]) → 4
    maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
    maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
    */
    public int maxSpan(int[] nums) {
      //make sure maxSpan has a value of at least 1
    	if (nums.length > 0) {
            int maxSpan = 1;
            {
        //j = to length of the array      length - 1 (access the last element)   
            	for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] == nums[i]) {
                        int count = (j - i) + 1;
                        if (count > maxSpan) {
                        	maxSpan = count;
                        }
                        break;
                    }
                }
            }
            return maxSpan;
        } 
        else {
        	return 0;
        }
    }

    /*
    * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
    * mixStart("mix snacks") → true
    * mixStart("pix snacks") → true
    * mixStart("piz snacks") → false        
    */
    public boolean mixStart(String str) {
    	if(str.endsWith("ix")) {
    		
    	}
        return true;
    }

    /*
    Given an array of ints, return true if the number of 1's is greater than the number of 4's
    more14([1, 4, 1]) → true
    more14([1, 4, 1, 4]) → false
    more14([1, 1]) → true
    */
    public boolean more14(int[] nums) {
    	int num1 = 0;
    	int num4 = 0;
    	for(int i = 0; i < nums.length; i++)
    		if(nums[i] == 1) {
    			num1++;
    		}
    		if(nums[i] == 4) {
    			num4++;
    	}
    		if(num1 > num4)
    			return true;
    }
    
    /*
    * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in 
    * 	the array. Return true if the array does not contain any triples.      (bad test)  
    *
    * noTriples([1, 1, 2, 2, 1]) → true
    * noTriples([1, 1, 2, 2, 2, 1]) → false
    * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
    */
    public boolean noTriples(int[] nums) {
    	for( int i = 0; i < nums.length - 2;) {
    		if((nums[i] + 1 == nums[i+1] + 1) && (nums[i+1] == nums[i+2] + 1));
    	}
    }
        return true;
    }

    /*
    * Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". 
    * 	Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". 
    * 	Ignore any group of fewer than 3 chars at the end.
    * oneTwo("abc") → "bca"
    * oneTwo("tca") → "cat"
    * oneTwo("tcagdo") → "catdog"
    */
    public String oneTwo(String str) {
        String result = "";
        //length() when string  / looping through array - 2 indexes at a times (3 chars) i increments by 3 instead of 1
        	for(int i = 0; i < str.length() - 2; i += 3) {
        		result += str.substring(i + 1, i + 3);
        		result += str.substring(i, i + 1);
        	}
    	return result;
    }
    
    /*
    * Given two strings "word", and a separator "sep", return a big string made of count occurrences 
    * 	of the word, separated by the separator string.						
    * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    * repeatSeparator("This", "And", 2) → "ThisAndThis"										?????????
    * repeatSeparator("This", "And", 1) → "This"
    */
    public String repeatSeparator(String word, String sep, int count) {
   //string named "result" storing the count
    	String result = "";
    	 for (int i = 0; i < count - 1; i++) {
   //result += number of "word" occurrences, separated by "sep" occurence   ex. "wordsepwordsepword"
    		 result += word + sep;
    	 }
    		if (count > 0) {
    			result += word;
    		}
    	return result;
    }

    /*
    * Return true if the given string contains between 1 and 3 'e' chars.
    * ("Hello") → true
    * ("Heelle") → true
    * ("Heelele") → false
    */
    public boolean stringE(String str) {
    	int numCount = 0;
    	for(int i = 0; i < str.length(); i++) {
    	//check if char at index = e ... if it does , add one to numCount
    		if(str.charAt(i) == 'e') {
    			numCount++;
    		}	if (numCount >=1 && numCount <=3);
    	}
    		   return true;
    }
    
    /*
    * Given 2 strings, a and b, return the number of the positions where they contain the same length 
    * 	of two  substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" 
    * substrings appear in the same place in both strings.    (bad test)    * 
    * stringMatch("xxcaazz", "xxbaaz") → 3
    * stringMatch("abc", "abc") → 2
    * stringMatch("abc", "axc") → 0  
    */
    public int stringMatch(String a, String b) {
   // math.min - returns the smaller of either "a" or "b"
    	int count = 0;
    	int positionSubstring = Math.min(a.length(), b.length());	
    	for(int i = 0; i < positionSubstring - 1; i++) {
    		
   // check to see which of 'a' or 'b'  substrings (length 2) are the same 
   // substring(i,  - where the substring starts checking... index 0 (first letter)
    		String aSub = a.substring(i, i + 2);
    		String bSub = b.substring(i, i + 2);
    		if(aSub.equals(bSub)) {
    	//increment count by 1 for every length 2 substring a and b have in common
    			count++;
    		}
    	}
    	return count;
    }

    /*
    Return true if the array contains, somewhere, three increasing adjacent numbers like 
    	.... 4, 5, 6, ... or 23, 24, 25.
    tripleUp([1, 4, 5, 6, 2]) → true
    tripleUp([1, 2, 3]) → true
    tripleUp([1, 2, 4]) → false
    */
    public boolean tripleUp(int[] nums) {
    	for (int i = 0; i <= nums.length - 3; i++) {	// ??checking 4 indexes at a time to make sure no 3 numbers??
  //looping through array - 3 times ((nums.length - 3)) only checking for 3 increasing numbers at a atime ?
    		if(nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
    	
    			return true;
    		}
    		
    	}
        return false;
    }

    /*
    * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and 
    * 	ending with 'p'. Return a string where for all such words, the middle letter is gone. 
    * "zipXzap" yields "zpXzp".
    * zipZap("zipXzap") → "zpXzp"
    * zipZap("zopzop") → "zpzp"
    * zipZap("zzzopzop") → "zzzpzp"
    */
    public String zipZap(String str) {
    	//for everytime i < str.length - 2, add 1    - 2 only need to check 2 numbers at a time
       for (int i = 0; i < str.length() - 2; i++) {
   //if char at index = 'z' AND char at index + 2 = 'p'
    	   if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
    		   //"hamburger".substring(4, 8) returns "urge"
    		  // substring returns "zp" because i 0 = z and i + 2 = p
    		   str = str.substring(0, i + 1) + str.substring(i + 2); 
    	   }
       }
       return str;
    }
}

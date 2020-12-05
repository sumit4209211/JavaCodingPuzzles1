package com.test.ibm;

/***
 * 
 * Given a string that consists of only two types of characters: '(' and ')',
 * balance the parentheses by inserting either a '(' or a ')' as many times as
 * necessary. Determine the minimum number of characters that must be inserted.
 * 
 * 
 * 
 * Example
 * 
 * s = '(()))'
 * 
 * 
 * 
 * To make it a valid sequence, insert a '('at the beginning of the string,
 * resulting in "((()))". The string is balanced after 1 insertion.
 * 
 * 
 * 
 * Function Description
 * 
 * Complete the method getMinOperations below. The function must return the
 * minimum number of operations needed to make the parentheses sequence valid.
 * 
 * int getMinOperations(String s){ }
 * 
 * getMinOperations has the following parameter(s):
 * 
 * string s: a string of parentheses
 * 
 * 
 * 
 * Return
 * 
 * int: the minimum number of insertions required to balance the parentheses
 * 
 * 
 *
 */

public class BalancingParentheses {

	public static void main(String[] args) {
//		String str = "((((";
//		String str = "(()))";
//		String str = ")))(((";
		String str = ")))(";
//		String str = "";
//		String str = "((()";
//		String str = "((()))";
		System.out.println(getMinOperations(str));

	}
	
	// Assumption that only string will only contain ( & ) chars. If other characters are passed, we need to 
	//throw a runtime exception or eliminate using regex. These are not included as a part of below solution.

	private static int getMinOperations(String str) {
		int answer = 0, balance = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				balance++; // Increment the value to 1, indicates and opening bracket was encountered
			} else {
				balance--; // Decrement by 1, indicates and closing bracket was encountered
			}

			// ((((, means below condition will not execute and balance will have value of 4
			// from above if check.
			if (balance == -1) {
				answer++;
				balance++;
			}
		}
		return answer +  balance;
//		return Math.abs(balance);

	}

}

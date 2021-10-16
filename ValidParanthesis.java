package GS;

import java.util.Stack;

public class ValidParanthesis {
	/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public static boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
    // Iterate through string until empty
    for(int i = 0; i<s.length(); i++) {
        // Push any open parentheses onto stack
        if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            stack.push(s.charAt(i));
        // Check stack for corresponding closing parentheses, false if not valid
        else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
            stack.pop();
        else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
            stack.pop();
        else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
            stack.pop();
        else
            return false;
    }
    // return true if no open parentheses left in stack
    return stack.empty();
    }

}

package com.greatlearning.service;

import java.util.Stack;

public class BalancingBrackets {
	
	//P1
	//static function
	//args -- bracketExpression ....({[]})
	//boolean
	
	//P2
	//Intialize stack
	//Across each of the character in the bracket Expressio
		//Fetch each character
		//check if character is opening bracket
			//push
			//continue
		//pop from stack
		//switch case on the popped character
		//different cases for closing bracket
			//for each of the case,check popped element is the corresponding bracket
	
	//stack.isempty()
	
	
	public static boolean areBalancingBrackets(String argsexp) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<argsexp.length(); i++) {
			
			char x = argsexp.charAt(i);
			
			if(x == '(' || x == '[' || x== '{') {
				
				stack.push(x);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			char checkstackargs = stack.pop();
			switch (x) {
			case ')' :
				
				if(checkstackargs == '{' || checkstackargs == '[')
					return false;
				break;
			case '}':
				checkstackargs = stack.pop();
				if(checkstackargs =='(' || checkstackargs == ']')
					return false;
				break;
			case ']':
				checkstackargs = stack.pop();
				if(checkstackargs == '(' || checkstackargs == '{')
					return false;
				break;
			default: return false;
			}
				
			
		}
		return (stack.isEmpty());
		
	}
	

}

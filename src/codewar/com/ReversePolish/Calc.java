package codewar.com.ReversePolish;

import java.util.Stack;

public class Calc {
	public double evaluate(String expr) {
		
		if(expr.length() == 0) {
			return 0;
		}
		
		String[] exprArray = expr.split(" ");
		
		Stack<Double> stack = new Stack<Double>();
		
		for(String exp : exprArray) {
			
			if("+".equals(exp)) {
				stack.push(stack.pop() + stack.pop());
			} else if("-".equals(exp)) {
				stack.push(- stack.pop() + stack.pop());
			} else if("*".equals(exp)) {
				stack.push(stack.pop() * stack.pop());
			} else if("/".equals(exp)) {
				double first = stack.pop();
				double second = stack.pop();
				stack.push(second / first);
			} else {
				stack.push(Double.parseDouble(exp));
			}
		}
		
		return stack.pop();
	}
}

package codewar.com.BalancedParens;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.unitils.reflectionassert.ReflectionAssert.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.unitils.reflectionassert.ReflectionComparatorMode;

class BalancedParensTest {

	@Test
	public void testExample_Given_Zero() {
		List<String> warriorsList = BalancedParens.balancedParens(0);
		assertLinesMatch(new ArrayList<String>(Arrays.asList(new String[] { "" })), warriorsList);	
	}

	@Test
	public void testExample_Given_One() {
		List<String> warriorsList = BalancedParens.balancedParens(1);
		assertLinesMatch(new ArrayList<String>(Arrays.asList(new String[] { "()" })), warriorsList);	
	}

	@Test
	public void testExample_Given_Two() {
		List<String> warriorsList = BalancedParens.balancedParens(2);
		Collections.sort(warriorsList);
		assertLinesMatch(new ArrayList<String>(Arrays.asList(new String[] { "(())", "()()" })), warriorsList);		
	}
	//@Disabled
	@Test
	public void testExample_Given_Three() {
		List<String> warriorsList = BalancedParens.balancedParens(3);
		Collections.sort(warriorsList);
		assertLinesMatch(new ArrayList<String>(Arrays.asList(new String[] { "((()))", "(()())", "(())()", "()(())", "()()()" })), warriorsList);
		
	}

	@Test
	public void testExample_Given_Four() {
		List<String> warriorsList = BalancedParens.balancedParens(4);
		Collections.sort(warriorsList);
		assertLinesMatch(new ArrayList<String>(Arrays.asList(new String[] { 
				"(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()",
				"(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()" })), warriorsList);
		
	}
}

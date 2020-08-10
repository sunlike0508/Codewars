package codewar.com.CalculateRotation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateRotationTest {

	@Test
	public void test_Given_hoop_When_pooh_Then_minus_one() {
		assertEquals(-1, CalculateRotation.shiftedDiff("hoop", "pooh"));
	}
	
	@Test
	public void test_Given_coffee_When_eecoff_Then_two() {
		assertEquals(2, CalculateRotation.shiftedDiff("coffee", "eecoff"));
	}
	
	@Test
	public void test_Given_eecoff_When_coffee_Then_four() {
		assertEquals(4, CalculateRotation.shiftedDiff("eecoff", "coffee"));
	}
	
	@Test
	public void test_Given_moose_When_Moose_Then_minus_one() {
		assertEquals(-1, CalculateRotation.shiftedDiff("moose", "Moose"));
	}
	
	@Test
	public void test_Given_Esham_When_Esham_Then_zero() {
		assertEquals(0, CalculateRotation.shiftedDiff("Esham", "Esham"));
	}
}

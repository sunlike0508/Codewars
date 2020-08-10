package codewar.com.BuildAPileOfCubes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class BuildAPileOfCubesTest {

	@Disabled
	@Test
	public void test_Given_4183059834009L() {
		assertEquals(2022, BuildAPileOfCubes.findNb(4183059834009L)); 
	}
	
	@Disabled
	@Test
	public void test_Given_24723578342962L() {
		assertEquals(-1, BuildAPileOfCubes.findNb(24723578342962L)); 
	}
	
	@Disabled
	@Test
	public void test_Given_135440716410000L() {
		assertEquals(4824, BuildAPileOfCubes.findNb(135440716410000L)); 
	}
	
	@Disabled
	@Test
	public void test_Given_40539911473216L() {
		assertEquals(3568, BuildAPileOfCubes.findNb(40539911473216L)); 
	}
	
	@Test
	public void test_Given_2270154126080394225L() {
		assertEquals(54894, BuildAPileOfCubes.findNb(2270154126080394225L)); 
	}

}

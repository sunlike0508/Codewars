package codewar.com.ProdFib;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdFibTest {
	
//	@Test
//	public void FibonacciTest1() {
//		assertEquals(55, ProdFib.Fibonacci(10));
//	}
//	
//	@Test
//	public void FibonacciTest2() {
//		assertEquals(1, ProdFib.Fibonacci(1));
//	}
//	
//	@Test
//	public void FibonacciTest3() {
//		assertEquals(233, ProdFib.Fibonacci(13));
//	}

	@Test
	public void test1() {
		long[] r = new long[] { 55, 89, 1 };
		assertArrayEquals(r, ProdFib.productFib(4895));
	}

	@Test
	public void test2() {
		long[] r = new long[] { 89, 144, 0 };
		assertArrayEquals(r, ProdFib.productFib(5895));
	}

	@Test
	public void test3() {
		long[] r = new long[] { 6765, 10946, 1 };
		assertArrayEquals(r, ProdFib.productFib(74049690));
	}

	@Test
	public void test4() {
		long[] r = new long[] { 10946, 17711, 0 };
		assertArrayEquals(r, ProdFib.productFib(84049690));
	}

	@Test
	public void test5() {
		long[] r = new long[] { 10946, 17711, 1 };
		assertArrayEquals(r, ProdFib.productFib(193864606));
	}

	@Test
	public void test6() {
		long[] r = new long[] { 610, 987, 0 };
		assertArrayEquals(r, ProdFib.productFib(447577));
	}

	@Test
	public void test7() {
		long[] r = new long[] { 610, 987, 1 };
		assertArrayEquals(r, ProdFib.productFib(602070));
	}

	@Test
	public void test8() {
		long[] r = new long[] { 832040, 1346269, 0 };
		assertArrayEquals(r, ProdFib.productFib(602070602070L));
	}

	@Test
	public void test9() {
		long[] r = new long[] { 832040, 1346269, 1 };
		assertArrayEquals(r, ProdFib.productFib(1120149658760L));
	}

	@Test
	public void test10() {
		long[] r = new long[] { 1346269, 2178309, 1 };
		assertArrayEquals(r, ProdFib.productFib(2932589879121L));
	}

	@Test
	public void test11() {
		long[] r = new long[] { 1, 1, 1 };
		assertArrayEquals(r, ProdFib.productFib(1));
	}

	@Test
	public void test12() {
		long[] r = new long[] { 1836311903L, 2971215073L, 0 };
		assertArrayEquals(r, ProdFib.productFib(4456077604922913920L));
	}

}

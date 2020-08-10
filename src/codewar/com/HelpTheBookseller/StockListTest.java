package codewar.com.HelpTheBookseller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StockListTest {

	@Test
	public void test1() {
		String art[] = new String[] { "ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600" };
		String cd[] = new String[] { "A", "B" };
		assertEquals("(A : 200) - (B : 1140)", StockList.stockSummary(art, cd));
	}
	
	@Test
	public void test2() {
		String art[] = new String[] { "BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600" };
		String cd[] = new String[] { "A", "B", "C", "D" };
		assertEquals("(A : 0) - (B : 1290) - (C : 515) - (D : 600)", StockList.stockSummary(art, cd));
	}
}

package codewar.com.thirteen;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

class ThirteenTest {
	
//    testing(Thirteen.thirt(8529), 79);
//    testing(Thirteen.thirt(85299258), 31);
//    testing(Thirteen.thirt(5634), 57);
//    testing(Thirteen.thirt(1111111111), 71);
//    testing(Thirteen.thirt(987654321), 30);

	@Test
	void test() {
		assertThat(Thirteen.thirt(1234567), is(87L));
	}
	
	@Test
	void test2() {
		assertThat(Thirteen.thirt(8529), is(79L));
	}
	
	@Test
	void test3() {
		assertThat(Thirteen.thirt(85299258), is(31L));
	}

}

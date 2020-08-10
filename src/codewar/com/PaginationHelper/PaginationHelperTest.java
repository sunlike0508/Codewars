package codewar.com.PaginationHelper;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.experimental.theories.Theory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PaginationHelperTest<I> {
	
	@Test
	@DisplayName("Test itemCount method when arrays count is 6 and itemsPerPage is 4")
	void test_itemCount_when_arrays_count_is_six_and_itemPerPage_is_four() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
		assertEquals(6, helper.itemCount());
	}
	
	@Test
	@DisplayName("Test itemCount method when arrays count is 0 and itemsPerPage is 4")
	void test_itemCount_when_arrays_count_is_zero_and_itemPerPage_is_four() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList(), 4);
		assertEquals(0, helper.itemCount());
	}

	@Test
	@DisplayName("Test pageCount method when arrays count is 6 and itemsPerPage is 4")
	void test_pageCount_method_when_arrays_count_is_six_and_itemPerPage_is_four() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
		assertEquals(2, helper.pageCount());
	}
	
	@Test
	@DisplayName("Test pageCount method when arrays count is 1 and itemsPerPage is 4")
	void test_pageCount_method_when_arrays_count_is_0_and_itemPerPage_is_four() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList('a'), 4);
		assertEquals(1, helper.pageCount());
	}
	
	@Test
	@DisplayName("Test pageItemCount method when arrays count is 6 and itemsPerPage is 4 and page index zero")
	void test_pageItemCount_method_when_arrays_count_is_six_and_itemPerPage_is_four_and_page_index_zero() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
		assertEquals(4, helper.pageItemCount(0));
	}
	
	@Test
	@DisplayName("Test pageItemCount method when arrays count is 6 and itemsPerPage is 4 and page index 1")
	void test_pageItemCount_method_when_arrays_count_is_six_and_itemPerPage_is_four_and_page_index_one() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
		assertEquals(2, helper.pageItemCount(1));
	}
	
	@Test
	@DisplayName("Test pageItemCount method when arrays count is 6 and itemsPerPage is 4 and page index 2")
	void test_pageItemCount_method_when_arrays_count_is_six_and_itemPerPage_is_four_and_page_index_two() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
		assertEquals(-1, helper.pageItemCount(2));
	}
	
	@Test
	@DisplayName("Test pageIndex method when arrays count is 6 and itemsPerPage is 4 and item index 5")
	void test_pageIndex_method_when_arrays_count_is_six_and_itemPerPage_is_four_and_item_index_five() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
		assertEquals(1, helper.pageIndex(5));
	}
	
	@Test
	@DisplayName("Test pageIndex method when arrays count is 6 and itemsPerPage is 4 and item index 2")
	void test_pageIndex_method_when_arrays_count_is_six_and_itemPerPage_is_four_and_item_index_two() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
		assertEquals(0, helper.pageIndex(2));
	}
	
	@Test
	@DisplayName("Test pageIndex method when arrays count is 6 and itemsPerPage is 4 and item index 20")
	void test_pageIndex_method_when_arrays_count_is_six_and_itemPerPage_is_four_and_item_index_twenty() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
		assertEquals(-1, helper.pageIndex(20));
	}
	
	@Test
	@DisplayName("Test pageIndex method when arrays count is 6 and itemsPerPage is 4 and item index minus 10")
	void test_pageIndex_method_when_arrays_count_is_six_and_itemPerPage_is_four_and_item_index_minus_ten() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
		assertEquals(-1, helper.pageIndex(-10));
	}
	
	@Test
	@DisplayName("Test pageIndex method when arrays count is empty and itemsPerPage is 4 and item index minus 0")
	void test_pageIndex_method_when_arrays_count_is_empty_and_itemPerPage_is_four_and_item_index_minus_zero() {
		PaginationHelper<I> helper = new PaginationHelper(Arrays.asList(), 4);
		assertEquals(-1, helper.pageIndex(0));
	}


}

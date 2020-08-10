package codewar.com.PaginationHelper;

import java.util.List;

public class PaginationHelper<I> {
	
	List<I> collection;
	int itemCount = 0;
	int itemsPerPage = 0;
	int pageCount = 0;

	/**
	 * The constructor takes in an array of items and a integer indicating how many
	 * items fit within a single page
	 */
	public PaginationHelper(List<I> collection, int itemsPerPage) {
		this.collection = collection;
		this.itemCount = collection.size();
		this.itemsPerPage = itemsPerPage;
		this.pageCount = collection.size()/itemsPerPage + 1;
	}

	/**
	 * returns the number of items within the entire collection
	 */
	public int itemCount() {
		return itemCount;
	}

	/**
	 * returns the number of pages
	 */
	public int pageCount() {
		return pageCount;
	}

	/**
	 * returns the number of items on the current page. page_index is zero based.
	 * this method should return -1 for pageIndex values that are out of range
	 */
	public int pageItemCount(int pageIndex) {
		if(pageCount > pageIndex + 1) {
			return itemsPerPage;
		} else if(pageCount == pageIndex + 1) {
			return itemCount % itemsPerPage;
		} else {
			return -1;
		}
	}

	/**
	 * determines what page an item is on. Zero based indexes this method should
	 * return -1 for itemIndex values that are out of range
	 */
	public int pageIndex(int itemIndex) {
		
		if(itemIndex < 0 || itemIndex >=itemCount) {
			return -1;
		}
		
		return itemIndex/itemsPerPage;
	}
}

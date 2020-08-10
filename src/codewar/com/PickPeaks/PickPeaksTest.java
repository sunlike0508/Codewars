package codewar.com.PickPeaks;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PickPeaksTest {

	private static int[][] array = { 
			{ 1, 2, 3, 6, 4, 1, 2, 3, 2, 1 }, 
			{ 3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3 },
			{ 3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 2, 2, 1 }, 
			{ 2, 1, 3, 1, 2, 2, 2, 2, 1 }, 
			{ 2, 1, 3, 1, 2, 2, 2, 2 },
			{ 1, 2, 5, 4, 3, 2, 3, 6, 4, 1, 2, 3, 3, 4, 5, 3, 2, 1, 2, 3, 5, 5, 4, 3}
			};

	private static int[][] posS = { { 3, 7 }, { 3, 7 }, { 3, 7, 10 }, { 2, 4 }, { 2 }, {2, 7, 14, 20} };

	private static int[][] peaksS = { { 6, 3 }, { 6, 3 }, { 6, 3, 2 }, { 3, 2 }, { 3 }, {5, 6, 5, 5} };
	
	@Disabled
	@Test
	public void sampleTests() {
		for (int n = 0; n < array.length; n++) {
			final int[] p1 = posS[n], p2 = peaksS[n];
			
			Map<String, List<Integer>> expected = new HashMap<String, List<Integer>>() {
				{
					put("pos", Arrays.stream(p1).boxed().collect(Collectors.toList()));
					put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
				}
			};
			
			assertEquals(expected, PickPeaks.getPeaks(array[n]));
		}
	}
}

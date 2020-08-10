package codewar.com.CreatePhoneNumber;

import java.util.stream.IntStream;

public class CreatePhoneNumber {
	public static String createPhoneNumber(int[] numbers) {	
//		return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
//				numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],
//				numbers[6],numbers[7],numbers[8],numbers[9]);
		
		return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(numbers).boxed().toArray());
	}
}

package codewar.com.multiplesof3or5;

public class multiplesof3or5 {

	public int solution(int number) {
		
		int sum = 0;
		
		for(int i = 3; i < number; i++) {
			
			if((i%3 == 0) || (i%5 == 0)) {
				sum+=i;
				
				System.out.println(i);
			}
		}
		
		return sum;
	}
}

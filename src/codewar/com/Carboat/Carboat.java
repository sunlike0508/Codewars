package codewar.com.Carboat;

public class Carboat {
	public static String howmuch(int m, int n) {
		
		if(m > n) {
			int temp = m;
			m = n;
			n = temp;
		}
		
		int carCount = (m % 9 == 0) ? m / 9 : m / 9 + 1;
		int boatCount = m / 7;
		int carCost = 0;
		int boatCost = 0;
		
		String result = "";
		
		do {
			carCost = carCount * 9 + 1;
			boatCost = 7 * boatCount + 2;
			
			System.out.println(carCost);
			
			if(carCost == boatCost) {
				result += "[M: " + carCost + " B: " + boatCount + " C: " + carCount + "]";
			}
			
			if(carCost - boatCost >= 7 ) {
				boatCount++;
			} else {
				carCount++;
			}
			
		} while(carCost <= n && boatCost <= n);
		
		return "[" + result + "]";
	}
}

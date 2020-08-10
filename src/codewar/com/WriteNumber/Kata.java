package codewar.com.WriteNumber;

import java.util.Collections;

public class Kata {
	public static String expandedForm(int num) {
		
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
            
            System.out.println(outs + " " + num);
      
        }
        outs = num + outs;
        
        return outs;
//		int size = (int) (Math.log10(num) + 1);
//		String[] expandNum = new String[String.valueOf(num).replace("0", "").length()];
//		
//		for(int i = 0, j = expandNum.length -1 ; i < size; i++) {
//			
//			int rest = num % 10;
//			num = num/ 10;
//			
//			if(rest != 0) {
//				expandNum[j] = String.valueOf(rest * (int)(Math.pow(10, i)));
//				j--;
//			}
//		}
//		
//		return String.join(" + ", expandNum);
	}

}
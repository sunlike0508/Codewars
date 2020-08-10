package codewar.com.Palindromes;

public class Palindromes {
	public static int longestPalindrome(final String s) {
		String original = s;
		//String original = s.replace(" ", ""); /// 1번
		
		for(int i = original.length(); i >= 1 ; i--) {
			
			for(int j = 0; j <= original.length() - i; j++) {
				
				if(isPalindrome(original.substring(j, j+i))){
					return i;
				}
				
				/*
				if(reverse.contains(original.substring(j, j+i))){ /// 2번
					return i;
				}
				*/
			}
		}
		
		return 0;
	}

	private static boolean isPalindrome(String substring) {
		String reverse = new StringBuilder(substring).reverse().toString();
		
		return reverse.equals(substring);
	}
}


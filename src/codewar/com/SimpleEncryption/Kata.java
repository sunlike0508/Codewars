package codewar.com.SimpleEncryption;

public class Kata {
	
	public static String encrypt(final String text, final int n) {
	
		String encryptText = text;
		
		for(int i = 0; i < n ; i++) {
			String tempText = "";
			
			for(int j = 1; j < text.length(); j+=2) {
				tempText += encryptText.substring(j, j+1);
			}
			
			for(int j = 0; j < text.length(); j+=2) {
				tempText += encryptText.substring(j, j+1);
			}
			
			encryptText = tempText;
		}
		
		return encryptText;
	}

	public static String decrypt(final String encryptedText, final int n) {
		
		String decryptText = encryptedText;
		
		for(int i = 0; i < n ; i++) {
			String tempText = "";
			String even = decryptText.substring(0, decryptText.length()/2);
			String odd = decryptText.substring(decryptText.length()/2, decryptText.length());
			
			for(int j = 0; j < even.length(); j++) {
				tempText += odd.substring(j,j+1);
				tempText += even.substring(j,j+1);
			}
			
			if(odd.length() !=even.length()) {
				tempText += odd.substring(odd.length()-1);
			}
			
			decryptText = tempText;
		}
		
		return decryptText;
	}
}

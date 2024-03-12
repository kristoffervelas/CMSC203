
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;


	public static boolean isStringInBounds (String plainText) {
		int len = plainText.length();
		for (int i = 0; i < len; i++) {
			if (plainText.charAt(i) < LOWER_BOUND || plainText.charAt(i) > UPPER_BOUND) {
				return false;
			}
		}
		return true;
	}

	public static String caesarEncryption(String plainText, int key) {

		if (!isStringInBounds(plainText)) {
			return "The selected string is not in bounds, Try again.";
		}

		String encrypted = "";
		key%=RANGE;
		int size = plainText.length();
		for (int i = 0; i < size; i++) {
			int c = (int)plainText.charAt(i) + key;
			while(c > UPPER_BOUND) {
				c-=RANGE;
			}
			encrypted+=(char)c;
		}
		return encrypted;
	}
	

	public static String bellasoEncryption(String plainText, String bellasoStr) {

		if (!isStringInBounds(plainText) || !isStringInBounds(bellasoStr)) {
			return "The selected string is not in bounds, Try again.";
		}
		
		String encrypted = "";
		int size = plainText.length();
		
		for (int i = 0; i < size; i++) {
			int j = i % bellasoStr.length();
			int c = plainText.charAt(i) + bellasoStr.charAt(j);
			
			while (c > UPPER_BOUND) {
				c-=RANGE;
			}
			encrypted+=(char)c;
		}
		return encrypted;
	}
	

	public static String caesarDecryption(String encryptedText, int key) {

		if (!isStringInBounds(encryptedText)) {
			return "The selected string is not in bounds, Try again.";
		}

		String decrypted = "";
		key%=RANGE;
		int size = encryptedText.length();
		for (int i = 0; i < size; i++) {
			int c = (char)(encryptedText.charAt(i) - key);
			while (c < LOWER_BOUND) {
				c+=RANGE;
			}
			decrypted+=(char)c;
		}
		return decrypted;
	}
	

	public static String bellasoDecryption(String encryptedText, String bellasoStr) {

		if (!isStringInBounds(encryptedText) || !isStringInBounds(bellasoStr)) {
			return "The selected string is not in bounds, Try again.";
		}

		String decrypted = "";
		int size = encryptedText.length();
		
		for (int i = 0; i < size; i++) {
			int j = i % bellasoStr.length();
			int c = encryptedText.charAt(i) - bellasoStr.charAt(j);
			
			while (c < LOWER_BOUND) {
				c+=RANGE;
			}
			decrypted+=(char)c;
		}
		return decrypted;
	}
}
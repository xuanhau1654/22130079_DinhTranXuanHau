package Task3;


	public class CaesarCipher {
	    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	    public static String encrypt(String plaintext, int shift) {
	        StringBuilder encryptedText = new StringBuilder();

	        for (char c : plaintext.toCharArray()) {
	            if (Character.isLetter(c)) {
	                boolean isUpperCase = Character.isUpperCase(c);
	                char lowerC = Character.toLowerCase(c);
	                int index = ALPHABET.indexOf(lowerC);
	                int encryptedIndex = (index + shift) % ALPHABET.length();
	                if (encryptedIndex < 0) {
	                    encryptedIndex += ALPHABET.length();
	                }
	                char encryptedChar = ALPHABET.charAt(encryptedIndex);
	                if (isUpperCase) {
	                    encryptedText.append(Character.toUpperCase(encryptedChar));
	                } else {
	                    encryptedText.append(encryptedChar);
	                }
	            } else {
	                // Keep non-alphabet characters as they are
	                encryptedText.append(c);
	            }
	        }

	        return encryptedText.toString();
	    }

	    public static String decrypt(String ciphertext, int shift) {
	        return encrypt(ciphertext, -shift);
	    }

	    public static void main(String[] args) {
	        String plaintext = "xuan Hau ";
	        int shift = 3;

	        String encryptedText = encrypt(plaintext, shift);
	        System.out.println("Encrypted Text: " + encryptedText);

	        String decryptedText = decrypt(encryptedText, shift);
	        System.out.println("Decrypted Text: " + decryptedText);
	    }
	}



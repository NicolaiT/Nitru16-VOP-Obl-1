package ancient_encryption;

/**
 *
 * @author erso Udleveret driver klasse til opgave 2, VOP eksamen 10 juni 2016
 */
public class CipherDriver {

	private String message = "Her har vi en Meddelelse, som er hemmelig!";

	public String getMessage(){
		return message;
	}
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		CipherDriver crypto = new CipherDriver();
		
		System.out.println("Original: \n" + crypto.getMessage());

		AtbashCipher cipher = new AtbashCipher();
		String enc = cipher.encrypt(crypto.getMessage());

		System.out.println("Atbash: \n" + enc);
		System.out.println(cipher.decrypt(enc));

		CeasarCipher cipher2 = new CeasarCipher(13);
		enc = cipher2.encrypt(crypto.getMessage());
		System.out.println("Ceasar 13: \n" + enc);
		System.out.println(cipher2.decrypt(enc));
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ancient_encryption;

/**
 *
 * @author Nicolai
 */
public class CeasarCipher extends AbstractCipher {

	private int rotFactor;

	public CeasarCipher(int rotFactor) {
		this.rotFactor = rotFactor;
	}

	@Override
	public String encrypt(String message) {
		String encryptedMsg = "";
		char[] msg = message.toCharArray();
		for (int i = 0; i < msg.length; i++) {
			char temp = msg[i];
			int index = findCharIndex(temp);
			if (index == -1) {
				encryptedMsg += temp;
				continue;
			}
			int replaceIdx = (index + rotFactor) % ALPHABETH.length; 
			char replace = ALPHABETH[replaceIdx];
			encryptedMsg += replace;
		}
		return encryptedMsg;
	}

	@Override
	public String decrypt(String encrypted) {
		String decryptedMsg = "";
		char[] msg = encrypted.toCharArray();
		for (int i = 0; i < msg.length; i++) {
			char temp = msg[i];
			int index = findCharIndex(temp);
			if (index == -1) {
				decryptedMsg += temp;
				continue;
			}
			int replaceIdx = (index - rotFactor + ALPHABETH.length) % ALPHABETH.length;
			char replace = ALPHABETH[replaceIdx];
			decryptedMsg += replace;
		}
		return decryptedMsg;
	}

}

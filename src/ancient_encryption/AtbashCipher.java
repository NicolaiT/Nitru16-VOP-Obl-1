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
public class AtbashCipher extends AbstractCipher {

	@Override
	public String encrypt(String original) {
		String encryptedMsg = "";
		char[] msg = original.toCharArray();
		for (int i = 0; i < msg.length; i++) {
			char temp = msg[i];
			int index = findCharIndex(temp);
			if (index == -1) {
				encryptedMsg += temp;
				continue;
			}
			int replaceIdx = ALPHABETH.length - index - 1;
			char replace = ALPHABETH[replaceIdx];
			encryptedMsg += replace;
		}
		return encryptedMsg;
	}

	@Override
	public String decrypt(String encrypted) {
		return encrypt(encrypted);
	}

}

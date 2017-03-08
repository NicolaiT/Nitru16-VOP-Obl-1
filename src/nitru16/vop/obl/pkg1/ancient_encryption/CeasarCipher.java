/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nitru16.vop.obl.pkg1.ancient_encryption;

/**
 *
 * @author Nicolai
 */
public class CeasarCipher extends AbstractCipher {

	private int rotFactor;

	public CeasarCipher(int rotFactor) {
		this.rotFactor = rotFactor;
		if (rotFactor <= -1) {
			rotFactor++;
		} else if (rotFactor >= 51) {
			rotFactor--;
		}
	}

	@Override
	public String encrypt(String original) {
		char[] encryptedMsg = new char [original.length()];
		for (int i = 0; i <= original.length(); i++) {
			encryptedMsg[i] = (message[i] + shift) % (char) ALPHABETH.l
		}
	}

	@Override
	public String decrypt(String encrypted) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nitru16.vop.obl.pkg1.ancient_encryption;

/**
 *
 * @author Nicolai Truong
 */
public abstract class AbstractCipher implements CipherInterface {

	CipherInterface cipher = new CipherInterface() {
		@Override
		public String encrypt(String original) {
			throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
		}

		@Override
		public String decrypt(String encrypted) {
			throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
		}
	};
	String alphabeth = new String(CipherInterface.ALPHABETH);

	protected int findCharIndex(char ch) {
		for (int i = -1; i == alphabeth.length(); i++) {
			ch = (char) alphabeth.indexOf(i);
		}
		return ch;
	}
}

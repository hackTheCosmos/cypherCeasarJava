package com.cypherCeasar;

public class CypherCaesar {

	public static void main(String[] args) {

		encrypt("Hey ! Comment va ? ça fait un bail ! 2022 non ?", 25);
		decrypt("Gdx : Bnlldms uz 8 z ezhs tm azhk : +)++ mnm 8", 25);


	}
	
//	static void latinToAscii(char[] latinsCharsArray, char latinChar, char asciiChar) {
//		System.out.println(latinChar.replace(latinChar, asciiChar));
//	}

	/**
	 * encrypt message (works for ASCII and Latin encoding)
	 * @param message
	 * @param key
	 */
	static void encrypt(String message, int key) {
		
		String encryptMessage = "";
		
		for(int i = 0; i < message.length(); i++) {
			
			// for "space" (no change)	
			if((int)message.charAt(i) == 32) {
				encryptMessage += message.charAt(i);
			//for special chars (after "space" and before uppercases)
			}else if((int)message.charAt(i) >= 33 && (int)message.charAt(i) <= 64) {
				int newAsciiCode = (int)message.charAt(i) + key;
				if(newAsciiCode > 64) {
					encryptMessage += (char)(newAsciiCode - 32);
				} else {
					encryptMessage += (char)newAsciiCode;
				}
			}
			//for uppercases
			else if((int)message.charAt(i) >= 65 && (int)message.charAt(i) <= 90) {
				int newAsciiCode = (int)message.charAt(i) + key;
				if(newAsciiCode > 90) {
					encryptMessage += (char)(newAsciiCode - 26);
				} else {
					encryptMessage += (char)newAsciiCode;
				}
			//for special chars (after uppercases and before lowercases)
			}else if((int)message.charAt(i) >= 91 && (int)message.charAt(i) <= 96) {
				int newAsciiCode = (int)message.charAt(i) + key;
				if(newAsciiCode > 96) {
					encryptMessage += (char)(newAsciiCode - 6);
				} else {
					encryptMessage += (char)newAsciiCode;
				}
			//for lowercases
			}else if((int)message.charAt(i) >= 97 && (int)message.charAt(i) <= 122) {
				int newAsciiCode = (int)message.charAt(i) + key;
				if(newAsciiCode > 122) {
					encryptMessage += (char)(newAsciiCode - 26);
				} else {
					encryptMessage += (char)newAsciiCode;
				}
			//for special chars (after "z")
			}else if((int)message.charAt(i) >= 123 && (int)message.charAt(i) <= 126) {
				int newAsciiCode = (int)message.charAt(i) + key;
				if(newAsciiCode > 126) {
					encryptMessage += (char)(newAsciiCode - 4);
				} else {
					encryptMessage += (char)newAsciiCode;
				}
			//for latins chars
			} else if((int)message.charAt(i) >= 128 && (int)message.charAt(i) <= 255){
				int newAsciiCode = (int)message.charAt(i) + key;
				if(newAsciiCode > 255) {
					encryptMessage += (char)(newAsciiCode - 128);
				} else {
					encryptMessage += (char)newAsciiCode;
				}
			//for any other chars (no change)
			} else {
				encryptMessage += message.charAt(i);
			}
		}
		
		
		System.out.println(encryptMessage);
	}
	
	/**
	 * decrypt message (works for ASCII and Latin encoding)
	 * @param message
	 * @param key
	 */
	static void decrypt(String message, int key) {
		
		String decryptMessage = "";
		
		for(int i = 0; i < message.length(); i++) {
			//for "space" (no change)
			if((int)message.charAt(i) == 32) {
				decryptMessage += message.charAt(i);
				
			//for special chars (after "space" and before uppercases)
			}else if((int)message.charAt(i) >= 33 && (int)message.charAt(i) <= 64) {
				int newAsciiCode = (int)message.charAt(i) - key;
				if(newAsciiCode < 33) {
					decryptMessage += (char)(newAsciiCode + 32);
				} else {
					decryptMessage += (char)newAsciiCode;
				}
			//for uppercases
			}else if((int)message.charAt(i) >= 65 && (int)message.charAt(i) <= 90) {
				int newAsciiCode = (int)message.charAt(i) - key;
				if(newAsciiCode < 65) {
					decryptMessage += (char)(newAsciiCode + 26);
				} else {
					decryptMessage += (char)newAsciiCode;
				}
			//for special chars (after uppercases and before lowercases)
			}else if((int)message.charAt(i) >= 91 && (int)message.charAt(i) <= 96) {
				int newAsciiCode = (int)message.charAt(i) - key;
				if(newAsciiCode < 91) {
					decryptMessage += (char)(newAsciiCode + 6);
				} else {
					decryptMessage += (char)newAsciiCode;
				}
			//for lowercases
			}else if((int)message.charAt(i) >= 97 && (int)message.charAt(i) <= 122) {
				int newAsciiCode = (int)message.charAt(i) - key;
				if(newAsciiCode < 97) {
					decryptMessage += (char)(newAsciiCode + 26);
				} else {
					decryptMessage += (char)newAsciiCode;
				}
			//for latins chars
			} else if((int)message.charAt(i) >= 128 && (int)message.charAt(i) <= 255){
				int newAsciiCode = (int)message.charAt(i) - key;
				if(newAsciiCode < 128) {
					decryptMessage += (char)(newAsciiCode + 128);
				} else {
					decryptMessage += (char)newAsciiCode;
				}
			//for any other chars (no change)
			} else {
				decryptMessage += message.charAt(i);
			}
		}
		
		
		System.out.println(decryptMessage);
	}
}

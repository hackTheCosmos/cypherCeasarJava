package com.cypherCeasar;

public class CypherCaesar {

	public static void main(String[] args) {

//		encrypt("salut ! Crypt moi, stp ?", 4);
//		decrypt("Irgvctx qi", 4);
		int temp = 199 ;
		System.out.print((char)temp);

	}

	
	/**
	 * encrypt a message
	 * @param message
	 * @param key
	 */
	static void encrypt(String message, int key) {
		// on créer la variable qui va contenir le texte chiffré
		String encryptMessage = "";

		
		//on parcours le texte à chiffrer
		for (int i = 0; i < message.length(); i++) {
			// on gère le cas où le caractère est un espace
			if ((int)message.charAt(i) == 32) {
				encryptMessage += (char)32;
			//on gère le cas où l'on va trop loin dans la table ASCII (le max que l'on veut est à 122 : "z" minuscule)
			} else if ( ((int)message.charAt(i) + key) > 122) {
				int temp = ((int)message.charAt(i) + key) - 122;
				encryptMessage += (char)(temp + 96);// les lettres minuscules commences à 97 dans la table ASCII
				
			//on gère le cas ou on n'est entre les lettres majuscules et les lettres minuscules dans la table ASCII (soit pour 90 < c < 97)
			} else if (((int)message.charAt(i) + key) > 90 && (int)message.charAt(i) < 97) {
				int temp = (((int)message.charAt(i) + key) - 90);
				encryptMessage += (char)(temp + 64); //les lettres majuscules commences à 65 dans la table ASCII
			} else if(((int)message.charAt(i) + key) > 32){
				encryptMessage += (char)((int)message.charAt(i) + key);
			}
		}
		

		System.out.println(encryptMessage);
	}
	
	/**
	 * decrypt a message
	 * @param message
	 * @param key
	 */
	static void decrypt(String message, int key) {
		// on créer la variable qui va contenir le texte déchiffré
		String decryptMessage = "";

		
		//on parcours le texte à déchiffrer
		for (int i = 0; i < message.length(); i++) {
			// on gère le cas où le caractère est un espace
			if ((int)message.charAt(i) == 32) {
				decryptMessage += (char)32;
			//on gère le cas où l'on est entre l'espace et les majuscules dans la table ASCII (soit 32 < c < 65)
			} else if ( ((int)message.charAt(i) - key) > 32 && ((int)message.charAt(i) < 65)) {
				int temp = ((int)message.charAt(i) - key) - 122;
				decryptMessage += (char)(temp + 96);
				// les lettres minuscules commences à 97 dans la table ASCII
		
			//on gère le cas ou on n'est entre les lettres majuscules et les lettres minuscules dans la table ASCII (soit pour 90 < c < 97)
			} else if (((int)message.charAt(i) - key) > 90 && (int)message.charAt(i) < 97) {
				int temp = (((int)message.charAt(i) - key) - 90);
				decryptMessage += (char)(temp + 64); //les lettres majuscules commences à 65 dans la table ASCII
			} else {
				decryptMessage += (char)((int)message.charAt(i) - key);
			}
		}
		

		System.out.println(decryptMessage);
	}
}

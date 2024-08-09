package com.cypherCeasar;

public class CypherCaesar {

	public static void main(String[] args) {

		decypher("bCd", 1);

	}

	static void cypher(String text, int key) {
		// on créer la variable qui va contenir le texte chiffré
		String cypherText = "";
		// on met le texte en minuscule
		text = text.toLowerCase();

		// on parcours le texte caractère par caractère
		for (char ch : text.toCharArray()) {
			// on vérifie si le caractère est dans l'alphabet
			char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
					'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
			for (int i = 0; i < alphabet.length; i++) {
				// si le caractère est dans l'alphabet
				if (alphabet[i] == ch) {
					// on fait la substitution
					char cypherChar = alphabet[(i + key) % 26];
					// on ajoute ensuite chaque caractère chiffré au texte chiffré
					cypherText = cypherText + cypherChar;
				}
			}
		}
		System.out.print(cypherText);
	}

	static void decypher(String text, int key) {

		// on créer la variable qui va contenir le texte déchiffré
		String decypherText = "";
		// on met le texte en minuscule
		text = text.toLowerCase();

		// on parcours le texte caractère par caractère
		for (char ch : text.toCharArray()) {
			// on vérifie si le caractère est dans l'alphabet
			char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
					'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
			for (int i = 0; i < alphabet.length; i++) {
				// si le caractère est dans l'alphabet
				if (alphabet[i] == ch) {
					// on fait la substitution
					char decypherChar = alphabet[(i - key) % 26];
					// on ajoute ensuite chaque caractère chiffré au texte chiffré
					decypherText = decypherText + decypherChar;
				}
			}
		}
		System.out.print(decypherText);
	}
}

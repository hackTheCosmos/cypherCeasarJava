package com.cypherCeasar;

public class CypherCaesar {

	public static void main(String[] args) {

//		cypher("ABCDE", 1);
//		decypher("bcd efg hi j", 1);

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
					'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ' };
			// pour chaque lettre de l'alphabet
			for (int i = 0; i < alphabet.length; i++) {
				// si le caractère correspond à une lettre de l'alphabet
				if (alphabet[i] == ch && ch != ' ') {
					// on fait la substitution
					char cypherChar = alphabet[(i + key) % 26];
					// on ajoute ensuite chaque caractère chiffré au texte chiffré
					cypherText = cypherText + cypherChar;
					// si le caractère est un espace
				} else if (ch == ' ') {
					// on ajoute l'espace sans substitution au texte chiffré
					cypherText = cypherText + ch;
					// on sort de la boucle pour éviter les répétitions
					i = alphabet.length;
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
					'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' ' };
			for (int i = 0; i < alphabet.length; i++) {
				// si le caractère est dans l'alphabet
				if (alphabet[i] == ch && ch != ' ') {
					// on fait la substitution
					char decypherChar = alphabet[(i - key) % 26];
					// on ajoute ensuite chaque caractère déchiffré au texte déchiffré
					decypherText = decypherText + decypherChar;
				} else if (ch == ' ') {
					// on ajoute l'espace sans substitution au texte déchiffré
					decypherText = decypherText + ch;
					// on sort de la boucle pour éviter les répétitions
					i = alphabet.length;
				}
			}
		}
		System.out.print(decypherText);
	}
}

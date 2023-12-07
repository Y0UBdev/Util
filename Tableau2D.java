package util;

public class Tableau2D {

	/**
	 * Fonction qui permet d’afficher ligne par ligne
	 * les valeurs d'un tableau de caractères à deux 
	 * dimensions.
	 * @param t Tableau2D (char)
	 */
	public static void afficher(char[][] t) {
		for (char[] ligne : t) {
			for (char c : ligne) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
	
}

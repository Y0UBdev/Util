package util;

public class TableauEntier {

    /**
     * Fonction qui fais en sorte qu'un tableau
     * ne puisse pas avoir 2 fois la même valeur
     * @param tableau Tableau Tirage
     * @return boolean(vrai ou faux)
     */
    public static boolean contient(int[] tableau, int a) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == a) {
                return true;
            }
        }
        return false;
    }

    /**
     * Fonction permettant de permuter des
     * élements dans une table
     * @param tableau tableau assignée
     * @param i valeur i assignée
     * @param j valeur j assignée
     */
    public static void permuter(int[] tableau, int i, int j) {
        // Déclaration variable Permutable
        int perm;
        // Affectation de Permutation
        perm = tableau[i];              // perm prend la valeur de [i] de tableau    Ex.: perm       = 3 de coeur
        tableau[i] = tableau[j];        // tableau[i] prend la valeur de tableau[j]  Ex.: tableau[i] = 9 de carreau
        tableau[j] = perm;              // tableau[j] prend la valeur de perm        Ex.: tableau[j] = 3 de coeur
    }

    /**
     * Fonction qui convertit un tableau en
     * Chaîne de Caractère
     * @param tableau Tableau
     * @return ChaîneDeCaractère(String)
     */
    public static String toString(int[] tableau) {
        String element = "";

        for (int i = 0; i < tableau.length; i++) {
            if (i == tableau.length-1) {
                element += tableau[i];
            } else {
                element += tableau[i] + ", ";
            }
        }
        return element;
    }

}
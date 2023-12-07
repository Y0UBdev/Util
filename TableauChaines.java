package util;

/**
 * Fonction(String) :
 *   1- permuter : permuter les valeurs d'un tableau
 *   2- melanger : melanger les valeurs d'un tableau
 *   3- toString : converti les valeurs d'un tableau en String
 *   4- contient : déterminer si une valeur est contenu dans un tableau
 */
public class TableauChaines {

    /**
     * Fonction qui permute à des positions déterminées, des valeurs
     * du tableau. Cette Fonction sera util pour la suivante (melanger)
     * @param tableau String[]
     * @param i Integer
     * @param j Integer
     */
    public static void permuter(String[] tableau, int i, int j) {
        // Déclaration variable Permutable
        String perm = " ";

        // Affectation de Permutation
        perm = tableau[i];              // perm prend la valeur de [i] de tableau    Ex.: perm       = 3 de coeur
        tableau[i] = tableau[j];        // tableau[i] prend la valeur de tableau[j]  Ex.: tableau[i] = 9 de carreau
        tableau[j] = perm;              // tableau[j] prend la valeur de perm        Ex.: tableau[j] = 3 de coeur
    }//Fin Permuter

    /**
     * Fonction qui mélange les cartes grâce à la Fonction permuter et
     * à la Fonction Random(génére un nombre aléatoire entre 0 et la
     * valeur de taille du tableau - 1).
     * @param tableau
     * @return
     */
    public static String[] melanger(String[] tableau) {
        // Traitement
        for (int i = 0; i < tableau.length; i++) {
            // Declaration Variable Aléatoire
            int randomA = Random.Random(0,tableau.length-1);
            int randomB = Random.Random(0,tableau.length-1);
            // Permuter
            permuter(tableau, randomA, randomB);
        }

        // Retourne
        return tableau;
    }//Fin Melanger

    /**
     * Fonction qui permet d'obtenir une chaîne de caractères
     * représentant les premiers éléments d'un tableau de chaînes
     * de caractères.
     * @param tableau
     * @param
     * @return
     */
    public static String toString(String[] tableau) {
        // Déclaration Variable
        String carte = "";

        // Convertir en String
        for (int i = 0; i < tableau.length; i++) {
            if (i == tableau.length-1) {
                carte += tableau[i];
            } else {
                carte += tableau[i] + ", ";
            }
        }

        // Retourne
        return carte;
    }//Fin toString

    /**
     * Fonction qui permet de déterminé si un tableau contient
     * une chaîne donnée.
     * @param t tableau donner
     * @param chaine la chaine
     * @return valeurBoolean
     */
    public static boolean contient(String[] t, String chaine) {
        for (int i = 0; i < t.length; i++) {
            // Déclararer Variable
            String mot = t[i]; // Prend le mot de la position i du tableau donnée

            // UpperCase
            mot = mot.toUpperCase();
            chaine = chaine.toUpperCase();

            // Comparer Variable String
            if (mot.equals(chaine)) {
                return true;
            }
        }
        return false;
    }//Fin contient
}
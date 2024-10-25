package org.example;
public class OccurrenceLettres {

    public void compterOccurrences(String ch) {
        // Convertir la chaîne en majuscules pour ignorer la différence
        ch = ch.toUpperCase();

        //  stocker le nombre d'occurrences des lettres (A à Z)
        int[] nb_occurrences = new int[26];

        // Parcourir  la chaîne
        for (int i = 0; i < ch.length(); i++) {
            char caractere = ch.charAt(i);


            if (caractere >= 'A' && caractere <= 'Z') {
                int index = caractere - 'A';
                nb_occurrences[index]++;
            }
        }

        // Afficher les lettres qui apparaissent au moins une fois
        System.out.println("\nLa chaîne \"" + ch + "\" contient :");
        for (int i = 0; i < 26; i++) {
            if (nb_occurrences[i] > 0) {
                char lettre = (char) (i + 'A'); // Convertir l'indice en lettre
                System.out.println(nb_occurrences[i] + " fois la lettre '" + lettre + "'");
            }
        }
    }
}



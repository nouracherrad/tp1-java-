package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer une ligne de texte
        System.out.print("Entrez une ligne de texte (max. 100 caractères) : ");
        String ch = sc.nextLine();

        // Instancier la classe OccurrenceLettres
        OccurrenceLettres occurrenceLettres = new OccurrenceLettres();

        // Appeler la méthode pour traiter la chaîne et afficher les occurrences
        occurrenceLettres.compterOccurrences(ch);

        // Fermer le scanner
        sc.close();
    }
}
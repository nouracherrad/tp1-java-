package org.example;

import java.util.Scanner;

public class operationSurChaine {
    private String chaine = "";
    Scanner sc = new Scanner(System.in);
    public void saisir() {
        System.out.print("Entrez une chaîne : ");
        chaine = sc.nextLine();
        System.out.println("La chaîne saisie est bien stockée : " + chaine);
    }public void afficher() {
        if (chaine.isEmpty()) {
            System.out.println("Aucune chaîne n'a été saisie.");
        } else {
            System.out.println("La chaîne saisie est : " + chaine);
        }
    }


    public void inverser() {
        if (chaine.isEmpty()) {
            System.out.println("Aucune chaîne n'a été saisie.");
        } else {
            String chaineReversée = new StringBuilder(chaine).reverse().toString();
            System.out.println("La chaîne inversée est : " + chaineReversée);
        }
    }


    public void nbrMots() {
        if (chaine.isEmpty()) {
            System.out.println("Aucune chaîne n'a été saisie.");
        } else {
            String[] mots = chaine.trim().split("\\s+");
            System.out.println("Le nombre de mots est : " + mots.length);
        }
    }
}


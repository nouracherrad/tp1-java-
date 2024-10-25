package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        operationSurChaine operationchaine = new operationSurChaine();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Veuillez choisir l'opération à effectuer :");
            System.out.println("1) Saisir une chaîne");
            System.out.println("2 ) Afficher la chaîne");
            System.out.println("3 ) Inverser la chaîne");
            System.out.println("4 ) Nombre de mots");
            System.out.println("5 ) Quitter");

            int operation = sc.nextInt();
            sc.nextLine();

            switch (operation) {
                case 1:
                    operationchaine.saisir();
                    break;
                case 2:
                    operationchaine.afficher();
                    break;
                case 3:
                    operationchaine.inverser();
                    break;
                case 4:
                    operationchaine.nbrMots();
                    break;
                case 5:
                    flag = false;
                    System.out.println("Fin du programme.");
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }

            if (flag) {
                System.out.println("Frappez une touche pour revenir au menu...");
                sc.nextLine();
            }
        }

        sc.close();
    }
}


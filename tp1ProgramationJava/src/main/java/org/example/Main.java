package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        gerernote interpreteur=new gerernote();
        Scanner sc = new Scanner(System.in);
        float [] tab=new float[20];
        for(int i =0;i<5;i++){
            System.out.println("Veuillez saisir un nombre :");
            float nombre = sc.nextFloat();
            tab[i]=nombre;}


        float[] tableau =interpreteur.trierAfficher(tab);
        for(float s:tableau){
        System.out.println(s);}
        float max=interpreteur.affichermax(tab);
        System.out.println("voici max"+max);
        float min =interpreteur.affichermin(tab);
        System.out.println("voici min"+min);
        float moy= interpreteur.noteMoy(tab);
        System.out.println("voici moy"+moy);
        int nombreetudiant=interpreteur.nbrEtudiant(tab);
        System.out.println("voici nombreetudiant"+nombreetudiant);

        }
    }

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     conjugaison conjuger =new conjugaison();
        Scanner sc=new Scanner(System.in);
        System.out.println("Veuillez saisir un verbe de 1er groupe:");
         String verbe  = sc.next();
         conjuger.conjuguer(verbe);
    }
}
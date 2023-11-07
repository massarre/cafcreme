package com.cafcreme;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // un euro equivaut à 100 centimes
        int prixCafe = 100;

        Scanner clavier = new Scanner(System.in);
        System.out.println(
                "Bonjour ! Je suis l'assistant de la machine à café. Dites-moi les pièces jaunes dont vous disposez :");

        // determiner le nombre de chaque piéces
        System.out.println("pièces de 1 cent ?");
        int unCent = clavier.nextInt();
        System.out.println("pièces de 5 cent ?");
        int cinqCents = clavier.nextInt();
        System.out.println("pièces de 10 cent ?");
        int dixCents = clavier.nextInt();
        System.out.println("pièces de 20 cent ?");
        int vingtCents = clavier.nextInt();
        System.out.println("pièces de 50 cent ?");
        int cinquanteCents = clavier.nextInt();
        // additionner les pieces
        int totale = unCent * 1 + cinqCents * 5 + dixCents * 10 + vingtCents * 20 + cinquanteCents * 50;

        // poser les conditions
        if (prixCafe > totale) {
            int ecart = prixCafe - totale;
            System.out.println("Il vous manque " + ecart + " cents pour prendre un café");

        } else if (prixCafe < totale) {
            int ecart = totale - prixCafe;
            System.out.println("Il vous restera " + ecart + " cents après avoir pris votre café");

        } else {
            System.out.println("Vous avez exactement de quoi vous payer le café");
        }

    }

}

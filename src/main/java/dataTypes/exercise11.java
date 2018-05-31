package dataTypes;

/*
Napisać program obliczający należny podatek dochodowy od osób zycznych.
Program ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie należny podatek.
Podatek obliczany jest wg. następujących reguł:
a. do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
b. od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00
 */

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total revenue value for last year: ");
        double revenue = sc.nextDouble();
        double tax = 0;

        if(revenue < 85528){
            tax = (0.18 * revenue) - 556.02;
        }else{
            tax = 14839.02 + (0.32 * (revenue - 85528));
        }

        System.out.println("Tax to pasy equals: " + tax);
    }
}

package strings;

/*
Napisz program który wczytuje od użytkownika tekst, a następnie dla tego tekstu zamienia
wszystkie wystąpienia przecinków (“, “) na słowo “makarena”.
 */

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();
        String replacedText = text.replace(",", "makarena");
        System.out.println(replacedText);

    }
}

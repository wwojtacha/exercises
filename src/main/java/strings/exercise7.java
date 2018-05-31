package strings;

/*
Napisz aplikację która przyjmuje od użytkownika tekst, a następnie zamienia cały tekst na:
a. same duże litery
b. same małe litery
 */

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = sc.nextLine();

        //a
        String toUpperCase = text.toUpperCase();
        System.out.println("Text in capital case: " + toUpperCase);

        //b
        String toLowerCase = text.toLowerCase();
        System.out.println("Text in lower case: " + toLowerCase);

    }
}

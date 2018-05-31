package loops;

/*

Napisać program, który wczytuje od użytkownika ciąg znaków
a następnie sprawdza, czy podany ciąg jest palindromem.

 */

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check if it is a palindrome: ");
        String inputText = sc.next();
        String reverseText = "";
        for (int i = inputText.length(); i > 0; i--) {
            char letter = inputText.charAt(i - 1);
            reverseText += letter;
        }
        System.out.printf("Reverse text: " + reverseText);
        System.out.println();
        if (reverseText.equals(inputText)) {
            System.out.println(inputText + " is a palndrome.");
        } else {
            System.out.println(inputText + " is NOT a palindrome.");

        }
    }
}

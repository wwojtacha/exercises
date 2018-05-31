package strings;

/*

 Zadeklaruj zmienną tekstową​ text​ i przypisz do niej jakąś wartość.
 a. sprawdź czy w tekście występuje słowo “ania”
 b. sprawdź czy tekst zaczyna się od słowa “ania”
 c. sprawdź czy tekst kończy się słowem “ania”
 d. sprawdź czy tekst równa się słowu “ania”
 e. sprawdź czy tekst (niezależnie od wielkości liter) zawiera słowo “ania”
 f. zwróć indeks (numer znaku/litery) pierwszego wystąpienia słowa “ania” w tekście

 */

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String text = sc.nextLine();

        //a
        if (text.contains("ania")){
            System.out.println("Word 'ania' appears in the text.");
        } else {
            System.out.println("Word 'ania' does NOT appear in the text.");
        }

        //b
        if (text.startsWith("ania")){
            System.out.println("Text starts with 'ania'.");
        } else {
            System.out.println("Text does NOT start with 'ania'.");
        }

        //c
        if (text.endsWith("ania")){
            System.out.println("Text ends with 'ania'.");
        } else {
            System.out.println("Text does NOT end with 'ania'.");
        }

        //d
        if ("ania".equals(text)){
            System.out.println("Text equals 'ania'.");
        } else {
            System.out.println("Text does NOT equal 'ania'.");
        }

        //e
        if (text.toLowerCase().contains("ania")){
            System.out.println("Word 'ania' appears in the text.");
        } else {
            System.out.println("Word 'ania' does NOT appear in the text.");
        }

        //f
        System.out.println("Word 'ania' appears for the first time at character of number: " + 1 + text.indexOf("ania"));
    }

}

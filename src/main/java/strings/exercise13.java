package strings;

/*
Napisz program, który sprawdzi, czy w podanym przez użytkownika wyrażeniu arytmetycznym nawiasy
są poprawnie sparowane. Wyrażenie podawane jest jako pojedynczy łańcuch znaków.
Program powinien wyświetlić stosowny komunikat.
Przykład a: "2 * (3.4 - (-7)/2)*(a-2)/(b-1)))"     Wynik: Błędne sparowanie nawiasów
Przykład b:  "(2 * (3.4 - (-7)/2)*(a-2)/(b-1))"     Wynik: OK
 */

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression containing parentheses: ");
        String text = sc.nextLine();
        int counter = 0;
        for (int i = 0; i < text.length(); i++){
            if ('(' == text.charAt(i)){
                counter++;
            } else if (')' == text.charAt(i)){
                counter--;
            }
        }
        if (counter == 0){
            System.out.println("OK");
        } else {
            System.out.println("The number of parentheses is not paired.");
        }
    }
}

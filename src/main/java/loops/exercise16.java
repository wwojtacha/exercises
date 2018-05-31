package loops;

/*

Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.
Przykład: "Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
Wynik: 6

 */


import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String inputText = sc.nextLine();
        int result = 0;
        for (int i = 0; i < inputText.length(); i++){
        char c = inputText.charAt(i);
        if(c >= 48 && c <= 57){
            result += c - 48;
        }

        }
        System.out.println("Sum of decimal integers in input text: " + result);

    }
}

package strings;

/*
14.Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy użyciu szyfru Cezara,
który jest szczególnym przypadkiem szyfru podstawieniowego monoalfabetycznego.
Użytkownik program podaje tekst do zaszyfrowania oraz liczbę n,
o którą przesunięty jest alfabet za pomocą którego szyfrujemy tekst.
Dla uproszczenia można przyjąć, że łańuch wejściowy składa się tylko z małych liter alfabetu
angielskiego, tj. ’a’ – ’z’ (26 znaków) oraz spacji.
Przykład 1.
Podaj łańcuch znaków do zaszyfrowania: abrakadabraz
Podaj przesunięcie: 2
Zaszyfrowany tekst: cdtcmcfcdtcb

Przykład 2.
Podaj łańcuch znaków do zaszyfrowania: cdtcmcfcdtcb
Podaj przesunięcie: -2
Zaszyfrowany tekst: abrakadabraz
 */

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to be ciphered: ");
        String inputText = sc.nextLine();
        System.out.println("Enter the number to move/cipher inpt text:  ");
        int n = sc.nextInt();
        String cipheredText = "";
        for (int i = 0; i < inputText.length(); i++){
            if(inputText.charAt(i) >= 122){
                cipheredText += (char)(96 + n);
            }
            cipheredText += (char)(inputText.charAt(i) + n);
        }
        System.out.println("Ciphered text is: " + cipheredText.substring(0, cipheredText.length() - 1));

    }
}

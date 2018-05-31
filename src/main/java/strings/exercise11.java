package strings;

/*
Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie tworzy łańcuch
będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.
 */

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String text = sc.nextLine();
        int index = 0;
        String reverseText = "";
        for (int i = text.length() - 1; i >= 0; i--){
            reverseText += text.charAt(i);
        }
        System.out.println("\'" + text + "\'" + " backwards is: " + reverseText + ".");
    }
}

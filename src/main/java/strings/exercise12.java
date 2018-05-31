package strings;

/*
Napisać program, który wczytuje od użytkownika ciąg znaków,
a następnie tworzy łańcuch będący odwróceniem podanego łańcucha i wyświetla go na ekranie.
Przykładowo, dla łańcucha „Kot” wynikiem powinien być łańcuch „toK”.
Użyj rekurencji !
 */

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String text = sc.nextLine();


        System.out.println(reverse(text));
    }

    private static String reverse(String text){

        if (null == text || text.length() <= 1 ){
            return text;
        }
        return reverse(text.substring(1)) + text.charAt(0);
    }
}

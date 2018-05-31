package strings;

/*
Napisać program, który wczytuje od użytkownika ciąg znaków,
a następnie wyświetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
*/

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String text = sc.nextLine();
        char last = text.charAt(text.length() - 1);
        int counter = 0;
        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) == last){
                counter++;
            }
        }
        System.out.println("Last character of " + "\"" + text + "\"" + " appears " + counter + " times.");
    }
}

package strings;

/*
 Napisz aplikację która przyjmuje od użytkownika tekst, a następnie dzieli go na poszczególne słowa.
 Następnie aplikacja zlicza ilości wystąpień słów. Np. dla tekstu

ala lubi koty, ale ala nie jest przez koty lubiana

ala - 2
lubi - 1
koty - 2
ale - 1
nie - 1
jest - 1
przez - 1
lubiana - 1
 */

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text made of few words: ");
        String text = sc.nextLine();
        String [] textArray = text.split(" ");
        for (int i = 0; i < textArray.length; i++){
        int counter = 0;
            for (int j = 0; j < textArray.length; j++){
                if (textArray[i].equals(textArray[j])){
                    counter++;
                }
            }
            System.out.println(textArray[i] + " - " + counter);
        }
    }
}

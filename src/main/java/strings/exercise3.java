package strings;

/*
Wczytaj od użytkownika jedną linię tekstu i przypisz ją do zmiennej ​text a następnie wczytaj
od użytkownika słowo i przypisz je do zmiennej ​searched​ . Następnie przeszukaj tekst w poszukiwaniu
słowa przypisanego do zmiennej ​searched​ .

 */

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text: ");
        String text = sc.nextLine();
        System.out.println("Enter a word to be searched: ");
        String searched = sc.nextLine();

        if (text.contains(searched)){
            System.out.println("Text contains word " + searched + ".");
        }else{
            System.out.println("Text does NOT contain word " + searched + ".");
        }
    }
}

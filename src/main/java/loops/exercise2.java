package loops;

/*
Napisz aplikację która przyjmuje parametr (ilość powtórzeń) ze scannera, a następnie zadaną ilość razy
wypisuje na ekran “Hello World” - pętlą for i while
 */

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of repetitions: ");
        int numberOfRepetitions = sc.nextInt();
        for (int i = 1; i <= numberOfRepetitions; i++){
            System.out.println("Hello World!");
        }
        System.out.println();

        int i = 1;
        while (i <= numberOfRepetitions){
            System.out.println("Hello World!");
            i++;
        }
    }
}

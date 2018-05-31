package loops;

/*
    Stwórz program który na wejściu przyjmuje liczbę N
    a następnie na wyjściu wypisuje tabliczkę mnożenia do tej liczny (tj. do NxN).
     */

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.println(i + " x " + number + " = " + i * number);
        }
    }
}

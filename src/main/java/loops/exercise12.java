package loops;

/*
Napisać program, który sprawdza, czy podana liczba całkowita ​N jest większa od zera,
a następnie sprawdza czy liczba jest liczbą pierwszą.
 */


import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number higher than 0: ");

        //check if input number is int
        int number = 0;
        while (!sc.hasNextInt()){
            System.out.println("Enter an integer!");
            sc.next();
            }
            number = sc.nextInt();

        while (number <= 0) {
            System.out.println("The number must be higher than 0. Try again.");
            number = sc.nextInt();
        }

        int dividersCounter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                dividersCounter++;
            }
        }
        System.out.println("Number of dividers: " + dividersCounter);

        if (dividersCounter == 2) {
            System.out.println("Number " + number + " is a prime number.");
        } else {
            System.out.println("Number " + number + " is NOT a prime number.");
        }
    }
}

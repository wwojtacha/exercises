package loops;

/*
Napisz program, który wypisuje “Hello World” dopóki użytkownik podaje liczby większe od 0.
 */

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number. Negative one or \'0\' end the application");
        int number = sc.nextInt();
        while (number > 0){
            System.out.println("Hello World!");
            number = sc.nextInt();
        }
    }
}

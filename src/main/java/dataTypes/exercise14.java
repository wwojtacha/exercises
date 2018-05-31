package dataTypes;

/*
Napisz aplikację która dla podanej wartości przez użytkownika:
a. zwraca jej wartość bezwzględną,
b. zwraca jej wartość przeciwną,
c. zwraca jej wartość odwrotną.
 */

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");


        int number = sc.nextInt();
        //a
        int absoluteValue = Math.abs(number);
        //b
        int oppositeValue = number * (-1);
        //c
        double reverseValue = 1 / (double)number; //bez rzutowania (cast) zwroci 0.0, bo number jest typem int

        System.out.println("Absolute value: " + absoluteValue);
        System.out.println("Opposite value: " + oppositeValue);
        System.out.println("Reverse value: " + reverseValue);
    }
}

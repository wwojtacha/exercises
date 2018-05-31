package loops;

/*
Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki.
Przykładowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.
 */

import java.util.Scanner;
import java.util.Arrays;

public class exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();

        //first determine array size
        int arraySize = 0;
        for(int i = number; i >= 1; i--){
            if (number % i == 0){
                arraySize++;
            }
        }

        //create and fill array
        int [] dividers = new int[arraySize];
        int index = 0;
        for (int i = 1; i <= number; i++){
            if(number % i == 0){
            dividers[index] = i;
                index++;
            }
        }
        System.out.println("Dividers of " + number + " are " + Arrays.toString(dividers));
    }
}

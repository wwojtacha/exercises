package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        String numberBinary = "";

        while (number > 0)
        {
            numberBinary = ( (number % 2 ) == 0 ? "0" : "1") + numberBinary;
            number = number / 2;
        }
        System.out.println(numberBinary);



//        int [] binaryArray = new int[32];
//        for (int i = 0; i < 32; i++){
//            binaryArray[i] = number % 2;
//            number = number / 2;
//        }
//      System.out.println(Arrays.toString(binaryArray));

    }
    }


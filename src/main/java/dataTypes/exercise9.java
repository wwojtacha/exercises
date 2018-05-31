package dataTypes;

/*
Napisać program służący do konwersji wartości temperatury podanej w stopniach Celsjusza na stopnie w skali Fahrenheita
stopnie Fahrenheita = 1.8 * stopnie Celsjusza + 32.0)
 */

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        System.out.println("Enter temperature value in Celsius degrees: ");
        Scanner sc = new Scanner(System.in);
        double tempC = sc.nextDouble();
        double tempF = (1.8 * tempC) + 32.0;

        System.out.println("Temperature " + tempC + " in Celsius degrees equals " + tempF + " in Fahrenheit degrees");

    }
}

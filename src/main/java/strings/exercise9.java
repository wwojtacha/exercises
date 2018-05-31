package strings;

/*
Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie operacji dodawania,
odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych. Program ma identykować sytuację
wprowadzenia błędnego symbolu działania oraz próbę dzielenia przez zero.
Zastosować instrukcję if else do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu
operacji. Scenariusz działania programu:
a. Program wyświetla informację o swoim przeznaczeniu.
b. Wczytuje pierwszą liczbę.
c. Wczytuje symbol operacji arytmetycznej: +, -, *, /.
d. Wczytuje drugą liczbę.
e. Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania działania.
 */

import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class exercise9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("This is a simple calculator. It adds, subtstracts, multiplies, divides two numbers.");
        System.out.println("Enter first number: ");
        String firstNumber = sc.nextLine();
        System.out.println("Enter arithmetic operator: ");
        String operator = sc.nextLine();

        System.out.println("Enter second number: ");
        String secondNumber = sc.nextLine();

        double result = 0;

        if ("+".equals(operator)){
            result = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
        } else if("-".equals(operator)){
            result = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
        } else if("*".equals(operator)){
            result = Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
        } else if("/".equals(operator)){
            if (secondNumber.equals("0")){
                throw new IllegalArgumentException("You cannot divide by 0!");
            }
                result = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
        } else {
            System.out.println("Enter proper operator: +, -, * or /");
        }
        System.out.println("Result is: " + result);
    }
}

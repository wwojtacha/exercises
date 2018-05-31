package dataTypes;

/*
Napisz aplikację która pobiera od użytkownika ​N​ a nastepnie:
a. losuje ​N ​liczb całkowitych (dowolny zakres) i wypisuje je na ekran
b. losuje ​N ​liczb zmiennoprzecinkowych i wypisuje je na ekran
c. losuje ​N​ razy wartość boolean i wypisuje je na ekran
d. pobiera kolejne dwa parametry ​poczatekZakresui ​koniecZakresui losuje ​ N liczb całkowitych z tego zakresu,
   a następnie wypisuje je na ekran
e. pobiera kolejne dwa parametry ​poczatekZakresui ​koniecZakresui losuje ​ N          liczb zmiennoprzecinkowych z tego zakresu, a następnie wypisuje je na ekran
 */

import java.util.Random;
import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 20: ");
        int n = sc.nextInt();
        Random rn = new Random();

        //a
        for (int i = 0; i < n; i++){
        int numberInt = rn.nextInt(99) + 1;
            System.out.println(numberInt);
        }
        System.out.println();
        //b
        for (int i = 0; i < n; i++){
            double numberDouble = rn.nextDouble() * 100;
            System.out.println(numberDouble);
        }
        System.out.println();
        //c
        for (int i = 0; i < n; i++){
            boolean booleanValue = rn.nextBoolean();
            System.out.println(booleanValue);
        }
        System.out.println();
        //d
        System.out.println("Enter minimum integer range value: ");
        int minInt = sc.nextInt();
        System.out.println("Enter maximum integer range value: ");
        int maxInt = sc.nextInt();

        for (int i = 0; i < n; i++){
            int numberInt2 = minInt + (int)(Math.random() * ((maxInt - minInt)));
            System.out.println(numberInt2);
        }

        System.out.println();
        //e
        System.out.println("Enter minimum double range value: ");
        double minDouble = sc.nextInt();
        System.out.println("Enter maximum double range value: ");
        double maxDouble = sc.nextInt();

        for (int i = 0; i < n; i++){
            double numberDouble2 = minDouble + (rn.nextDouble() * (maxDouble - minDouble));
            System.out.println(numberDouble2);
        }


    }

}

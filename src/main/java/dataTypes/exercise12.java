package dataTypes;

/*
(Wymaga umiejętności korzystania ze Scanner’a). Zmodyfikuj zadanie z rollercoasterem.
Pobierz parametry ​waga, ​wzrost, wiek ​od użytkownika.
Zweryfikuj poprawność danych (większe od zera itp.), a następnie sprawdź czy Twoja aplikacja działa poprawnie.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight: ");
        int weight = sc.nextInt();

        while(weight <= 0){
            System.out.println("Weight must be larger than 0. Try again.");
            weight = sc.nextInt();
        }

        System.out.println("Enter height: ");
        int height = sc.nextInt();

        while(height <= 0){
            System.out.println("Height must be larger than 0. Try again.");
            height = sc.nextInt();
        }

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        while(age <= 0){
            System.out.println("Age must be larger than 0. Try again.");
            age = sc.nextInt();
        }

        if (age < 10) {
            System.out.println("Too young");
        } else if (age > 80){
            System.out.println("Too old");
        }

        if (height < 150) {
            System.out.println("Too low");
        } else if (height > 220){
            System.out.println("Too tall");
        }

        if (weight > 180 ){
            System.out.println("Too heavy");
        }

        if (age > 10 && age < 80 && height > 150 && height < 220 && weight < 180){
            System.out.println("Ok. You can enter");
        }

    }
}


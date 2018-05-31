package loops;

import java.util.Scanner;

/*
Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B, A < B, a następnie wyznaczający
sumę ciągu liczb od A do B, czyli sumę ciągu (A,A + 1,...,B). Obliczenia należy wykonać dwukrotnie stosując
kolejno pętle: while, for.
Przykład: Dla A = 4 i B = 11 program powinien wyświetlić: 60 60
 */
public class exercise5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number as range beginning: ");
        int start = sc.nextInt();
        System.out.println("Enter the number as range end: ");
        int stop = sc.nextInt();

        while(stop <= start){
            System.out.println("Range end must be higher than range start. Try again");
            stop = sc.nextInt();
        }

        int result = 0;
        for (int i = start; i <= stop; i++){
            result += i;
        }
        System.out.println("The sum of numbers between range start and range stop is (for loop): " + result);
        System.out.println();

        int resultWhile = 0;
        while(start <= stop){
            resultWhile += start++;
            //or
            // resultWhile += start; or resultWhile = resultWhile + start;
            // start++;

        }
        System.out.println("The sum of numbers between range start and range stop is (while loop): " + resultWhile);

    }
}

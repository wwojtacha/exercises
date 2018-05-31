package loops;

/*
Napisać program w którym użytkownik podaje na początku dwie liczby:
początekZakresu ​oraz ​koniecZakresu​ . Upewnij się że ​początekZakresu < koniecZakresu ​a następnie

a. pobierz od użytkownika kolejną liczbę - ​dzielnik. Po pobraniu dzielnika wypisz wszystkie liczby
od ​początekZakresu ​do ​koniecZakresu, które są podzielne przez ​dzielnik
​
b. *pobierz od użytkownika ​iloscDzielnikow​ , a następnie wczytaj wszystkie dzielniki.
Po wczytaniu wszystkich dzielnikow wypisz wszystkie liczby od poczatekZakresu ​do ​koniecZakresu, które są podzielne
przez ​wszystkie dzielniki.
 */

import java.util.Scanner;
import java.util.Arrays;

public class exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the beginnning of number range: ");
        int rangeStart = sc.nextInt();
        System.out.println("Enter the end of number range: ");
        int rangeStop = sc.nextInt();
        while (rangeStart >= rangeStop) {
            System.out.println("The beginning of number range must be lower than the end! Try again");
            rangeStop = sc.nextInt();
        }
        //a
        System.out.println("Enter a divider: ");
        int divider = sc.nextInt();
        for (int i = rangeStart; i <= rangeStop; i++) {
            if (i % divider == 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        //b
        System.out.println("Enter the number of dividers that are to be used: ");
        int dividerAmount = sc.nextInt();
        int[] dividers = new int[dividerAmount];
        int dividerCounter = 0;
        while (dividerCounter < dividers.length) {
            System.out.println("Enter next divider: ");
            dividers[dividerCounter] = sc.nextInt();
            dividerCounter++;
        }

        //iteracja każdej liczby z zakresu przez wszystkie dzielniki
        int index = 0;
        int[] repeatedRangeNumbers = new int[(rangeStop - rangeStart) + 1];
        for (int i = rangeStart; i <= rangeStop; i++) {
            for (int j = 0; j < dividers.length; j++) {
                if (i % dividers[j] == 0) {
                    repeatedRangeNumbers[index] = i;
                }else{
                    repeatedRangeNumbers[index] = 0;
                }
            }
                index++;
        }
        //powstaje tablica z liczbami podzielnymi przez dzielniki, ale te liczby się powtarzają jeżeli dana liczba
        // jest podzielne przez więcej niż jeden dzielnik
        System.out.println("repeated unsorted: " + Arrays.toString(repeatedRangeNumbers));

        int zeroCounter = 0;
        for (int i = 0; i < repeatedRangeNumbers.length; i++) {
            if(i == repeatedRangeNumbers.length - 1){
                break;
            }
            if (repeatedRangeNumbers[i] == repeatedRangeNumbers[i + 1]) {
                repeatedRangeNumbers[i] = 0;
            }

        }
        //zliczamy ilość zer. Uznajemy, że zero nie jest brane pod uwagę.
        for (int i = 0; i < repeatedRangeNumbers.length; i++){
            if (repeatedRangeNumbers[i] == 0){
                zeroCounter++;
            }
        }

        //sortujemy żeby zera zostały na początku tablicy i żeby można było określić długośc
        //docelowej tablicy
        Arrays.sort(repeatedRangeNumbers);
        System.out.println("Repeated numbers but sorted: " + Arrays.toString(repeatedRangeNumbers));

        int unrepeatedIndex = 0;
        int[] unrepeatedRangeNumbers = new int[repeatedRangeNumbers.length - zeroCounter];
        for (int i = repeatedRangeNumbers.length - (repeatedRangeNumbers.length - zeroCounter); i < repeatedRangeNumbers.length; i++) {
            unrepeatedRangeNumbers[unrepeatedIndex] = repeatedRangeNumbers[i];
                unrepeatedIndex++;
        }

        System.out.println("Unrepeated numbers divided by all given dividers: " + Arrays.toString(unrepeatedRangeNumbers));
        }
    }


package arrays;

/*
Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie:
a. wypełnij je wartościami z przedziału -10 - 10
b. wypisz na ekranie zawartość tablicy
c. wyznacz najmniejszy oraz największy element tablicy (wypisz je)
d. wypisz średnią arytmetyczną tablicy (*spróbuj zrobić to samo z tablicą liczb zmiennoprzecinkowych)
e. wypisz ilość elementów większych/mniejszych od średniej
f. wyznacz medianę
g. wypisz tablicę w odwrotnej kolejności
Przykład:
Wylosowane liczby: -3 9 2 -10 -3 -4 -1 -5 -10 8
Min: -10, max: 9
Średnia: -1,00
Mniejszych od śr.: 6
Większych od śr.: 3
Liczby w odwrotnej kolejności: 8 -10 -5 -1 -4 -3 -10 2 9 -3
 */

import java.util.Random;
import java.util.Arrays;

public class exercise1 {
    public static void main(String[] args) {

        //a
        //Random rn = new Random();
        int [] initialArray = new int[10];
        for (int i = 0; i < initialArray.length; i++){
            int min = -10;
            int max = 10;
            initialArray[i] = min + (int)(Math.random() * (max - min));
        }

        //b
        System.out.println(Arrays.toString(initialArray));

        //c
        int minElement = initialArray[0];
        int maxElement = initialArray[0];
        for (int i = 0; i < initialArray.length; i++){

            if (initialArray[i] < minElement) { //min element
                minElement = initialArray[i];
            }
            if (initialArray[i] > maxElement){ //max element
                maxElement = initialArray[i];
            }
        }
        System.out.println("Min element is: " + minElement);
        System.out.println("Max element is: " + maxElement);

        //d
        int sum = 0;
        for (int i = 0; i < initialArray.length; i++){
            sum += initialArray[i];
        }
        int averageInt = sum / initialArray.length;
        double averageDouble = (double) sum / initialArray.length;
        System.out.println("Arithmetic int average is: " + averageInt);
        System.out.println("Arithmetic double average is: " + averageDouble);

        //e
        int counterLess = 0;
        int counterMore = 0;
        for (int i = 0; i < initialArray.length; i++){
            if (initialArray[i] < averageDouble){
                counterLess++;
            }else if (initialArray[i] > averageDouble){
                counterMore++;
            }
        }
        System.out.println("Number of elements lower than average: " + counterLess);
        System.out.println("Number of elements higher than average: " + counterMore);

        //f
        int [] initialArraySorted = new int[10];
        for (int i = 0; i < initialArraySorted.length; i++){
            initialArraySorted[i] = initialArray[i];
        }
        Arrays.sort(initialArraySorted);
        System.out.println("Sorted array: " + Arrays.toString(initialArraySorted));
        double median = (initialArraySorted[initialArraySorted.length / 2] + initialArraySorted[(initialArraySorted.length / 2) - 1]) / 2;
        System.out.println("Median is equal to : " + median);

        //g
        int index = 0;
        int [] reverseIniitialArray = new int [10];
        for (int i = initialArray.length - 1; i >= 0; i--){
            reverseIniitialArray[index] = initialArray[i];
            index++;
        }
        System.out.println("Reverse order of initial array: " + Arrays.toString(reverseIniitialArray));
    }
}

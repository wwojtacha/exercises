package arrays;

import java.util.Random;
import java.util.Arrays;

/*
Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10
a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza się w tablicy.
Przykład:
   Wylosowane liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
   Wystąpienia: 1 - 1
                2 - 1
                3 - 3
                4 - 3
                5 - 3
                6 - 4
                7 - 1
                8 - 2
                9 - 0
                10 - 2
 */
public class exercise2 {
    public static void main(String[] args) {
        int [] randomArray = new int[20];
        Random rn = new Random();
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = rn.nextInt(9) + 1;
        }
        System.out.println(Arrays.toString(randomArray));

        for (int i = 1; i <= 10; i++ ){
            int counter = 0;
            for (int j = 0; j < 20; j++){
                if (i == randomArray[j]){
                    counter++;
                }
            }
            System.out.println(i + " - " + counter);
        }
        System.out.println();
        System.out.println("Sposób z tablicą kubełkową");
        System.out.println();
        //sposób z tablicą kubełkową
        int [] counters = new int[]{0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < 20; i++){
            counters[randomArray[i] - 1]++;
        }

        for (int i = 0; i < 10; i++){
            System.out.println(i+1 + " - " + counters[i]);
        }
    }
}

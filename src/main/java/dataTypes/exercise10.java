package dataTypes;

/*
Zadeklaruj trzy zmienne (liczby).
Wypisz na ekran wszystkie z nich, a następnie wypisz na ekran największą oraz najmniejszą z nich.
 */

public class exercise10 {
    public static void main(String[] args) {
        int a = 5251;
        int b = 35;
        int c = -40555;

        int min = 0;
        int max = 0;

        if (a > b && a > c){
            max = a;
        }else if(b > a && b > c){
            max = b;
        }else{
            max = c;
        }

        if (a < b && a < c){
            min = a;
        }else if(b < a && b < c){
            min = b;
        }else{
            min = c;
        }

        System.out.println("Min value is: " + min);
        System.out.println("Max value is: " + max);
    }
}

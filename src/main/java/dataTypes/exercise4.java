package dataTypes;

/*
Zadeklaruj 3 zmienne
 - zmienna 'a',
 - zmienna 'b',
 - zmienna 'c'.
 Przypisz jej 3 wartości, ważne żeby były różne. Następnie wykonaj na nich następujące działania:
 a) przypisz wartości - do zmiennej 'a' przypisz wartość 'b', do zmiennej 'b' przypisz wartość 'c', do zmiennej 'c' przypisz wartość 'a'.
 b) wypisz wartości na ekran.
 */

public class exercise4 {
    public static void main(String[] args) {

        int a, b, c;
        a = 4;
        b = 6;
        c = 10;

        a = b;
        b = c;
        c = a;

        System.out.println(a); //6
        System.out.println(b); //10
        System.out.println(c); //6
    }
}

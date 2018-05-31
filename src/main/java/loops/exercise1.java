package loops;

/*
 Napisz aplikację która wypisuje:
 a. liczby z zakresu 1 - 100 w nowych liniach
 b. liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją
 c. liczby podzielne przez 5 z zakresu -30 - 100 w nowych liniach
 d. liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
 e. liczby podzielne przez 3, 5 z zakresu 30 - 300 w nowych liniach
 f. liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
 g. liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami
 h. litery od 'a' do 'z'
 i. litery od ‘A’ do ‘Z’
 j. litery od ‘A’ do ‘Z’, tylko co drugą
 k. litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest podzielny przez 5
 l. ‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer wypisania) np.
1. Hello World
2. Hello World
3. Hello World
4. ….
Całą aplikację (wszystkie podpunkty) zrealizuj pętlą for ORAZ pętlą while.
 */

public class exercise1 {
    public static void main(String[] args) {
    //a
        for (int i = 1; i <= 100; i++){
            System.out.println(i);
        }
        int n = 1;
        while (n <= 100){
            System.out.println(n);
            n++;
        }

        //b
        for (int i = 1000; i <= 1020; i++){
            System.out.printf(i + ", ");
        }

        System.out.println();

        int m = 1000;
        while (m <= 1020){
            System.out.printf(m + ", ");
            m++;
        }

        System.out.println();

        //c
        for (int i = -30; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

            int o = -30;
            while(o <= 100){
            if (o % 5 == 0){
                System.out.println(o);
            }
            o++;
            }

            //d
        for (int i = 1; i <= 100; i++){
                if (i % 3 == 0){
                    System.out.println(i);
                }
        }

        int p = 1;
        while (p <= 100) {
            if (p % 3 == 0) {
                System.out.println(p);
            }
            p++;
        }
        //e
    for (int i = 30; i <= 300; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
    }

        int q = 30;
        while(q <= 300){
            if (q % 3 == 0 && q % 5 == 0){
                System.out.println(q);
            }
            q++;
        }

        //f
        for (int i = -300; i <= 300; i++){
            if (i % 2 != 0){
                System.out.printf(i + ";");
            }
        }

        System.out.println();

        int r = -300;
        while(r <= 300){
            if (r % 2 != 0){
                System.out.printf(r + ";");
            }
            r++;
        }
        System.out.println();
        //g
        for (int i = -100; i <= 100; i++){
            if (i % 2 == 0){
                System.out.printf(i + ";");
            }
        }
        System.out.println();

        int s = -100;
        while(s <= 100){
            if (s% 2 == 0){
                System.out.printf(s + ";");
            }
            s++;
        }
        System.out.println();
        //h

        for (char i = 'a'; i <= 'z'; i++ ){
            System.out.println(i);
        }
        System.out.println();

        char letterSmallCase = 'a';
        while (letterSmallCase <= 'z'){
            System.out.println(letterSmallCase);
            letterSmallCase++;
        }

        System.out.println();
        //i
        for (char i ='A'; i <= 'Z'; i++){
            System.out.println(i);
        }
        System.out.println();

        char letterCapitalCase = 'A';
        while(letterCapitalCase <= 'Z'){
            System.out.println(letterCapitalCase++);
        }

        System.out.println();

        //j

        for (char i ='A'; i <= 'Z'; i += 2){
            System.out.println(i);
        }
        System.out.println();

        char letterEachSecondOne = 'A';
        while(letterEachSecondOne <= 'Z'){
            System.out.println(letterEachSecondOne);
            letterEachSecondOne += 2;
        }

        System.out.println();
        //k

        for (char i ='b'; i <= 'z'; i += 2){
            if(i % 5 == 0){
            System.out.println(i);
            }
        }
        System.out.println();

        char letterEachSecondOneDividedBy5 = 'b';
        while(letterEachSecondOneDividedBy5 <= 'z'){
            if(letterEachSecondOneDividedBy5 % 5 == 0){
            System.out.println(letterEachSecondOneDividedBy5);
            }
            letterEachSecondOneDividedBy5 += 2;
        }

        System.out.println();
        for (int i = 1; i <= 100; i++){
            System.out.println(i + ". Hello World!");
        }

        System.out.println();

        int helloWorld = 1;
        while (helloWorld <= 100){
            System.out.println(helloWorld++ + ". Hello World!");
        }

        }
    }



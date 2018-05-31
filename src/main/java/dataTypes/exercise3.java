package dataTypes;


/*
3. Wypisz na ekran wartości poniższych wyrażeń logicznych
 a. false == false
 b. false != true
 c. !true
 d. 2 > 4
 e. 3 < 5
 f. 3 == 3 && 3 == 4
 g. 3 != 5 || 3 == 5
 h. (2+4) > (1+3)
 i. “cos”.equals(“cos”);
 j. “cos” == “cos”;
 */
public class exercise3 {
    public static void main(String[] args) {
        //a
        System.out.println(false == false); //true
        //b
        System.out.println(false != false); //false
        //c
        System.out.println(!true); //false
        //d
        System.out.println(2 > 4); // false
        //e
        System.out.println(3 < 5); // true
        //f
        System.out.println(3 == 3 && 3 == 4); //false
        //g
        System.out.println(3 != 5 || 3 == 5); // true
        //h
        System.out.println((2 + 4) > (1 + 3)); //true
        //i
        System.out.println("cos".equals("cos")); //true
        //j
        System.out.println("cos" == "cos"); //true

    }
}
